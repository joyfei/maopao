package com.qianyan.suanfa;

/**
 * 阶乘方法运算
 * 使用递归算法
 */
public class TestRecursion {
    static int a = 0;

    static long fang(int n){
        if(n==1){
            return 1;
        }else {
            return n*fang(n-1);
        }
    }

    public static void test01(){
        System.out.println("testo1;"+a);
        if (a<10){//递归头
        test01();
        }else {//递归体
            System.out.println("over");
        }
        test02();
        test01();
    }
    public static void test02(){
        System.out.println("TestRecursion.test02()");
    }
    public static void main(String[] args) {
        fang(9);
    }
}
