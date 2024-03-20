package com.example.jspplayground.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/board")
public class BoardController {

    @RequestMapping("/show")
    public String showBoard() {
        return "main";
    }
}
