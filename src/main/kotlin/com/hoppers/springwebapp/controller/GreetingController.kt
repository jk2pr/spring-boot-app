package com.hoppers.springwebapp.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class GreetingController {

    @RequestMapping("/greeting")
    fun greeting(): String {
        return "privacy"
    }
}