package rpunzalan.careida.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import rpunzalan.careida.dto.MemberDto;
import rpunzalan.careida.dto.RideEventDto;
import rpunzalan.careida.dto.SupplyPickupEventDto;
import rpunzalan.careida.service.CareEventService;
import rpunzalan.careida.service.MemberService;

import java.util.List;

@Controller
@AllArgsConstructor
public class CareEventController {
    private CareEventService careEventService;
    private MemberService memberService;

    //handler method Get all events
    @GetMapping("/admin/events")
    public String careEventList(Model model){
        List<RideEventDto> rideEventDtoList = careEventService.findAllRideEventDtos();
        List<SupplyPickupEventDto> supplyPickupEventList = careEventService.findAllSupplyPickupEventDtos();

        model.addAttribute("rideEvents", rideEventDtoList);


        return "/admin/events";
    }

    //handler method for new event form
    @GetMapping("/admin/events/newevent")
    public String newEvent(Model model){

        RideEventDto rideEventDto = new RideEventDto();
        SupplyPickupEventDto supplyPickupEventDto = new SupplyPickupEventDto();

        List<MemberDto> patients = memberService.getMembers("Patient");
        List<MemberDto> careGivers = memberService.getAllMembers();

        model.addAttribute("patientList", patients);
        model.addAttribute("caregiverList", careGivers);
        model.addAttribute("rideEvent", rideEventDto);
        model.addAttribute("supplyEvent", supplyPickupEventDto);

        return "admin/create_event";
    }

   /* @PostMapping("/admin/events/{eventTypeDropDown}")
    public String createNewEvent(@ModelAttribute MemberDto memberDto){


        return "redirect:/admin/events";

    }*/



}
