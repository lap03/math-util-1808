/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navercorp.mathutil.core;

/**
 *
 * @author HP
 */
public class MathUtility {
    //Quy tắc đặt tên pakage trong Java
    // ghi chữ toàn tập, ghi theo tên miền công ty đảo ngược
    //com.ten-cty.ten-du-an.ten-module-nhom-chuc-nang
    //com.microsoft.sqlserver.jdbc

    // hàm tính n! = 1 . 2. 3. 4 . ... n
    //Hàm là static vì tính xong trả về th, không nhớ nhung gì cã
    //Thường các thư viện sẽ là static dùng chung tính toán mọi số liệu
    //Quy ước 0! = 1! = 1
    //Bài này chỉ làm từ 0 -> 20! vì 21! vượt (long)  
    public static long getFactorial(int n) {
        long product = 1; //tich-ket qua phep nhan
        //update code again to see green 4e
        
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Ivalid n. n must be between 0..20");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
