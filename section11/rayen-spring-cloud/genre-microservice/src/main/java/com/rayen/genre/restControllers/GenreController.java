package com.rayen.genre.restControllers;

import com.rayen.genre.config.Configuration;
import com.rayen.genre.dto.GenreDto;
import com.rayen.genre.service.GenreService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/genres")
public class GenreController {
    private GenreService genreService;

//    @Value("${build.version}")
//    private String buildVersion;
//
//    @Autowired
//    Configuration configuration;


    public GenreController(GenreService genreService){
        this.genreService = genreService;
    }

    @GetMapping("{code}")
    public ResponseEntity<GenreDto> getGenByCode(@PathVariable("code")
                                                      String code )
    {
        return new ResponseEntity<GenreDto>(
                genreService.getGenreByCode(code),
                HttpStatus.OK);
    }


//    @GetMapping("/version")
//    public ResponseEntity<String> version()
//    {
//        return ResponseEntity.status(HttpStatus.OK).body(buildVersion);
//    }
//
//    @GetMapping("/author")
//    public ResponseEntity<String> retrieveAuthorInfo() {
//        return ResponseEntity.status(HttpStatus.OK)
//                .body(configuration.getName() + " " + configuration.getEmail());
//    }


    }
