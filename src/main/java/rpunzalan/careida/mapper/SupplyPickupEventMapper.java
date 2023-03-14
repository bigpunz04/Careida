package rpunzalan.careida.mapper;

import rpunzalan.careida.dto.SupplyPickupEventDto;
import rpunzalan.careida.entity.SupplyPickupEvent;

public class SupplyPickupEventMapper {

    public static SupplyPickupEventDto mapToSupplyPickupEventDto(SupplyPickupEvent supplyPickupEvent){
        SupplyPickupEventDto supplyPickupEventDto = new SupplyPickupEventDto();

        supplyPickupEventDto.setId(supplyPickupEvent.getId());
        supplyPickupEventDto.setType(supplyPickupEvent.getType());
        supplyPickupEventDto.setCreatedBy(supplyPickupEvent.getCreatedBy());
        supplyPickupEventDto.setCreatedOn(supplyPickupEvent.getCreatedOn());
        supplyPickupEventDto.setCreatedFor(supplyPickupEvent.getCreatedFor());
        supplyPickupEventDto.setUpdatedOn(supplyPickupEvent.getUpdatedOn());
        supplyPickupEventDto.setNotes(supplyPickupEvent.getNotes());
        supplyPickupEventDto.setShoppingList(supplyPickupEvent.getShoppingList());

        return supplyPickupEventDto;
    }

    public static SupplyPickupEvent mapToSupplyPickupEvent(SupplyPickupEventDto supplyPickupEventDto){
        SupplyPickupEvent supplyPickupEvent = new SupplyPickupEvent();

        supplyPickupEvent.setId(supplyPickupEventDto.getId());
        supplyPickupEvent.setType(supplyPickupEventDto.getType());
        supplyPickupEvent.setCreatedBy(supplyPickupEvent.getCreatedBy());
        supplyPickupEvent.setCreatedFor(supplyPickupEventDto.getCreatedFor());
        supplyPickupEvent.setCreatedOn(supplyPickupEventDto.getCreatedOn());
        supplyPickupEvent.setUpdatedOn(supplyPickupEventDto.getUpdatedOn());
        supplyPickupEvent.setNotes(supplyPickupEventDto.getNotes());
        supplyPickupEvent.setShoppingList(supplyPickupEventDto.getShoppingList());

        return supplyPickupEvent;
    }
}
