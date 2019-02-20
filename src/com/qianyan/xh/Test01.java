package com.qianyan.xh;

/**
 * 打印1000以内可以被5整除的
 * 每行输出三个
 */
public class Test01 {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++){
            if (i%5==0){
                System.out.print(i+"\t");
            }
            if (i%(3*5)==0){
                System.out.println();
            }

        }
    }
}
