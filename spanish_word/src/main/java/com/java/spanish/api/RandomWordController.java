package com.java.spanish.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.spanish.service.WordService;
import com.java.spanish.vo.WordVo;

@CrossOrigin(maxAge = 3600)
@RestController
public class RandomWordController {

    @Autowired
    private WordService wordService;

    @GetMapping("/random-word")
    public WordVo getRandomWord() {
        return wordService.getRandomWord();
    }
}
