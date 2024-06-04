/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.navercorp.mathutil.main;

import com.navercorp.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class MathUtil1808 {
    
    public static void main(String[] args) {
        //cách 2: test hàm = cách popup
        int n = 0;
        long expectedValue = 1;
        long actualValue;
        actualValue = MathUtility.getFactorial(n);
        String rs = n + "! | expected: " + expectedValue + " | Actual: " + actualValue;
        JOptionPane.showMessageDialog(null, rs);
    }

//    public static void main(String[] args) {
//        //TEST CASE 01
//        //n = 0, ex value = 1, actual value = ? status: passed/failed
//        int n = 0;
//        long expectedValue = 1;
//        long actualValue;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("0! expected: " + expectedValue + " Actual:" + actualValue);
//        
//        //TEST CASE 02
//        //n = 1, ex value = 1, actual value = ? status: passed/failed
//        n = 1;
//        expectedValue = 1;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("1! expected: " + expectedValue + " Actual:" + actualValue);
//        
//        //TEST CASE 03
//        //n = 5, ex value = 120, actual value = ? status: passed/failed
//        n = 5;
//        expectedValue = 120;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("5! expected: " + expectedValue + " Actual:" + actualValue);
//        
//        //TEST CASE 04
//        //n = -1, ex value = thấy ngoại lệ, actual value = ? status: passed/failed
//        System.out.println("check if the illegal argument exception is thrown");
//        n = -1;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("5! expected: " + expectedValue + " Actual:" + actualValue);
//    }
}
