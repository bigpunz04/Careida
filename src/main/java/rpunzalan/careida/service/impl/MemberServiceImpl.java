package rpunzalan.careida.service.impl;

import org.springframework.stereotype.Service;
import rpunzalan.careida.dto.MemberDto;
import rpunzalan.careida.entity.Member;
import rpunzalan.careida.mapper.MemberMapper;
import rpunzalan.careida.repository.MemberRepository;
import rpunzalan.careida.service.MemberService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void createMember(MemberDto memberDto) {
        if(memberDto.getCreatedOn() == null){
            LocalDateTime now = LocalDateTime.now();
            memberDto.setCreatedOn(now);
        }
        Member member = MemberMapper.mapToMember(memberDto);
        memberRepository.save(member);
    }

    @Override
    public List<MemberDto> getMembers(String memberType) {
        List<Member> members = memberRepository.findAll();

       List<MemberDto> filteredMemberList =
               members
                       .stream()
                       .filter(member -> member.getRole().equalsIgnoreCase(memberType))
                       .map(MemberMapper :: mapToMemberDto)
                       .collect(Collectors.toList());

        return filteredMemberList;
    }

    @Override
    public List<MemberDto> getAllMembers() {
        List<Member> members = memberRepository.findAll();

        return members
                .stream()
                .map(MemberMapper :: mapToMemberDto)
                .collect(Collectors.toList());
    }

}
