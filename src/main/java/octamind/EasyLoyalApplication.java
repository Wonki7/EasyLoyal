package octamind;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasyLoyalApplication {

    private static final Logger log = LoggerFactory.getLogger(EasyLoyalApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EasyLoyalApplication.class, args);
        Runtime runtime = Runtime.getRuntime();
        final int MB = 1024 * 1024;
        log.info("Memory used: {}MB", (runtime.totalMemory() - runtime.freeMemory()) / MB);
    }
}
