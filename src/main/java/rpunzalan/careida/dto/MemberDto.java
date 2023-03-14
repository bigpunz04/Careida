package rpunzalan.careida.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
public class MemberDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Date birthday;
    private String role;
    private LocalDateTime createdOn;

}
