package rpunzalan.careida.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RideEventDto {
    private boolean roundTrip;
    private String notes;
}
