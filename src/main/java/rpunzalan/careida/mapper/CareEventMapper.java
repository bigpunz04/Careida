package rpunzalan.careida.mapper;

import rpunzalan.careida.dto.CareEventDto;
import rpunzalan.careida.entity.CareEvent;

public class CareEventMapper {

    public CareEventDto mapToCareEventDto(CareEvent careEvent){

        return CareEventDto.builder()
                .id(careEvent.getId())
                .type(careEvent.getType())
                .createdBy(careEvent.getCreatedBy())
                .createdFor(careEvent.getCreatedFor())
                .createdOn(careEvent.getCreatedOn())
                .updatedOn(careEvent.getUpdatedOn())
                .build();
    }

    public CareEvent mapToCareEvent(CareEventDto careEventDto){
        return CareEvent.builder()
                .id(careEventDto.getId())
                .type(careEventDto.getType())
                .createdBy(careEventDto.getCreatedBy())
                .createdFor(careEventDto.getCreatedFor())
                .createdOn(careEventDto.getCreatedOn())
                .updatedOn(careEventDto.getUpdatedOn())
                .build();
    }
}
