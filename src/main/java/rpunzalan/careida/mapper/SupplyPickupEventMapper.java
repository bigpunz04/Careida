package rpunzalan.careida.mapper;

import rpunzalan.careida.dto.SupplyPickupEventDto;
import rpunzalan.careida.entity.SupplyPickupEvent;

public class SupplyPickupEventMapper {

    public SupplyPickupEventDto mapToSupplyPickupEventDto(SupplyPickupEvent supplyPickupEvent){
        return SupplyPickupEventDto.builder()
                .shoppingList(supplyPickupEvent.getShoppingList())
                .notes(supplyPickupEvent.getNotes())
                .build();
    }
}
