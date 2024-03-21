package com.example.jspplayground.board.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api/board")
public class BoardController {

    @RequestMapping("/show")
    public String showBoard() {
        return "main";
    }

    @PostMapping("/submit")
    public ResponseEntity<String> submit(@RequestParam("id") String id) {
        return ResponseEntity.ok(id);
    }
}
