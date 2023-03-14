package rpunzalan.careida.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "CAREEVENTS", schema = "careida")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class CareEvent { //made this class abstract - cannot create an instance of it.

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private CareEventType type;
    private Member createdBy;
    private Member createdFor;
    @CreationTimestamp
    private LocalDateTime createdOn;
    @UpdateTimestamp
    private LocalDateTime updatedOn;


    public CareEvent(CareEventType type, Member createdBy, Member createdFor, LocalDateTime createdOn, LocalDateTime updatedOn) {
        this.type = type;
        this.createdBy = createdBy;
        this.createdFor = createdFor;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }
}
