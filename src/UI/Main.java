package UI;

import Controller.Calculator;
import Controller.InfixToPostfix;
import Controller.ReadFile;
import Model.AbstractStack;
import Model.IStack;
import Model.StackFactory;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        String stackType = selector(n);
        StackFactory<Integer> stackFactory = new StackFactory<Integer>();
        AbstractStack<Integer> stack;


        stack =  stackFactory.createStack(stackType);
        ReadFile reader = new ReadFile();
        Calculator calculator = Calculator.getInstance();
        String postfix = InfixToPostfix.infixToPostfix(reader.text("C:\\Users\\danie\\Documents\\Progra\\HDT4ZZZ\\src\\UI\\txta.txt"));
        int resultado = calculator.mainOperation(postfix,stack);
        System.out.println(resultado);



    }

    public static String selector(Scanner n){
        System.out.println("Seleccione que estructura utilizara: ");
        System.out.println("1. Vector");
        System.out.println("2. ArrayList");
        System.out.println("3. ListaEncadenada");

        String opcion = n.nextLine();
        switch (opcion){
            case "1":
                return "VECTOR";
            case "2":
                return "ARRAY_LIST";
            case "3":
                System.out.println("¿Que tipo de lista desea utilizar?: ");
                System.out.println("1. SimplementeEncadenada");
                System.out.println("2. DoblementeEncadenada");
                String opt2 = n.nextLine();
                if(opt2.equals("1")){
                    return "SINGLE_LIST";
                } else if (opt2.equals("2")) {
                    return "DOUBLE_LIST";
                } else {
                    System.out.println("La opcion seleccionada no existe");
                }
                break;
        }
        return "";
    }

}