package com.java.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.java.spanish.vo.WordVo;

@Mapper
public interface WordMapper {
    public WordVo getRandomWord();
}