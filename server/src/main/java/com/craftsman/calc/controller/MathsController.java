package com.craftsman.calc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.craftsman.calc.model.MathRequest;
import com.craftsman.calc.model.MathResponse;

@RestController
@RequestMapping("/maths")
public class MathsController {

    @RequestMapping(method=RequestMethod.POST)
    public MathResponse doMath(MathRequest request) {
        return null;
    }

    @RequestMapping(method=RequestMethod.GET)
    public String hi() {
        return "hello";
    }

}
