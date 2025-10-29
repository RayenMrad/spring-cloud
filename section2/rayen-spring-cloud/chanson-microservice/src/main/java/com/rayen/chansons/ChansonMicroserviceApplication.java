package com.rayen.chansons;

import com.rayen.chansons.entities.Chanson;
import com.rayen.chansons.repos.ChansonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ChansonMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChansonMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ChansonRepository chansonRepository) {
        return args -> {
            chansonRepository.save(Chanson.builder()
                    .chansonName("Identity")
                    .artisteName("ALA")
                    .build());

        };
    }

}
