/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author School_Account
 */
public class Sum1 {
    
    public static void main(String[] args) {
        
        int non = 100;
        
        int answer = ((non+1)*100)/2;
        
        System.out.println(answer);
        
        int answer2 = 0;
        int answer2temp = 1;
        int i;
        
        for (i = 1 ; i <= 100 ; ++i) {
            answer2 = answer2 + answer2temp;
            answer2temp = answer2temp + 1;
            System.out.printf("[%d] answer2: %d, answer2temp: %d\n", i, answer2, answer2temp);
        }
        
        System.out.println(answer2);
        
    }
    
}
