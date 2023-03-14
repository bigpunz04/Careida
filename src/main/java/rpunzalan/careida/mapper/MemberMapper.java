package rpunzalan.careida.mapper;

import rpunzalan.careida.dto.MemberDto;
import rpunzalan.careida.entity.Member;

public class MemberMapper {

    public static MemberDto mapToMemberDto(Member member){
        return MemberDto.builder()
                .id(member.getId())
                .firstName(member.getFirstName())
                .lastName(member.getLastName())
                .role(member.getRole())
                .email(member.getEmail())
                .phone(member.getPhone())
                .birthday(member.getBirthday())
                .createdOn(member.getCreateOn())
                .build();
    }

    public static Member mapToMember(MemberDto memberDto){
        return Member.builder()
                .id(memberDto.getId())
                .firstName(memberDto.getFirstName())
                .lastName(memberDto.getLastName())
                .role(memberDto.getRole())
                .email(memberDto.getEmail())
                .phone(memberDto.getPhone())
                .birthday(memberDto.getBirthday())
                .createOn(memberDto.getCreatedOn())
                .build();
    }
}
