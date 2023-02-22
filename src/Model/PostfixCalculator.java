package Model;

import java.util.ArrayList;
import java.util.Arrays;

public class PostfixCalculator {


    public boolean isOneItem(IStack operandos) {
        return operandos.count() == 1;
    }


    public int suma(int a, int b) {
        return a + b;
    }


    public int resta(int a, int b) {
        return a - b;
    }


    public int multiplicacion(int a, int b) {
        return a * b;
    }


    public int division(int a, int b) {
        return a / b;
    }


    public boolean isOperator(String item) {
        return item.equals("+") || item.equals("-") || item.equals("/") || item.equals("*");
    }


    public ArrayList<String> getItems(String _expresion) {
        String[] splitInput = _expresion.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(splitInput));
        return list;
    }

}