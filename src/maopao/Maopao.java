package maopao;
import java.util.Arrays;
/**
 * 冒泡算法学习
 * @author qianyan
 *
 */

public class Maopao {
    public static void main(String[] args) {
        int[] arr= {5,9,3,6,8,4};
        int i=0;
        if(arr[i]>arr[i+1]) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        System.out.println("第一次");
        System.out.println(Arrays.toString(arr));

        i++;
        if(arr[i]>arr[i+1]) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        System.out.println("第二次");
        System.out.println(Arrays.toString(arr));

        i++;
        if(arr[i]>arr[i+1]) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        System.out.println("第三次");
        System.out.println(Arrays.toString(arr));

        i++;
        if(arr[i]>arr[i+1]) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        System.out.println("第四次");
        System.out.println(Arrays.toString(arr));

        i++;
        if(arr[i]>arr[i+1]) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        System.out.println("第五次");
        System.out.println(Arrays.toString(arr));


    }
}
