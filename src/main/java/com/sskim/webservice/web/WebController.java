package com.sskim.webservice.web;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@NoArgsConstructor
@Controller
public class WebController {

    @GetMapping("/")
    public String main() {
        return "main";
    }
}
