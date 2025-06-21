package octamind.controller;

import lombok.extern.slf4j.Slf4j;
import octamind.dto.*;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("${server.employee.contextPath}")
public class EmployeeController {

    @PostMapping("/api/auth/company")
    public EmployeeAuthResponse logInByEmployee (EmployeeAuthRequest employeeAuthRequest){
        log.info("logInByEmployee by EmployeeAuthRequest: {}", employeeAuthRequest);
        return null;
    }

    @PostMapping("/api/loyalty/qr_generate")
    public EmployeeAuthQRResponse responseQR (EmployeeAuthQRRequest employeeAuthQRRequest){
        log.info("responseQR by EmployeeAuthQRRequest: {}", employeeAuthQRRequest);
        return null;
    }

    @GetMapping("/api/auth/customer/info")
    public CustomerInfoResponse getCustomerInfo (String customerId){
        log.info("getCustomerInfo by customer ID: {}", customerId);
        return null;
    }

    @GetMapping("/api/analytics/activity")
    public AnalyticsActivityResponse getAnalyticsActivity (String customerId){
        log.info("getAnalyticsActivity by customer ID: {}", customerId);
        return null;
    }

    @GetMapping("/api/analytics/overview")
    public AnalyticsOverviewResponse getAnalyticsOverview (){
        log.info("getAnalyticsOverview");
        return null;
    }


    @PutMapping("/api/loyalty/settings/set")
    public String setLoyaltySettings (LoyaltySettingsRequest loyaltySettingsRequest){
        log.info("setLoyaltySettings by LoyaltySettingsRequest: {}", loyaltySettingsRequest);
        return "/api/auth/customer/info";
    }

    @GetMapping("/api/loyalty/settings/overview")
    public LoyaltySettingsResponse getLoyaltySettingsOverview (){
        log.info("getLoyaltySettingsOverview LoyaltySettingsOverview");
        return null;
    }
}
