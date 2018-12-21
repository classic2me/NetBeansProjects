/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayprac1;

/**
 *
 * @author class
 */
public class ArrayPrac1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = new int[10];
        int[] ptr_arr;
        int i;
        int N = arr.length;
        
        for (i=0; i<N; ++i) {
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
        //System.out.println(ptr_arr[0]);
    }
    
}
