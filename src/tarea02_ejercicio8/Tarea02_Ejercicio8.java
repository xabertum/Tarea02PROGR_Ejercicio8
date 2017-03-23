/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea02_ejercicio8;

import java.util.Scanner;

/**
 *
 * @author mohat
 */
public class Tarea02_Ejercicio8 {

    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                      
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        
        System.out.println("Introduce el primer numero: ");
        num1 = scanner.nextInt();
        
        System.out.println("Introduce el segundo numero: ");
        num2 = scanner.nextInt();
        
        System.out.println("x = " + num1 + " y = " + num2);
        System.out.println("x + y = " + (num1 + num2));
        System.out.println("x - y = " + (num1 - num2));
        System.out.println("x * y = " + (num1 * num2));
        System.out.println("x / y = " + (num1 / num2));
        System.out.println("x ^ y = " + (Math.pow(num1, num2)));
        System.out.println(" ¹ x = " + (Math.sqrt(num2)));
        
        
        
    }
    
}
