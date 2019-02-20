package com.qianyan.xh;

/**
 * 打印九成九表格
 */

public class Test02 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");

            }
            System.out.println();
        }

    }
}
