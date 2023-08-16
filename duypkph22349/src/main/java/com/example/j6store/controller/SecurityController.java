package com.example.j6store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
    @RequestMapping("/security/login/form")
    public String loginForm(Model model){
        model.addAttribute("mes","Vui long dang nhap!" );
        return "security/login";
    }
    @RequestMapping("/security/login/success")
    public String loginSuccess(Model model){
        model.addAttribute("mes","Dang nhap thanh cong!" );
        return "security/login";
    }

    @RequestMapping("/security/login/error")
    public String loginError(Model model){
        model.addAttribute("mes","Sai thong tin dang nhap!" );
        return "security/login";
    }
    @RequestMapping("/security/unauthority")
    public String loginUnAuthority(Model model){
        model.addAttribute("mes","Khong co quyen truy xuat!" );
        return "security/login";
    }
    @RequestMapping("/security/logoff/success")
    public String logOff(Model model){
        model.addAttribute("mes","Dang xuat thanh cong!" );
        return "security/login";
    }
}
