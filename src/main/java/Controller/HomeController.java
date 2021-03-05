package Controller;

import model.CitatMaker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    private CitatMaker quote;

    public HomeController(){
        this.quote = new CitatMaker("Heyhey");

    }
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("xxx",quote);
        return "index.html";
    }
    @GetMapping("/citat")
    public String citat(){
        return "citat.html";
    }

    @PostMapping("/citat")
    public String citat(@ModelAttribute CitatMaker q){
        this.quote = q;
        return "redirect:/";

    }
}
