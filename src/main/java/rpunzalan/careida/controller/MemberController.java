package rpunzalan.careida.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import rpunzalan.careida.dto.MemberDto;
import rpunzalan.careida.service.MemberService;

import java.util.List;

@Controller
public class MemberController {

    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    @GetMapping("/admin/members")
    public String getMembers(Model model){

        List<MemberDto> memberDtoList = memberService.getAllMembers();
        model.addAttribute("membersList", memberDtoList);

        return "/admin/members";

    }

    @GetMapping("/admin/members/newmember")
    public String newMember(Model model){
        MemberDto memberDto = new MemberDto();
        model.addAttribute("memberObj", memberDto);
        return "admin/create_member";
    }

    //method to handle form submit request for new member
    @PostMapping("/admin/members")
    public String createMember(@ModelAttribute MemberDto memberDto){
        memberService.createMember(memberDto);
        return "redirect:/admin/members";
    }
}
