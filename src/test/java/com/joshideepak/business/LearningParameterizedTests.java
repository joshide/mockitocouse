package com.joshideepak.business;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

//Run with Parameterized class
@RunWith(Parameterized.class)
public class LearningParameterizedTests {

    Sum sum = new Sum();

    //instance variable to get hold of parameters defined in method with @Parameter annotation
    private Object[] input;
    private Object expectedOutput;

    //Constructor
    public LearningParameterizedTests(Object[] input, Object expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    //Method with @Parameter annotation
    @Parameterized.Parameters
    public static Collection getParameters(){
        Object[] input1 = {1,3};
        Object[] input2 = {20,-10};

        Object[][] arr = {
            {input1,4},
            {input2,10}
        };

        return Arrays.asList(arr);
    }

    @Test
    public void testSumWithParameters(){

        /*assertEquals(4, sum.sum(1,3));
        assertEquals(10, sum.sum(20,-10));*/
        int actual = sum.sum((Integer)input[0], (Integer)input[1]);
        int expected = (Integer)expectedOutput;
        assertEquals(expected,actual);

    }

}
