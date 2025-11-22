package com.rayen.chansons.service;

import com.rayen.chansons.dto.GenreDto;
import org.springframework.stereotype.Component;

@Component
public class DeptFallBack implements APIClient {

    @Override
    public GenreDto getGenByCode(String genreCode) {
        return null;
    }
}