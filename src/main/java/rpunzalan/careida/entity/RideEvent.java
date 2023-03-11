package rpunzalan.careida.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class RideEvent extends CareEvent{

    private boolean roundTrip;
    private String notes;

    public RideEvent(boolean roundTrip, String notes) {
        this.roundTrip = roundTrip;
        this.notes = notes;
    }

    public RideEvent(CareEventType type, Long createdBy, Long createdFor, LocalDateTime createdOn, LocalDateTime updatedOn, boolean roundTrip, String notes) {
        super(type, createdBy, createdFor, createdOn, updatedOn);
        this.roundTrip = roundTrip;
        this.notes = notes;
    }
}
