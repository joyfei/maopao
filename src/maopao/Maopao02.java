package maopao;

import java.util.Arrays;

/**
 *
 * @author qianyan
 *
 */
public class Maopao02 {
    public static void main(String[] args) {
        int[] arr={7,1,2,4,5,3,6,8,9,10};
        sortFinal(arr);
    }

    public static void sortFinal(int[] arr) {
        boolean sorted =true;//假定有序
        int len = arr.length;
        for(int j=0;j<len-1;j++) {
            sorted=true;
            System.out.println("第"+(j+1)+"趟");
            for(int i=0;i<len-1-j;i++) {//次数
                System.out.print("第"+(i+1)+"次");
                if(arr[i]>arr[i+1]) {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    sorted=false;//假定失败
                }
                System.out.println(Arrays.toString(arr));
            }
            if(sorted) {
                break;
            }
        }
    }
}
