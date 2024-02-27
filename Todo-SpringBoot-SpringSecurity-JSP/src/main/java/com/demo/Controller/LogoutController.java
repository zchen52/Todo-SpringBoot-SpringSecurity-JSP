package com.demo.Controller;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class LogoutController {

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request,
        HttpServletResponse response) {

        Authentication authentication = SecurityContextHolder.getContext()
            .getAuthentication();

        if (authentication != null) {
            new SecurityContextLogoutHandler().logout(request, response,
                authentication);
        }

        return "redirect:/";
    }
}