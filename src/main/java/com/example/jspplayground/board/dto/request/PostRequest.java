package com.example.jspplayground.board.dto.request;

import lombok.Getter;

@Getter
public class PostRequest {

    private String writer;
    private String title;
    private String content;

    public PostRequest(final String writer, final String title, final String content) {
        this.writer = writer;
        this.title = title;
        this.content = content;
    }
}
