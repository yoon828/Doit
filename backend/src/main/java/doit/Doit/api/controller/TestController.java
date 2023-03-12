package doit.Doit.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class TestController {

    @GetMapping("/")
    public String getTest(){
        return "cdcd test";
    }


}
