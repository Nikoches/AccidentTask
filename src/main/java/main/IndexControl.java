package main;

import main.model.Accident;
import main.repository.AccidentMem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControl {
    @Autowired
    private AccidentMem accidentMem;
    @GetMapping("/")
    public String index(Model model) {
        Accident accident = new Accident();
        accident.setId(2);
        accident.setText("test");
        accident.setName("TestName");
        accident.setAddress("TestAddres");
        accidentMem.addAccident(1, accident);
        model.addAttribute("acc",accidentMem.getAccidents());
        return "index";
    }
}