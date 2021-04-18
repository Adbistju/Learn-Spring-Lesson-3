package ru.adbistju.tes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/authors")
public class AuthorsController {
    private AuthorsService authorsService;

    @Autowired
    public void setAuthorsService(AuthorsService authorsService) {
        this.authorsService = authorsService;
    }

    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String getForm(Model uiModel){
        Author author = new Author();
        uiModel.addAttribute("author", author);
        return "/WEB-INF/views/home.html";
    }

    @RequestMapping(params = "form", method = RequestMethod.POST)
    public String create(Author author) {
        authorsService.save(author);
        return "/WEB-INF/views/home.html";
    }
}


