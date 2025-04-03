package dev.java10x.CadastroNinja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/")
    public String boasVindas(){
        return "<h1>Meu primeiro hello world com Spring</h1>";
    }
}
