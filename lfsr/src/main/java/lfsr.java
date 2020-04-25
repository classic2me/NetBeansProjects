/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author School_Account
 */
public class lfsr {
    
    public static void main(String[] args) {
        
        int start_state = 2;
        int lfsr = start_state;
        int bit;
        
        int period = 0;
        
        do {
            bit = ((lfsr >> 0) ^ (lfsr >> 2) ^ (lfsr >> 3) ^ (lfsr >> 5)) /* & 1u */;
            lfsr = (lfsr >> 1) | (bit << 15);
            ++period;
        }
        
        while(lfsr != start_state);
        
        return period;
        
    }
    
}
