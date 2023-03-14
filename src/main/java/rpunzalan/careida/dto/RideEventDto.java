package rpunzalan.careida.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import lombok.*;
import rpunzalan.careida.entity.CareEventType;
import rpunzalan.careida.entity.Member;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RideEventDto extends CareEventDto {
    private boolean roundTrip;
    private String notes;

}
