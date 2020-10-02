package com.michalszalkowski.zeus.module.dashboard;

import com.michalszalkowski.zeus.module.service.AritcleService;
import com.michalszalkowski.zeus.module.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DashboardController {

    private MenuService menuService;
    private AritcleService aritcleService;

    @Autowired
    public DashboardController(MenuService menuService, AritcleService aritcleService) {
        this.menuService = menuService;
        this.aritcleService = aritcleService;
    }

    @RequestMapping("/dashboard")
    public String getDashboard(Model model) {

        model.addAttribute("menu", menuService.getMenu());
        model.addAttribute("article", aritcleService.getArticle());

        return "dashboard";
    }




}
