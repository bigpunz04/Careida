package rpunzalan.careida.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import rpunzalan.careida.entity.CareEventType;
import rpunzalan.careida.entity.Member;

import java.time.LocalDateTime;

@Data
@Builder
public class CareEventDto {
    private Long id;
    private CareEventType type;
    private Member createdBy;
    private Member createdFor;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}
