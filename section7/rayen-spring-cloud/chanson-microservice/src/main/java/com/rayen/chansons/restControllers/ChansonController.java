package com.rayen.chansons.restControllers;

import com.rayen.chansons.dto.APIResponseDto;
import com.rayen.chansons.dto.ChansonDto;
import com.rayen.chansons.service.ChansonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chansons")
@AllArgsConstructor
public class ChansonController  {

    private ChansonService chansonsService;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getChansonById(@PathVariable("id") Long id )
    {
        return new ResponseEntity<APIResponseDto>(
                chansonsService.getChansonById(id), HttpStatus.OK);
    }
}
