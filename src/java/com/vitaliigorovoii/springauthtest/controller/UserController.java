package com.vitaliigorovoii.springauthtest.controller;

import com.vitaliigorovoii.springauthtest.model.User;
import com.vitaliigorovoii.springauthtest.service.SecurityService;
import com.vitaliigorovoii.springauthtest.service.UserService;
import com.vitaliigorovoii.springauthtest.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for {@link User}'s pages.
 *
 * @author Vitalii Gorovoii
 */

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm,
                               BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getConfirmPassword());

        return "redirect:/welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null) {
            model.addAttribute("error", "Username or password is incorrect.");
        }

        if (logout != null) {
            model.addAttribute("message", "Logout successfully.");
        }

        return "login";
    }

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome(Model model) {
        return "welcome";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(Model model) {
        model.addAttribute("users", userService.findAllUsers());
        return "admin";
    }

    @RequestMapping(value = "/admin/users/delete", method = RequestMethod.GET)
    public String delete(@RequestParam(value = "username") String username, Model model){
        userService.delete(userService.findByUsername(username));
        model.addAttribute("username", username);
        return "redirect:/admin";
    }
}
