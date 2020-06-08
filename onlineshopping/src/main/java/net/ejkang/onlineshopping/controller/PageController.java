package net.ejkang.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.ejkang.onlineshopping.vo.TestVo;
import net.ejkang.shoppingbackend.dao.CategoryDAO;
import net.ejkang.shoppingbackend.dto.Category;

@Controller
public class PageController {

    @Autowired
    private CategoryDAO categoryDAO ;

    @RequestMapping("/page")
    public String page(Model model) {
        TestVo testModel = new TestVo();
        testModel.setId("ss");
        testModel.setName("Home");
        testModel.setUserClickHome(true);
        model.addAttribute("testModel", testModel);
        // model.addAttribute("categories", categoryDAO.list());
        return "thymeleaf/page";
    }

    @RequestMapping("/show/all/products")
    public String showAllProducts(Model model) {
        TestVo testModel = new TestVo();
        testModel.setId("ss");
        testModel.setName("All Products");
        testModel.setUserClickHome(true);
        model.addAttribute("userClickAllProducts", true);
        model.addAttribute("testModel", testModel);
        // model.addAttribute("categories", categoryDAO.list());
        return "thymeleaf/page";
    }

    @RequestMapping("/show/category/{id}/products")
    public String showCategoryProducts(@PathVariable("id")int id, Model model) {
        Category category = null;
        category = categoryDAO.get(id);

        TestVo testModel = new TestVo();
        testModel.setId("ss");
        testModel.setName(category.getName());
        
        model.addAttribute("userClickCategoryProducts", true);
        model.addAttribute("testModel", testModel);
        model.addAttribute("category", category);
        // model.addAttribute("categories", categoryDAO.list());
        return "thymeleaf/page";
    }


    @RequestMapping("/about")
    public String about(Model model) {
        TestVo testModel = new TestVo();
        testModel.setId("ss");
        testModel.setName("About Us");
        testModel.setUserClickAbout(true);
        model.addAttribute("testModel", testModel);

        return "thymeleaf/page";
    }

    @RequestMapping("/contact")
    public String contact(Model model) {
        TestVo testModel = new TestVo();
        testModel.setId("ss");
        testModel.setName("Contact Us");
        testModel.setUserClickContact(true);
        model.addAttribute("testModel", testModel);

        return "thymeleaf/page";
    }

    @RequestMapping("/test") // test of RequestParam
    public String test(@RequestParam(value="greeting", required = false)String greeting, Model model) {
        TestVo testModel = new TestVo();
        testModel.setId(greeting);
        testModel.setName("ejKang");
        model.addAttribute("testModel", testModel);

        return "thymeleaf/page";
    }

    @RequestMapping("/pathvariable/{greeting}") // test of PathVariable
    public String pathvariable(@PathVariable("greeting")String greeting, Model model) {
        TestVo testModel = new TestVo();
        testModel.setId(greeting);
        testModel.setName("ejKang");
        testModel.setUserClickHome(true);
        model.addAttribute("testModel", testModel);

        return "thymeleaf/page"; 
    }




}