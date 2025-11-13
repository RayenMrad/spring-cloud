package com.rayen.chansons.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {
    private ChansonDto chansonDto ;
    private GenreDto genreDto ;
}