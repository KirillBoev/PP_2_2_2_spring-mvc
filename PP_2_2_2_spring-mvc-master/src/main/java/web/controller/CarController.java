package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarServiceImpl;


@Controller
public class CarController {
    @Autowired
    CarServiceImpl carService;

    @GetMapping(value = "/cars")
    public String showCar(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("carstable", carService.listUsers(count));
        return "cars";
    }
}
