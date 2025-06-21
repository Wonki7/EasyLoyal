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
public class CustomerTransaction {

    private UUID customerId;
    private LocalDateTime operDay;
    private Action action;
    private Integer sum;

}
