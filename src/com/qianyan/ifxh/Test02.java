package com.qianyan.ifxh;

import java.util.Scanner;

/**
 * 用switch语句判断季节
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sea= new Scanner(System.in);//键盘输入
        int si= sea.nextInt();
        switch (si){
            case 3:
            case 4:
            case 5:
                System.out.println("这是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("这是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("这是秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("这是冬季");
                break;
                default:
                    System.out.println("没有这个季节");
        }
    }
}
