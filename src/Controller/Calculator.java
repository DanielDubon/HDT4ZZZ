package Controller;

import Model.AbstractStack;
import Model.IStack;
import Model.PostfixCalculator;
import Model.StackFactory;

import java.util.ArrayList;
import java.util.Stack;

public class Calculator {


    private static boolean instance_flag = false;
    private static Calculator _uniqueCalculator;

    public Calculator(){
        instance_flag = true;
    }

    public static Calculator getInstance(){
        if (!instance_flag) {
            _uniqueCalculator = new Calculator();
        }
        return _uniqueCalculator;
    }

    PostfixCalculator pc = new PostfixCalculator();

    public void getValue(String operator, int A, int B, IStack<Integer> stack){
        switch(operator){
            case "+":
                stack.push(pc.suma(A, B));
                break;

            case "-":
                stack.push(pc.resta(A, B));
                break;

            case "*":
                stack.push(pc.multiplicacion(A, B));
                break;

            case "/":
                stack.push(pc.division(A, B));
                break;
        }
    }


    public int Operate(String postfix, AbstractStack<Integer> stack){
        ArrayList<String> data = pc.getItems(postfix);
        AbstractStack<Integer> auxStack = new StackFactory<Integer>().createStack("ARRAY_LIST");

        for (String datum : data) {
            if (!pc.isOperator(datum)) {
                stack.push(Integer.valueOf(datum));
                auxStack.push(Integer.valueOf(datum)); // Insertamos el elemento en el Stack auxiliar
            }
        }
        while(!stack.isEmpty()) {
            auxStack.push(stack.pull());
        }

        stack = auxStack;

        for (String datum : data) {
            if (pc.isOperator(datum)) {
                int A = stack.pull();
                int B = stack.pull();
                getValue(datum, A, B, stack);
            }
        }
        return stack.pull();
    }
}
