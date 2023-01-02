package pacticeAdvanced.practice6;

import java.util.Scanner;

public class Q01_RastegeleSayiMatriksi {
    //10x10 rastegele sayi oluşturan matriks

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı gir");
        int sayi = input.nextInt();

        for (int i = 0; i < sayi; i++) {

            for (int j = 0; j < sayi; j++) {

                System.out.print((int) (Math.random() * 2) + " ");
                //Math.random() her zaman 0 ile 0,9999 arasında bir sayi üretir,
                //bunu 2 ile çarpıp int kısmını alırsak 0 ve 1 elde ederiz.
            }
            System.out.println();
        }


    }

}
