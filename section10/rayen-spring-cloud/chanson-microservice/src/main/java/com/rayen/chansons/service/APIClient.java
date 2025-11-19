package com.rayen.chansons.service;

import com.rayen.chansons.dto.GenreDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(url = "http://localhost:8081", value = "GENRE")
@FeignClient(name = "GENRE-MS")
public interface APIClient {
    @GetMapping("api/genres/{code}")
    GenreDto getGenByCode(@PathVariable("code")
                               String genreCode
    );
}
