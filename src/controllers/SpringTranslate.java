package controllers;

import model.Translate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringTranslate {
    @GetMapping("/translate")
    public String translate(@RequestParam String en, Model model){
        Translate translate = new Translate();
        model.addAttribute("en",en);
        model.addAttribute("vn", translate.getValue(en));
        if (translate.getValue(en)==null){
            return "notfound";
        }else {
            return "translate";
        }
    }
}
