package com.example.jspplayground.board.service;

import com.example.jspplayground.board.domain.Post;
import com.example.jspplayground.board.dto.request.PostRequest;
import java.time.LocalDateTime;
import java.util.Date;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final JdbcTemplate jdbcTemplate;

    public PostService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void writePost(PostRequest postRequest) {
        String query = "INSERT INTO POST (writer, title, content,create_date) VALUES (?,?,?,?)";
        Post post = new Post(postRequest.getWriter(), postRequest.getTitle(), postRequest.getContent());
        jdbcTemplate.update(query, post.getWriter(), post.getContent(),post.getContent(), LocalDateTime.now());
    }

}
