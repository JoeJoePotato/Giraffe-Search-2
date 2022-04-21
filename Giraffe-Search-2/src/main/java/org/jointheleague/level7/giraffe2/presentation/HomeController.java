package org.jointheleague.level7.giraffe2.presentation;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
    public String home(){
        return "redirect:swagger-ui.html";
    }

}
