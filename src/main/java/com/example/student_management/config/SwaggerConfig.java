package com.example.student_management.config;

import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for Swagger/OpenAPI documentation.
 * This class configures the OpenAPI documentation with details about the API.
 * 
 * Note: This class requires the springdoc-openapi dependency to be properly resolved.
 * If you encounter issues with imports, make sure the dependency is correctly added to the pom.xml file.
 * 
 * The commented code below shows how to configure Swagger once the dependency is properly resolved:
 * 
 * <pre>
 * import io.swagger.v3.oas.models.OpenAPI;
 * import io.swagger.v3.oas.models.info.Info;
 * import io.swagger.v3.oas.models.info.License;
 * import org.springframework.context.annotation.Bean;
 * 
 * @Bean
 * public OpenAPI customOpenAPI() {
 *     return new OpenAPI()
 *             .info(new Info()
 *                     .title("Student Management API")
 *                     .version("1.0")
 *                     .description("API for managing students in a school system")
 *                     .termsOfService("http://swagger.io/terms/")
 *                     .license(new License().name("Apache 2.0").url("http://springdoc.org")));
 * }
 * </pre>
 */
@Configuration
public class SwaggerConfig {
    // Configuration will be added once the springdoc-openapi dependency is properly resolved
}
