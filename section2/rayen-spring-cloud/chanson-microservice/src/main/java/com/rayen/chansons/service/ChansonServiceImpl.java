package com.rayen.chansons.service;

import com.rayen.chansons.dto.ChansonDto;
import com.rayen.chansons.entities.Chanson;
import com.rayen.chansons.repos.ChansonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ChansonServiceImpl implements ChansonService  {

    private ChansonRepository chansonRepository;

    @Override
    public ChansonDto getChansonById(Long id) {
        Chanson chanson = chansonRepository.findById(id).get();
        return new ChansonDto(
                chanson.getId(),
                chanson.getChansonName(),
                chanson.getArtisteName()
        );
    }

}
