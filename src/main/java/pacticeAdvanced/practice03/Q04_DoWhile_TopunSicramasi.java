package pacticeAdvanced.practice03;

import java.util.Scanner;

public class Q04_DoWhile_TopunSicramasi {

    public static void main(String[] args) {
        /*
        scanner ile yüksekliği al
        her sıcramada 3/4 sicrama azalıyor 1 m altında duruyor
         */
        Scanner input = new Scanner(System.in);
        System.out.println("bırakılan yüksekliğ gir");

        double yukseklik = input.nextDouble();

        double toplamYol = 0;
        int vurmaSayisi = 0;

        do {
            vurmaSayisi++;
            toplamYol += yukseklik;
            yukseklik = yukseklik * 0.75;
            toplamYol += yukseklik;

        } while (yukseklik > 1);

        System.out.println("yere vurma sayısı " + vurmaSayisi);
        System.out.println("toplam alınan yol " + toplamYol);


    }
}
