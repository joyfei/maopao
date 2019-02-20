package maopao;

import java.util.Arrays;
/**
 * 冒泡
 * 从小到大排序
 * @author qianyan
 *
 */
public class Maopao01 {
    int[] arr= {5,9,3,6,8,4};
    public void maopao() {
        for(int j=0;j<arr.length-1;j++) {
            System.out.println("第"+(j+1)+"趟");
            for(int i=0;i<arr.length-1;i++) {
                System.out.println("第"+(i+1)+"次");
                if(arr[i]>arr[i+1]) {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                }
                System.out.println(Arrays.toString(arr));
            }
        }


    }
    public static void main(String[] args) {
        Maopao01 mao =new Maopao01();
        mao.maopao();


    }
}