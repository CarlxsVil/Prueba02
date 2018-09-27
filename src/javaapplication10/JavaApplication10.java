/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author CARLOS
 */
public class JavaApplication10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int a = entrada.nextInt();
        System.out.println("Ingrese el segundo número");
        int b = entrada.nextInt();
        System.out.println("Ingrese el tercer número");
        int c = entrada.nextInt();
        if (a > b && a > c && b > c) {
            System.out.println("En forma descendente: " + a + "-" + b + "-" + c);
            System.out.println("En forma ascendente: " + c + "-" + b + "-" + a);
        } else if (a > b && a > c && c > b) {
            System.out.println("En forma descendente: " + a + "-" + c + "-" + b);
            System.out.println("En forma ascendente: " + b + "-" + c + "-" + a);
        } else if (b > a && b > c && a > c) {
            System.out.println("En forma descendente: " + b + "-" + a + "-" + c);
            System.out.println("En forma ascendente: " + c + "-" + a + "-" + b);
        } else if (b > a && b > c && c > a) {
            System.out.println("En forma descendente: " + b + "-" + c + "-" + a);
            System.out.println("En forma ascendente: " + a + "-" + c + "-" + b);
        } else if (c > a && c > b && b > a) {
            System.out.println("En forma descendente: " + c + "-" + b + "-" + a);
            System.out.println("En forma ascendente: " + a + "-" + b + "-" + c);
        } else if (c > a && c > b && a > b) {
            System.out.println("En forma descendente: " + c + "-" + a + "-" + b);
            System.out.println("En forma ascendente:" + b + "-" + a + "-" + c);
        } else if (a==b && a==c && b==c) {
            System.out.println("En forma descendente: " + a + "-" + b + "-" + c);
            System.out.println("En forma ascendente: " + a + "-" + b + "-" + c);
        }
    }
}
