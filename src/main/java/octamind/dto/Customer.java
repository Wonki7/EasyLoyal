package octamind.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private UUID customerId;
    private String name;
    private String lastName;
    private String phoneNumber;
    private LocalDateTime createDate;
    private ClientMode clientMode;
    private Integer balance;
}
