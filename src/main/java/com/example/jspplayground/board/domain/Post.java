package com.example.jspplayground.board.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "post")
public class Post {


    private Long postId;

    private String writer;

    private String title;

    private String content;

    public Post(final String writer, final String title, final String content) {
        this.writer = writer;
        this.title = title;
        this.content = content;
    }
}
