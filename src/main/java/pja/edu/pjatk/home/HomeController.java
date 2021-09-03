package pja.edu.pjatk.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("module")
    String module() { return "module"; }


    @GetMapping("/")
    public ModelAndView modelAndView() {
        return new ModelAndView("index");
    }
}
