package jp.te4a.spring.boot.my_boot_app3;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GreetingTaro{
    
    @GetMapping("/taro")
    public String index(){
        return "Taro desu!";
    }
}
