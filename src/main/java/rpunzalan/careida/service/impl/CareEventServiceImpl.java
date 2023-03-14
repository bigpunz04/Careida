package rpunzalan.careida.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import rpunzalan.careida.dto.CareEventDto;
import rpunzalan.careida.dto.MemberDto;
import rpunzalan.careida.dto.RideEventDto;
import rpunzalan.careida.dto.SupplyPickupEventDto;
import rpunzalan.careida.entity.CareEvent;
import rpunzalan.careida.entity.Member;
import rpunzalan.careida.entity.RideEvent;
import rpunzalan.careida.entity.SupplyPickupEvent;
import rpunzalan.careida.mapper.MemberMapper;
import rpunzalan.careida.mapper.RideEventMapper;
import rpunzalan.careida.mapper.SupplyPickupEventMapper;
import rpunzalan.careida.repository.CareEventRepository;
import rpunzalan.careida.repository.MemberRepository;
import rpunzalan.careida.repository.RideEventRepository;
import rpunzalan.careida.repository.SupplyPickupEventRepository;
import rpunzalan.careida.service.CareEventService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CareEventServiceImpl implements CareEventService {

    private RideEventRepository rideEventRepository;
    private SupplyPickupEventRepository supplyPickupEventRepository;
    private MemberRepository memberRepository;

    @Override
    public List<RideEventDto> findAllRideEventDtos() {
        List<RideEvent> rideEvent = rideEventRepository.findAll();

        return rideEvent.stream().map((rides) -> RideEventMapper.mapToRideEventDto(rides)).collect(Collectors.toList());

    }

    @Override
    public List<SupplyPickupEventDto> findAllSupplyPickupEventDtos() {
        List<SupplyPickupEvent> supplyPickupEvent = supplyPickupEventRepository.findAll();

        return supplyPickupEvent.stream().map((pickupEvents) -> SupplyPickupEventMapper.mapToSupplyPickupEventDto(pickupEvents)).collect(Collectors.toList());

    }

    @Override
    public List<MemberDto> findAllMemberDtos() {
        List<Member> members = memberRepository.findAll();

        return members.stream().map((allMembers) -> MemberMapper.mapToMemberDto(allMembers)).collect(Collectors.toList());
    }

}
