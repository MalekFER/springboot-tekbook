package tn.tekup.devsecops;

import java.time.Instant;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public Map<String, Object> hello() {
        return Map.of(
            "message", "Hello from TEK-UP DevSecOps Lab 07",
            "status", "running",
            "timestamp", Instant.now().toString()
        );
    }
}
