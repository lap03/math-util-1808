/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.navercorp.mathutil.core.test;

import com.navercorp.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author tinle
 */
public class MathUtilityDDTest {
   
    // chuẩn bị bộ data đưa vào getF
    //0! -> 1; 1! -> 1; 2! -> 2; 3! -> 6; 4! -> 24; 5! -> 120, 6! -> 720
    //{0, 1}, {1, 1}, {2, 2}, {3, 6},...
    public static Object[][] initData() {
        return new Object[][] {
            {0, 1},
            {1, 1}, 
            {2, 2}, 
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720}
        };
    }
    
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgrumentReturnsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
