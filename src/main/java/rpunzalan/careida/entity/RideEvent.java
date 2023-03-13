package rpunzalan.careida.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Builder
public class RideEvent extends CareEvent{

    private boolean roundTrip;
    @Lob
    @Column(columnDefinition = "longtext")
    private String notes;

    public RideEvent(boolean roundTrip, String notes) {
        this.roundTrip = roundTrip;
        this.notes = notes;
    }

    public RideEvent(CareEventType type, Member createdBy, Member createdFor, LocalDateTime createdOn, LocalDateTime updatedOn, boolean roundTrip, String notes) {
        super(type, createdBy, createdFor, createdOn, updatedOn);
        this.roundTrip = roundTrip;
        this.notes = notes;
    }
}
