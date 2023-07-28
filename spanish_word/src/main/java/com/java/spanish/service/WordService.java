package com.java.spanish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.mapper.WordMapper;
import com.java.spanish.vo.WordVo;

@Service
public class WordService {

    @Autowired
    private WordMapper wordMapper;

    public WordVo getRandomWord() {
        return wordMapper.getRandomWord();
    }
}
