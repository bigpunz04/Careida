package rpunzalan.careida.service.impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
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
import rpunzalan.careida.repository.*;

import rpunzalan.careida.service.CareEventService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CareEventServiceImpl implements CareEventService {

    private final RideEventRepository rideEventRepository;
    private final SupplyPickupEventRepository supplyPickupEventRepository;
    private final MemberRepository memberRepository;

    public CareEventServiceImpl(RideEventRepository rideEventRepository, SupplyPickupEventRepository supplyPickupEventRepository, MemberRepository memberRepository) {
        this.rideEventRepository = rideEventRepository;
        this.supplyPickupEventRepository = supplyPickupEventRepository;
        this.memberRepository = memberRepository;
    }

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

    @Override
    public void createEvent(RideEventDto rideEventDto) {
        rideEventRepository.save(RideEventMapper.mapToRideEvent(rideEventDto));
    }

    @Override
    public void createEvent(SupplyPickupEventDto supplyPickupEventDto) {
        supplyPickupEventRepository.save(SupplyPickupEventMapper.mapToSupplyPickupEvent(supplyPickupEventDto));
    }

}
