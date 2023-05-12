package rpunzalan.careida.service;

import rpunzalan.careida.dto.MemberDto;

import java.util.List;

public interface MemberService {

    void createMember(MemberDto memberDto);
    List<MemberDto> getMembers(String memberType);

    List<MemberDto> getAllMembers();
}
