package com.rayen.chansons.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChansonDto {
    private Long id;
    private String chansonName;
    private String artisteName;
    private String genCode;
    private String GenName;

}
