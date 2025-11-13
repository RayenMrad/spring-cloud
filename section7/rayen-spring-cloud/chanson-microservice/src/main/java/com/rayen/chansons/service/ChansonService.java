package com.rayen.chansons.service;

import com.rayen.chansons.dto.APIResponseDto;
import com.rayen.chansons.dto.ChansonDto;

public interface ChansonService {
    APIResponseDto getChansonById(Long id);
}
