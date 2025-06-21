package octamind.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnalyticsOverviewResponse {

    private LocalDate operDay;
    private Integer clientAmount;
    private Integer activeClients;
    private Integer pointsAdded;
    private Integer pointsSpended;
}
