/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.matutil.junit5.core;

import com.fu.mathuntil.junit5.core.MathUtil;
import java.lang.reflect.Executable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author phamv
 */
public class MathUtilTest {
    
   /* @Test
    public void testFactorialGivenRigArgumentReturnsGoodResult(){
        assertEquals(720, MathUtil.getFactorial(6));
    }*/
    // data-driven: tach rieng data test va loi goi ham, k bi tron lan
    public static Integer[][] initData(){
        return new Integer[][] {{0, 1},
                               {1, 1}, 
                               {3, 6}, 
                               {4, 24}, 
                               {5, 120}};
    }
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRigArgumentReturnsWell(int n, long expected){
        assertEquals(expected, MathUtil.getFactorial(n));
    }
    
    //Bắt Exception, J4: @Test(expected = Ngoại lệ.class)
    //               J5: khác, dùng Lambda Expression
    
    @Test
    public void testFactorialGivenWrongArgumentThrowsException(){
       //Executable negativeF = () -> MathUtil.getFactorial(-5);
        assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));   //LAMBDA EXPRESSION
    }
}
