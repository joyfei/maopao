package com.qianyan.ifxh;

/**
 * if语句练习
 *
 */
public class Test01 {

    public static void main(String[] args) {
        double a=Math.random();
        int b=1+(int)(a*6);

        if (b==6){
            System.out.println("运气真好");
        }else if (b<3){
            System.out.println("运气不太好");
        }else  if (b>=3){
            System.out.println("运气还可以");
        }
        System.out.println(b);
    }


}
