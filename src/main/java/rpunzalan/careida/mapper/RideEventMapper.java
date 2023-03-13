package rpunzalan.careida.mapper;

import rpunzalan.careida.dto.RideEventDto;
import rpunzalan.careida.entity.RideEvent;

public class RideEventMapper {

    public RideEventDto mapToRideEventDto(RideEvent rideEvent){
        return RideEventDto.builder()
                .roundTrip(rideEvent.isRoundTrip())
                .notes(rideEvent.getNotes())
                .build();
    }

    public RideEvent mapToRideEvent(RideEventDto rideEventDto){
        return RideEvent.builder()
                .roundTrip(rideEventDto.isRoundTrip())
                .notes(rideEventDto.getNotes())
                .build();
    }
}
