package pacticeAdvanced.practice6;

import java.util.Scanner;

public class Q02_RastegeSifreOlusturma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("karakter sayisini gir");
        int karakterSayisi = input.nextInt();

        String sifre = "";
        int sayac=0;

        String karakterler = "ABCDEFGHIJKLMNOPRSTUVYZabcdefghijklmnoprstuvyz123456789";
        int maxIndeks = karakterler.length();

        while (sayac<karakterSayisi) {

            int rastgeleIndeks=(int) (Math.random()*maxIndeks);
            sifre += karakterler.charAt(rastgeleIndeks);

            sayac++;

        }
        System.out.println("sifre = " + sifre);


    }


}
