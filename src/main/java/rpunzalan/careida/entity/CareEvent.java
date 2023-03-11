package rpunzalan.careida.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;


@NoArgsConstructor
@Setter
@Getter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class CareEvent {

    @Id
    @GeneratedValue
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private CareEventType type;
    private Long createdBy;
    private Long createdFor;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

    public CareEvent(CareEventType type, Long createdBy, Long createdFor, LocalDateTime createdOn, LocalDateTime updatedOn) {
        this.type = type;
        this.createdBy = createdBy;
        this.createdFor = createdFor;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }
}
