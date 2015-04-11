package com.craftsman.calc.controller;

import java.util.Arrays;
import java.util.List;

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
import com.craftsman.calc.model.Operation;

@RunWith(MockitoJUnitRunner.class)
public class MathsControllerTest {
    @InjectMocks
    private MathsController controller;

    @Mock
    private CalcService service;

    @Ignore
    @Test
    public void testMockAdd() {
        List<Double> values = Arrays.asList(2.0, 40.0);
        Mockito.when(service.calculate("add", values)).thenReturn(42.0f);

        MathRequest request = new MathRequest(2.0, 40.0, Operation.ADD);
        MathResponse response = controller.doMath(request);
        Assert.assertTrue(response.getAnswer() == 42.0f);
    }
}
