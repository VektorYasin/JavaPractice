package pacticeAdvanced.practice08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_UzunKelime {
    /*
    cumledeki en uzun kelimleri return eden bir metod yaz

    statik metodları dogrudan class içinde cagırıp kullanabiliriz
    statik olmayan metodları, obje yaratarak kullanabiliriz.
    */

    public static void main(String[] args) {
        System.out.println("enUzunKelime = " + enUzunKelime());

    }//main

    public static List<String> enUzunKelime() {

        Scanner input = new Scanner(System.in);

        System.out.println("bir cumle giriniz?");

        String cumle = input.nextLine();

        String[] arr = cumle.split(" ");//ali okula geldi
        System.out.println(arr);


        int max = 0;
        for (String w : arr) {
            if (w.length() > max) {
                max = w.length();
            }
        }

        List<String> enUzunKelimeler = new ArrayList<>();

        for (String w : arr) {
            if (w.length() == max) {
                enUzunKelimeler.add(w);

            }
        }

        return enUzunKelimeler;
    }


}//class
