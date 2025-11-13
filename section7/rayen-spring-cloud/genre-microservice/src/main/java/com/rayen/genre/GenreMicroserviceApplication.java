package com.rayen.genre;

import com.rayen.genre.entities.Genre;
import com.rayen.genre.repos.GenreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GenreMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenreMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(GenreRepository genreRepository) {
        return args -> {
            genreRepository.save(Genre.builder()
                    .genName("Pop")
                    .genCode("PP")
                    .build());
            genreRepository.save(Genre.builder()
                    .genName("Hip-Hop")
                    .genCode("HH")
                    .build());
        };
    }

}
