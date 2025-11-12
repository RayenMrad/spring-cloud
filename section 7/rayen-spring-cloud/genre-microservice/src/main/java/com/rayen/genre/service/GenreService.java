package com.rayen.genre.service;

import com.rayen.genre.dto.GenreDto;

public interface GenreService {
    GenreDto getGenreByCode(String code);
}
