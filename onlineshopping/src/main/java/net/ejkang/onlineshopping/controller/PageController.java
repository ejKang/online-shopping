package net.ejkang.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.ejkang.onlineshopping.vo.TestVo;

@Controller
public class PageController {

    @RequestMapping("/page")
    public String page(Model model) {
        TestVo testModel = new TestVo();
        testModel.setId("ss");
        testModel.setName("ejKang");
        model.addAttribute("testModel", testModel);

        return "thymeleaf/page";
    }

    @RequestMapping("/test")
    public String test(@RequestParam(value="greeting", required = false)String greeting, Model model) {
        TestVo testModel = new TestVo();
        testModel.setId(greeting);
        testModel.setName("ejKang");
        model.addAttribute("testModel", testModel);

        return "thymeleaf/page";
    }

    @RequestMapping("/pathvariable/{greeting}")
    public String pathvariable(@PathVariable("greeting")String greeting, Model model) {
        TestVo testModel = new TestVo();
        testModel.setId(greeting);
        testModel.setName("ejKang");
        model.addAttribute("testModel", testModel);

        return "thymeleaf/page";
    }




}