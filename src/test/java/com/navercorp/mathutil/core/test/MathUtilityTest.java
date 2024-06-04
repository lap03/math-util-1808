/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.navercorp.mathutil.core.test;
//tên miền đảo ngc

import com.navercorp.mathutil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tinle
 */
public class MathUtilityTest {
    //test case là bộ data đầu vào + thao tác nhập xuất trên app, màn hình, trên hàm
    // để verify 1 hàm, màn hình, chức năng chạy đúng hay sai
    //test case 1: check getF() with n = 0
    // * input/given n = 0
    // * steps/Procedure (bước test)
    //   call method getF(n)
    // * expected rs: 1
    // * actual rs: ??? chờ chạy mới biết
    // * status: passed : failed
    @Test // frame work ép ta phải viết theo 1 quy tắc nào đó
          // thư viện cho viết tự do, gọi hàm tự do
          // framwork là thư viện, nhưng thư viện ko hẳn là framework
    public void testFactorialGivenRightArg0ReturnWell() {
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    //test case 1: check getF() with n = 1
    // * input/given n = 1
    // * steps/Procedure (bước test)
    //   call method getF(n)
    // * expected rs: 1
    // * actual rs: ??? chờ chạy mới biết
    // * status: passed : failed
    @Test // frame work ép ta phải viết theo 1 quy tắc nào đó
          // thư viện cho viết tự do, gọi hàm tự do
          // framwork là thư viện, nhưng thư viện ko hẳn là framework
    public void testFactorialGivenRightArg1ReturnWell() {
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    //test case 3: check getF() with n = 5
    // * expected rs: 120
    @Test
    public void testFactorialGivenRightArg5ReturnWell() {
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    @Test
    public void testFactorialGivenRightArg12345ReturnWell() {
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    //ngoại lệ
    //test case #5: check getF()with n = -1, the method throw exception
    @Test
    public void testFactorialGivenWrongArg_1ThrowException() {
//        MathUtility.getFactorial(-1);
          assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-1);});
    }
 }
