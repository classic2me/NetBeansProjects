/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author class
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello, world!");
        int i, a;
        a = 0;
        for (i=0; i<=10; ++i) {
            a = a + i;
        }
        System.out.printf("Sum from 0 to 10 is %d.\n", a);
    }
    
}
