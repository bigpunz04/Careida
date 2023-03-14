package rpunzalan.careida.service;

import rpunzalan.careida.dto.CareEventDto;
import rpunzalan.careida.dto.MemberDto;
import rpunzalan.careida.dto.RideEventDto;
import rpunzalan.careida.dto.SupplyPickupEventDto;
import rpunzalan.careida.entity.SupplyPickupEvent;

import java.util.List;

public interface CareEventService {

    List<RideEventDto> findAllRideEventDtos();
    List<SupplyPickupEventDto> findAllSupplyPickupEventDtos();
    List<MemberDto> findAllMemberDtos();

}
