package pacticeAdvanced.practice01;

import java.util.Scanner;

public class Q02_SubstringAdSoyad {
    public static void main(String[] args) {
        //tek seferde alacagımız ad soyadı 2 ayrı kelimyee ayır ad ve soyadı ayrı ayrı yazdı
        //orn Ali
        //soyad Can

        Scanner input = new Scanner(System.in);
        System.out.println("ad ve soyadınızı aralarında bir bosluk olacak sekilde gir");
        String adSoyad = input.nextLine();
        String ad = adSoyad.substring(0, adSoyad.indexOf(" "));
        String soyad = adSoyad.substring(adSoyad.indexOf(" ") + 1);
        System.out.println("Ad :" + ad);
        System.out.println("Soyad :" + soyad);
    }
}
