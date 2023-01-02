package pacticeAdvanced.practice03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q01_Arrays_IsaretDegistir {
    /*
    input 1,2, -3, 4, -5,-6
    output -1, -2, 3, -4, 5, 6
    elementlerin işaretini değiştir
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -5, -6};

        int[] brr = new int[arr.length];

        int idx = 0;

        for (int w : arr) {

            brr[idx] = w * -1;
            idx++;
        }
        System.out.println(Arrays.toString(brr));//[-1, -2, 3, -4, 5, 6]
    }
}
