package com.qianyan.xh;

/**
 * 计算1+2+3+4+5+6...+100;
 */
public class XunHuan {
    public static void main(String[] args) {
        int a = 1;//初始化
        int b = 0;//初始化
        while (a<=100){//条件判断
            b = b + a ;
            a++;//迭代
        }
        System.out.println(b);
    }
}
