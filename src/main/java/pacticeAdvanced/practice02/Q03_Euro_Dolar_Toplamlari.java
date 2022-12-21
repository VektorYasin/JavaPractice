package pacticeAdvanced.practice02;

import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Q03_Euro_Dolar_Toplamlari {
    /*
    tek bir string içerisinde verilen euro ve dolarların ayrı ayrı toplam
    ornek:"$1 $12 E34 E56, $45 E78"
     */

    public static void main(String[] args) {
        String str= "$1 $12 €34 €56 $45 €78";

        String arr [] = str.split(" ");  //str'ı al, " " dan split yap ve arr'a ata.
        System.out.println(Arrays.toString(arr)); //[$1, $12, €34, €56, $45, €78]

        int dolarToplami=0;
        int euroToplami=0;

        for(String w : arr){
            if(w.contains("$")){
                dolarToplami += parseInt(w.replace("$",""));
            }else{
                euroToplami += parseInt(w.replace("€", ""));
            }
        }
        System.out.println("dolar toplamı =" +dolarToplami);
        System.out.println("euro toplamı =" +euroToplami);
        }
    }

