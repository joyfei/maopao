package com.qianyan.xh;
/*
测试while和for循环后的练习题目
一百以内奇数和偶数的和
 */
public class TestWileFor {
    public static void main(String[] args) {
        int addsum =0;
        int evensum=0;
        for (int i=0;i<=100;i++){
            if(i%2!=0){
                addsum +=i;
            }else {
                evensum +=i;
            }

        }
        System.out.println("奇数的和："+addsum);
        System.out.println("偶数的和："+evensum);
    }

}
