/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sorthy1;

/**
 *
 * @author class
 */
public class SortHy1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] num_arr = {6,10,1,4,3,2,7,8,9,5};
        
        PrintArray(num_arr); // Print before sorting
        SortBubble(num_arr); // Execute sorting
        PrintArray(num_arr); // Print after sorting
    }
    private static void SortBubble(int[] arr) {
        int temp;
        
        temp = arr[1];
        arr[1] = arr[0];
        arr[0] = temp;
    }
    private static void PrintArray(int[] arr) {
        int i;
        int L = arr.length;
        System.out.printf("num_arr = {");
        for(i=0; i<L; ++i) {
            if (i==0)
                System.out.printf("%d", arr[i]);
            else    
                System.out.printf(", %d", arr[i]);
        }
        System.out.printf("}\n");
    }
}
