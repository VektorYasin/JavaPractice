package pacticeAdvanced.practice03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q03_Arrays_IkinciMax {

    //input={}
    public static void main(String[] args) {
        int[] arr = {100, 10001, -90, 845, 8787, 898, 0, 1};

        //arr: primitive data type ile çalışır
        //array: npn primitive data ile çalışır.
        //primitivler, nonprimitivlerden daha hızlı çalışır

        Arrays.sort(arr);//arr natural order yaptı, kucukten buyuge

        System.out.println(Arrays.toString(arr));// arr yazdırdık

        System.out.println("min:" + arr[0] + " secMax:" + arr[arr.length - 2] + " max:" + arr[arr.length - 1]);

        //2.yol
        //int[] arr={100, 10001,-90, 845, 8787, 898,0,1};

        int min = arr[0];
        int secMax = arr[0];
        int max = arr[0];

        for (int w : arr) {

            if (w < min) {
                min = w;

            } else if (w > max) {

                secMax = max;
                max = w;

            } else if (w > secMax) {

                secMax = w;
            }

        }
        System.out.println("min:" + min + " secMax:" + secMax + " max:" + max);


    }
}
