package io.github.hyunseo2512.server.domain.home.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Welcome to Spring Boot Portfolio Server!");
        return "index"; // Renders templates/index.html
    }
}
