package com.example.j6store.controller;

import com.example.j6store.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class OrderController {
    @Autowired
    OrderService oService;

    @RequestMapping("/order/checkout")
    public String checkout(){
        return "order/checkout";
    }

    @RequestMapping("/order/list")
    public String list(Model model, HttpServletRequest request){
        String username = request.getRemoteUser();
        model.addAttribute("orders",oService.findByUsername(username));
        return "order/list";
    }
    @RequestMapping("/order/detail/{id}")
    public String detail(@PathVariable("id")Integer id,Model model){
        model.addAttribute("order", oService.finById(id));
        return "order/detail";
    }
}
