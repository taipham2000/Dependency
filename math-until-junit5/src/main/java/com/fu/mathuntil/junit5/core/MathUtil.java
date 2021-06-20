/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathuntil.junit5.core;

/**
 *
 * @author phamv
 */
public class MathUtil {
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid arrgument."
                                    +"N must be bet");
        if(n ==0 || n == 1)
            return 1;
        return n * getFactorial(n - 1);
    }
}

// n! = 1.2.3.4.5...n quy ước 0! = 1! =1
//recursion - đệ quy - gọi lại chính mình với 1 quy mô
//5! = 5.4!
//4! = 4.3!
//3! = 3.2!
//2! = 2.1! dừng

//n! = n.(n-1)! - đệ quy
