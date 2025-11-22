package com.rayen.chansons.service;

import com.rayen.chansons.dto.APIResponseDto;
import com.rayen.chansons.dto.ChansonDto;
import com.rayen.chansons.dto.GenreDto;
import com.rayen.chansons.entities.Chanson;
import com.rayen.chansons.repos.ChansonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service
public class ChansonServiceImpl implements ChansonService  {

    private ChansonRepository chansonRepository;
    //private WebClient webClient;

    private APIClient apiClient;


    @Override
    public APIResponseDto getChansonById(Long id) {
        Chanson chanson = chansonRepository.findById(id).get();

        String dname;


        /*GenreDto genreDto = webClient.get()
                .uri("http://localhost:8081/api/genres/" +
                        chanson.getGenCode())
                .retrieve()
                .bodyToMono(GenreDto.class)
                .block();*/

        GenreDto genreDto = apiClient.getGenByCode(chanson.getGenCode());

        if (genreDto == null)
            dname="NOT AVAILABLE";
        else
            dname = genreDto.getGenName();




        ChansonDto chansonDto =new ChansonDto(
                chanson.getId(),
                chanson.getChansonName(),
                chanson.getArtisteName(),
                chanson.getGenCode(),
                dname
        );

        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setChansonDto(chansonDto);
        apiResponseDto.setGenreDto(genreDto);
        return apiResponseDto;
    }

}
