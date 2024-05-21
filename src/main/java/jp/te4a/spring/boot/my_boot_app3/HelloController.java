package jp.te4a.spring.boot.my_boot_app3;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController{
    
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("msg", "this is a setting message");
        return "index";
    }

    @PostMapping("/post")
    public ModelAndView postForm(@RequestParam("text1") String text1) {
        var mv = new ModelAndView("index");
        mv.addObject("msg", text1 + "!!!");
        return mv;
    }

}
