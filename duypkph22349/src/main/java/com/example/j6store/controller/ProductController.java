package com.example.j6store.controller;

import com.example.j6store.entity.Product;
import com.example.j6store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    ProductService pService;
    @RequestMapping("product/list")
    public String listProduct(Model model, @RequestParam("cid") Optional<String> cid){
        if (cid.isPresent()){
            List<Product> list= pService.findByCategoryId(cid.get());
            model.addAttribute("items",list);
        }else {
            List<Product> list = pService.findAll();
            model.addAttribute("items", list);
        }
        return "product/list";
    }

    @RequestMapping("product/detail/{id}")
    public String detailProduct(Model model, @PathVariable("id") Integer id){
        Product  product = pService.finById(id);
        model.addAttribute("item",product);
        return "product/detail";
    }
}
