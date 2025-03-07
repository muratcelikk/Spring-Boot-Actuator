package com.actuator;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;

import java.util.HashMap;
import java.util.Map;

public class CustomInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        Map<String, String> customInfo = new HashMap<>();
        customInfo.put("app.version", "1.0.0");
        customInfo.put("app.description", "My custom Spring Boot application");
        builder.withDetail("custom", customInfo);
    }
}
