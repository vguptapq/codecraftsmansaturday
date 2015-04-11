package com.craftsman.calc.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.craftsman.calc.model.MathRequest;
import com.craftsman.calc.model.MathResponse;

import main.CalculateThis;

@RestController
@RequestMapping("/maths")
public class MathsController {

    @RequestMapping(method=RequestMethod.POST)
    public MathResponse doMath(@RequestBody MathRequest request) {
        return new MathResponse(request.getA());
    }

    @RequestMapping(method=RequestMethod.GET)
    public MathResponse hi() {
        return new MathResponse(0F);
    }

}
