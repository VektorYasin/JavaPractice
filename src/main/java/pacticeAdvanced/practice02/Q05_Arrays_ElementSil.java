package pacticeAdvanced.practice02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05_Arrays_ElementSil {

    /*
    bir integer array olustur
    belirli bir inexteki elementi sil
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("array limitini gir");

        int limit=input.nextInt();//3
        int[] arr=new int[limit];

        for(int i=0; i<arr.length; i++) {
            System.out.println("Indeks giriniz: " + i);
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        //1.yol:
        System.out.println("silmek istediginiz indexi gir");
        int removeIndex = input.nextInt();

        int idx=0;
        int[] brr= new int[limit-1];//bir tane index silineceği için lenght 1 azalacak
        for(int i=0; i<arr.length; i++){
            if(removeIndex != i ){
                brr[idx]=arr[i];
                idx++;
            }
            System.out.println(Arrays.toString(brr));//[1, 3]

            //2.yol
            List<Integer> numberList=new ArrayList<>();
            for (int w: arr){
                numberList.add(w);
            }
            System.out.println(numberList);
            System.out.println("silmek istediginiz elementin indeksini gir");
            int silinecekIndeks=input.nextInt();
            numberList.remove(silinecekIndeks);
            System.out.println("silmek istediginiz elementi girin");
            //numberList.remove(numberList.indexOf(2));
            numberList.remove(numberList.indexOf(input.nextInt()));
        }

    }
}
