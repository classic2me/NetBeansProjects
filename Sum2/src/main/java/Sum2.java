/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author School_Account
 */
public class Sum2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int firstn;
        int lastn;
        
        System.out.print("Enter first number: ");
        firstn = input.nextInt();
        System.out.print("ENter second number: ");
        lastn = input.nextInt();
        
        int answer2 = 0;
        int answer2temp = firstn;
        int i;
        
        for (i = firstn ; i <= lastn ; ++i) {
            answer2 = answer2 + answer2temp;
            answer2temp = answer2temp + 1;
            System.out.printf("[%d] answer2: %d, answer2temp: %d\n", i, answer2, answer2temp);
        }
        
        System.out.println(answer2);
        
    }
    
}
