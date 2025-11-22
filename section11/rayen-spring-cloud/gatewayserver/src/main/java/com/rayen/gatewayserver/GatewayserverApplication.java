package com.rayen.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient  // ✅ Ajoutez cette annotation
public class GatewayserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayserverApplication.class, args);
    }


    @Bean
    public RouteLocator MyRouteConfig(RouteLocatorBuilder routeLocatorBuilder)
    {
        return routeLocatorBuilder.routes()
                .route(p -> p
                        .path("/api/genres/**")
                        .uri("lb://GENRE"))
                .route(p -> p
                        .path("/api/chansons/**")
                        .filters( f -> f.circuitBreaker(config ->
                                        config.setName("chansonCircuitBreaker")
                                                .setFallbackUri("forward:/contactAdmin") ))
                        .uri("lb://CHANSON"))
                .build();
    }


}
