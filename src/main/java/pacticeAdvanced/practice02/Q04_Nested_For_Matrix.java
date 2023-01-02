package pacticeAdvanced.practice02;

import java.util.Scanner;

public class Q04_Nested_For_Matrix {

    /*
    2 boyutlu bir tablo olarak çarpım tablosu yaz
    1 2 3 4 5
    2 4 6 8 10
    3 6 9 12 15
    4 8 12 16 20
    5 10 15 20 25
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = input.nextInt();//5

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= sayi; j++) {
                System.out.print(String.format("%2d", j * i) + " ");
            }
            System.out.println();
        }
    }
}
