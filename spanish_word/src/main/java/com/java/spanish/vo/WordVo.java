package com.java.spanish.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class WordVo {
	private int word_id;
    private String main_title;
    private String sub_title;
    private String spanish_word;
    private String english_word;
    private String korean_word;
    private int is_checked;
//    private String image_url;
}
