package pacticeAdvanced.practice09;

import java.util.Scanner;

public class Q05_Array_HarfKullanimSayisi {

    public static void main(String[] args) {

        //girilen stringdeki harf sayısını yazan program

        String str = "Good";
        String[] arr = str.split("");
        String cikti = "";

        for (String w : arr) {
            int sayac = 0;//neden sayac araya kondu?
            for (String u : arr) {
                if (w.equalsIgnoreCase(u)) {
                    sayac++;
                }
            }
                if (!cikti.contains(w)) {
                    cikti += w + sayac + " ";

                }
            }
        System.out.println(cikti);
        }
    }

