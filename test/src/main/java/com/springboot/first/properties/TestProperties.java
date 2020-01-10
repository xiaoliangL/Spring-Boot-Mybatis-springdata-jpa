package com.springboot.first.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Date: 2020-01-09-09-47
 * Module:
 * Description:
 *
 * @author:
 */
@Data
@Component
@Configuration
@ConfigurationProperties(prefix = "test")
public class TestProperties {
    private SwaggerProperties swagger = new SwaggerProperties();
}
