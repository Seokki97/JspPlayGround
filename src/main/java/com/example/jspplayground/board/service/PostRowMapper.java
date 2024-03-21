package com.example.jspplayground.board.service;

import com.example.jspplayground.board.dto.response.PostResponse;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import org.springframework.stereotype.Service;

@Service
public class PostRowMapper implements RowMapper<PostResponse> {
    @Override
    public PostResponse mapRow(ResultSet rs, int rowNum) throws SQLException {
        PostResponse postResponse = null;
        return postResponse;
    }

}
