package rpunzalan.careida.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SupplyPickupEventDto {
    private List<String> shoppingList;
    private String notes;
}
