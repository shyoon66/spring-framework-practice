package com.yoonbae.welshcorgi.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/")
    public String boardList(ModelMap model) {
        return "board/boardList";
    }
}
