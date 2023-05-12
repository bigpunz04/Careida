package rpunzalan.careida.entity;

import jakarta.annotation.Resource;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Builder
public class RideEvent extends CareEvent{

    private transient Facility facility;
    private boolean roundTrip;
    @Lob
    @Column(columnDefinition = "longtext")
    private String notes;

    public RideEvent(boolean roundTrip, String notes) {
        this.roundTrip = roundTrip;
        this.notes = notes;
    }

    public RideEvent(Facility facility, boolean roundTrip, String notes) {
        this.facility = facility;
        this.roundTrip = roundTrip;
        this.notes = notes;
    }

    public RideEvent(CareEventType type, Member createdBy, Member createdFor, LocalDateTime createdOn, LocalDateTime updatedOn, Facility facility, boolean roundTrip, String notes) {
        super(type, createdBy, createdFor, createdOn, updatedOn);
        this.facility = facility;
        this.roundTrip = roundTrip;
        this.notes = notes;
    }

}
