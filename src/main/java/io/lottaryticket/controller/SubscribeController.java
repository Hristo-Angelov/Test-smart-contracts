package io.lottaryticket.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/")
public class SubscribeController {

    @RequestMapping(value = "/submit", method = GET)
    public String sebscribe(@RequestParam(value = "newsletter-mail")String email){
        System.out.println(email);
        return "index";
    }
}
