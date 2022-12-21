package pacticeAdvanced.practice01;

import java.util.Scanner;

public class Q05_DoWhile_TahminOyunu {

    /*
    0 ile 100 arasında rastegele numara tahmini yapan bir oyun yazın
    girdiginiz numara rastgele numaraddan küçükse -daha buyuk numara gir
    buyukse daha kucuk numara gır
    esıtse tebrıkler
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi;
        int sayac = 0;

        int rastgelesayi = (int) (Math.random() * 100) + 1;//random 0-1 arasında rastegele bir sayı üretir
        System.out.println("rastgelesayi = " + rastgelesayi);

        System.out.println("0-100 arasi bir sayı tahmini gir");
        do {
            sayac++;

            sayi = input.nextInt();

            if (sayi == rastgelesayi) {
                System.out.println("Tebrikler...");

            } else if (sayi < rastgelesayi) {
                System.out.println("daha buyuk bir sayi gir");

            } else {
                System.out.println("daha kucuk bir sayi gir");
            }
            if (sayac == 10) {
                System.out.println("hakkınız bitti");
                break;
            }
            System.out.println(10-sayac + " hakkınız kaldı");

        } while (sayi != rastgelesayi);
    }
}
