package rpunzalan.careida.mapper;

import rpunzalan.careida.dto.RideEventDto;
import rpunzalan.careida.entity.RideEvent;

public class RideEventMapper {

    public static RideEventDto mapToRideEventDto(RideEvent rideEvent){
        RideEventDto rideEventDto = new RideEventDto();

        rideEventDto.setId(rideEvent.getId());
        rideEventDto.setType(rideEvent.getType());
        rideEventDto.setCreatedBy(rideEvent.getCreatedBy());
        rideEventDto.setCreatedFor(rideEvent.getCreatedFor());
        rideEventDto.setCreatedOn(rideEvent.getCreatedOn());
        rideEventDto.setUpdatedOn(rideEvent.getUpdatedOn());
        rideEventDto.setNotes(rideEvent.getNotes());
        rideEventDto.setRoundTrip(rideEvent.isRoundTrip());

        return rideEventDto;
    }

    public static RideEvent mapToRideEvent(RideEventDto rideEventDto){

        RideEvent rideEvent = new RideEvent();

        rideEvent.setId(rideEventDto.getId());
        rideEvent.setType(rideEventDto.getType());
        rideEvent.setCreatedBy(rideEventDto.getCreatedBy());
        rideEvent.setCreatedFor(rideEventDto.getCreatedFor());
        rideEvent.setCreatedOn(rideEventDto.getCreatedOn());
        rideEvent.setUpdatedOn(rideEventDto.getUpdatedOn());
        rideEvent.setNotes(rideEventDto.getNotes());
        rideEvent.setRoundTrip(rideEventDto.isRoundTrip());

        return rideEvent;
    }
}
