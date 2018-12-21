/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort1;

/**
 *
 * @author class
 */
public class Sort1 {

    /**
     * @param args the command line arguments
     */  
    public static void main(String[] args) {
        // TODO code application logic here
        int[] num = {6,10,1,4,3,2,7,8,9,5};
        int i, j;
        int L = num.length;
        
        System.out.printf("Initial\n");
        PrintArray(num);
        
        // Bubble sorting
        int last;
        int temp;
        int flag;
        for(i=1; i<L; ++i) {
            last = L - i;
            flag = 0;
            for(j=0; j<last; ++j) {
                if (num[j]>num[j+1]) {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                    flag = 1;
                }  
            }
            System.out.printf("Iteration %d\n", i);
            PrintArray(num);
            if (flag == 0) {
                System.out.printf("No swap this time.\nTerminating sorting.\n");
                break;
            }
        }       
    }
    private static void PrintArray(int[] arr) {
        int i;
        int L = arr.length;
        System.out.printf("num = {");
        for(i=0; i<L; ++i) {
            if (i==0)
                System.out.printf("%d", arr[i]);
            else    
                System.out.printf(", %d", arr[i]);
        }
        System.out.printf("}\n");
    }   
}
