package com.spring.demo.configProperties;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "duyquyen")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Primary
public class DemoAppProperties {
    private String email;

    private String phone;

    private List<String> authors;

    private Map<String, String> exampleMap;

}
