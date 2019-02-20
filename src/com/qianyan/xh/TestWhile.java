package com.qianyan.xh;

public class TestWhile {
    public static void main(String[] args) {
        int a=1;//初始化
        int s=0;
        while (a<100){//条件判断
            System.out.println(a);//循环体
            a+=2;//迭代
            s=s+a;
        }
        System.out.println(s);
    }
}
