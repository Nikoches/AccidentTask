package ru.job4j.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.repository.AccidentHibernate;


@Controller
public class IndexControl {
    private final AccidentHibernate accidents;

    public IndexControl(AccidentHibernate accidents) {
        this.accidents = accidents;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("accidents", accidents.getAll());
        return "index";
    }
}