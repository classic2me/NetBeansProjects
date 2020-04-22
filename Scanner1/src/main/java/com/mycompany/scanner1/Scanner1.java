/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scanner1;
import java.util.Scanner; // program uses class Scanner1
/**
 *
 * @author class
 */
public class Scanner1 {
    public static void main( String[] args)
    {
        Scanner input = new Scanner( System.in );
        
        int n1;
        int n2;
        int sum;
        
        System.out.print("Enter first number: ");
        n1 = input.nextInt(); // read first number from user
        System.out.print("Enter second number: ");
        n2 = input.nextInt(); // read second number from user
        
        sum = n1 + n2;
        
        System.out.printf("Sum is %d\n", sum);
    }
}
