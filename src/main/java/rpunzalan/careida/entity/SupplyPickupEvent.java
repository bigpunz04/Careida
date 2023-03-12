package rpunzalan.careida.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class SupplyPickupEvent extends CareEvent{

    private List<String> shoppingList;
    private String notes;

    public SupplyPickupEvent(List<String> shoppingList, String notes) {
        this.shoppingList = shoppingList;
        this.notes = notes;
    }

    public SupplyPickupEvent(CareEventType type, Long createdBy, Long createdFor, LocalDateTime createdOn, LocalDateTime updatedOn, List<String> shoppingList, String notes) {
        super(type, createdBy, createdFor, createdOn, updatedOn);
        this.shoppingList = shoppingList;
        this.notes = notes;
    }
}
