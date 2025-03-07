package com.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;


public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        boolean healthy = checkCustomHealt();
        if (healthy) {
            return Health.up().withDetail("message", "Health up").build();
        } else {
            return Health.down().withDetail("message", "Health down").build();
        }
    }

    private boolean checkCustomHealt() {
        return true;
    }
}
