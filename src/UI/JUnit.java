package UI;

import Controller.Calculator;
import Model.AbstractStack;
import Model.PostfixCalculator;
import Model.StackFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnit {

    @Test
    public void JUnit() {
        Calculator pc = new Calculator();
        String postfix = "23+4*";
        AbstractStack<Integer> stack = new StackFactory<Integer>().createStack("VECTOR");
        int result = pc.mainOperation(postfix, stack);
        assertEquals(20, result);

        postfix = "52*73/-";
        stack = new StackFactory<Integer>().createStack("ARRAY_LIST");
        int result2 = pc.mainOperation(postfix, stack);
        assertEquals(-2, result2);

        postfix = "83+51-*";
        stack = new StackFactory<Integer>().createStack("DOUBLE_LIST");
        int result3 = pc.mainOperation(postfix, stack);
        assertEquals(6, result3);
    }


}
