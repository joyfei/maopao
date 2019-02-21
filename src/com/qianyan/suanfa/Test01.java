package com.qianyan.suanfa;

/**
 * 递归算法
 * 5*4*3*2*1
 */


public class Test01 {

    static int fang(int n){
        if(n==1){
            return 1;
        }else {
            return n*fang(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(fang(5));
    }
}
