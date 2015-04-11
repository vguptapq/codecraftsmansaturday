package com.craftsman.calc.controller;

import java.util.Arrays;
import java.util.List;

import main.CalculateThis;
import main.Operations;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.craftsman.calc.model.MathRequest;
import com.craftsman.calc.model.MathResponse;

@RunWith(MockitoJUnitRunner.class)
public class MathsControllerTest {
    @InjectMocks
    private MathsController controller;

    @Mock
    private CalculateThis service;

    @Ignore
    @Test
    public void testMockAdd() throws Exception {
        List<Double> values = Arrays.asList(2.0, 40.0);
        Mockito.when(service.CalculateThisSetOfStuff(values, Operations.ADD)).thenReturn(42.0);

        MathRequest request = new MathRequest(2.0, 40.0, Operations.ADD);
        MathResponse response = controller.doMath(request);
        Assert.assertTrue(response.getAnswer() == 42.0f);
    }
}
