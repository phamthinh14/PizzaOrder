package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

@Controller
public class HomeController {
    @Autowired
    OrderRepository orderRepository;

    @RequestMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("orders", orderRepository.findAll());
        return "home";
    }

    @GetMapping("/addorder")
    public String addOrder(Model model) {
        model.addAttribute("order", new Order());
        return "orderform";
    }

    @PostMapping("/addnew")
    public String processNewFormText(@ModelAttribute @Valid Order order, BindingResult result) {
        if (result.hasErrors()) {
            return "orderform";
        }
        //The part need to add to a specific user
//        User currentUser = userService.getUser();
//        Set<User> usersSet = new LinkedHashSet<>();
//        usersSet.add(currentUser);
//        message.setUsers(usersSet);
        //--End--
        orderRepository.save(order);
        return "redirect:/home";
    }
}
