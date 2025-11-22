package com.rayen.genre.service;


import com.rayen.genre.dto.GenreDto;
import com.rayen.genre.entities.Genre;
import com.rayen.genre.repos.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    GenreRepository genreRepository;

    @Override
    public GenreDto getGenreByCode(String code) {
        Genre dep = genreRepository.findByGenCode(code);

        GenreDto genreDto = new GenreDto(
                dep.getId(),
                dep.getGenName(),
                dep.getGenCode()
        );

        return genreDto;
    }
}
