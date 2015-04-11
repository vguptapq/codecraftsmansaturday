package com.craftsman.calc.controller;

import java.util.Arrays;
import java.util.List;

import main.CalculateThis;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.craftsman.calc.model.MathRequest;
import com.craftsman.calc.model.MathResponse;

@RestController
@RequestMapping("/maths")
public class MathsController {
    private CalculateThis service;

    @RequestMapping(method=RequestMethod.POST)
    public MathResponse doMath(@RequestBody MathRequest request) throws Exception {
        List<Double> operands = Arrays.asList(request.getA(), request.getB());
        Double answer = service.CalculateThisSetOfStuff(operands, request.getOperation());
        return new MathResponse(answer);
    }

    @RequestMapping(method=RequestMethod.GET)
    public MathResponse hi() {
        return new MathResponse(0.0);
    }

}
