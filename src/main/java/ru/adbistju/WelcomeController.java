package ru.adbistju;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WelcomeController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello - World");
        return "index";
    }

  /*  @GetMapping("/a")
    public String indexa(HttpServletRequest request) {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        System.out.println("Hello! " + name + " " + surname);

        return "puhform";
    }*/

    @GetMapping("/a")
    public String indexa(@RequestParam(value = "name", required = false) String name,
                         @RequestParam(value = "surname", required = false) String surname,
                         Model model) {

        //System.out.println("Hello! " + name + " " + surname);
        model.addAttribute("message", "Hello! " + name + " " + surname);
//тут будет ошбка в случае пустого значения!
        return "puhform";
    }
}
