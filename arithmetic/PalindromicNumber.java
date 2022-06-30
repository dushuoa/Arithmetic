package com.atguigu.arithmetic.arithmetic;

/**
 * @Author dushuo
 * @Date 2022/6/30 22:01
 * @Version 1.0
 */

//回文数算法
public class PalindromicNumber {

    public static void main(String[] args) {
        int num = 12321;

        boolean result = palindromicNumber(num);
        if(result){
            System.out.println(num+" 是回文数");
        }
    }

    private static boolean palindromicNumber(int num) {
        //回文数条件 不能小于0 不能是10的倍数 正着读反着读都一样
        if(num <= 0 || num%10 == 0){
            return false;
        }
        String numStr = String.valueOf(num);
        int index = 0;
        int end = numStr.length()-1;

        while (index < end){
            if(numStr.charAt(index) != numStr.charAt(end)){
                return false;
            }
            index ++;
            end --;
        }

        return true;
    }

}
