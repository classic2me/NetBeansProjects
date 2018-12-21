/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gausssum;

/**
 *
 * @author class
 */
public class GaussSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int start, end;
        int sum, i;
        
        start = 1;
        end = 10;
        sum = 0;
        
        for(i=start; i<=end; ++i) {
            sum = sum + i;
            System.out.printf("[%d] sum = %d\n", i, sum);
        }
    }
    
}
