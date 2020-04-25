/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lfsr1;

/**
 *
 * @author class
 */
public class lfsr1 {
    public static void main(String[] args) {
        int start_state = 0xace1; // 32
        int lfsr = start_state;
        int bit;
        int period = 0;
        
        System.out.printf("[%5d]: %s\n",period, bin16(lfsr));
        do
        {
            /* taps: 16 14 13 11; feedback polynomial: x^16+x^14+x^13+x^11+1 */
            bit = ((lfsr >> 0)^(lfsr >> 2)^(lfsr >> 3)^(lfsr >> 5))& (int)1;
            lfsr = (lfsr >> 1) | (bit << 15);
            ++period;
            System.out.printf("[%5d]: %s\n",period, bin16(lfsr));
        } while(lfsr != start_state);
        System.out.printf("period = %d\n", period);
    }
    
    static String bin16(int n) {
        String out = Integer.toBinaryString(n);
        int l = out.length();
        out = "0".repeat(16-l) + out;
        return out;
    }
}
