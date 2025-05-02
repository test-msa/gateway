package test.msa.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("users", r -> r.path("/api/users/**")
                        .uri("http://localhost:8081/api/users"))
                .route("posts", r -> r.path("/api/posts/**")
                        .uri("http://localhost:8082/api/posts"))
                .build();
    }
}
