/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.trabajoenclase3;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author SOPORTETICS
 */
public class TrabajoEnClase3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();
        System.out.println("INGRESE LA CADENA DE TEXTO CON SIMBOLOS {,[,(,),],}");
        String ejemplo = in.nextLine();
        for (int i = 0; i < ejemplo.length(); i++) {
            char j = ejemplo.charAt(i);
            if (pila.isEmpty()) {
                pila.push(j);
                imprimirPila(pila);
            } else if (j == '(' || j == '[' || j == '{') {
                pila.push(j);
                imprimirPila(pila);
            } else if (j == ')' || j == ']' || j == '}') {
                if (j == ')' && pila.get(pila.size() - 1) == '(') {
                    pila.pop();
                    imprimirPila(pila);
                } else if (j == ']' && pila.get(pila.size() - 1) == '[') {
                    pila.pop();
                    imprimirPila(pila);
                } else if (j == '}' && pila.get(pila.size() - 1) == '{') {
                    pila.pop();
                    imprimirPila(pila);
                } else {
                    pila.push(j);
                    imprimirPila(pila);
                }
            }
        }
    }

    public static void imprimirPila(Stack<Character> pila) {
        for (char character : pila) {
            System.out.print(character);
        }
        System.out.println("");
    }
}
