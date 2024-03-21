package com.example.jspplayground.board.controller;

import com.example.jspplayground.board.dto.request.PostRequest;
import com.example.jspplayground.board.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api/board")
public class BoardController {

    private final PostService postService;

    public BoardController(final PostService postService) {
        this.postService = postService;
    }

    @RequestMapping("/show")
    public String showBoard() {
        return "main";
    }

    @PostMapping("/submit")
    public ResponseEntity<Void> submit(@RequestBody PostRequest postRequest) {
        postService.writePost(postRequest);
        return ResponseEntity.noContent().build();
    }
}
