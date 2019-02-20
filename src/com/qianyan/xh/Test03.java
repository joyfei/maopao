package com.qianyan.xh;

public class Test03 {
    public static void main(String[] args) {
        int count = 0;
        count: for (int i=101;i<150;i++){
            for (int j=2;j<i/2;j++){
                if (i%j==0)
                    continue count;
            }
            System.out.print(i+"\t");
        }
    }
}
