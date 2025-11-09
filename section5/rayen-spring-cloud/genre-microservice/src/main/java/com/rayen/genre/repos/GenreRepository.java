package com.rayen.genre.repos;

import com.rayen.genre.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre,Long> {

    Genre findByGenCode(String code);

}
