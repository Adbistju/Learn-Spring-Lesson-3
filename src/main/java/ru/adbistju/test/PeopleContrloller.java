package ru.adbistju.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/people")
public class PeopleContrloller {


    private final DAO dao;

    @Autowired
    public PeopleContrloller(DAO dao) {
        this.dao = dao;
    }

    @GetMapping()
    public String index(Model model){
        model.addAttribute("people", dao.index());
        return "people/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model){
        //Получим одного человека по id из DAO и прередадим на отображение в представлении
        model.addAttribute("person", dao.show(id));
        return "people/show";

    }
}
