package com.michalszalkowski.zeus.module.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String gethome(Model model){
        PersonDto personDto1 = new PersonDto("test", "test", 12);
        PersonDto personDto2 = new PersonDto("test2", "test2", 13);
        PersonDto personDto3 = new PersonDto("test3", "tes3", 14);

        List<PersonDto> testList = List.of(personDto1,personDto2,personDto3);

        model.addAttribute("testList", testList);
        return "home";

    }
}
