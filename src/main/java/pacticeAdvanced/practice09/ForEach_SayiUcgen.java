package pacticeAdvanced.practice09;

import java.util.Scanner;

public class ForEach_SayiUcgen {

    /*
    1 2 3 4 5 6
     2 3 4 5 6
      3 4 5 6
       4 5 6
        5 6
         6
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("satir sayisini gir..:");
        int satirSayisi = input.nextInt();

        for (int i = 1; i <= satirSayisi; i++) {//satir sayisini yazidirir.

            for (int bosluk = 1; bosluk < i; bosluk++) {//boslukları yazıdırır.
                System.out.print(" ");

            }
            for (int sayi = i; sayi <= satirSayisi; sayi++) {//sayilari yazdirir
                System.out.print(sayi + " ");
            }
            System.out.println();
        }
    }
}
