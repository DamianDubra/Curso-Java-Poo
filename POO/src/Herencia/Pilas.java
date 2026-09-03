package Herencia;

import java.util.Stack;

public class Pilas {
    public static void main (String[] args){
        Stack<Integer> pila = new Stack<Integer>();
        System.out.println(pila);
        System.out.println(pila.isEmpty());

        pila.push(1);
        pila.push(1);

        pila.push(3);
        pila.push(2);


        for (Integer pilota : pila){
            System.out.println(pilota);
        }
        System.out.println(pila);
        System.out.println(pila.isEmpty());

        pila.pop();

        System.out.println(pila.search(3));

        System.out.println(pila.peek());




    }
}
