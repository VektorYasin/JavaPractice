package pacticeAdvanced.practice05;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Q01_Ascii {

    //2 karakter arasındaki tüm karakterleri yazdıran bir kod

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ilk karakteri gir");
        char ch1 = input.next().charAt(0);
        System.out.println("ikinci karakteri gir");
        char ch2 = input.next().charAt(0);

        int ilk = Math.min(ch1, ch2);//iki sayıdan min seçer
        int ikinci = Math.max(ch1, ch2);//iki sayıdan max secer

        for (int i = ilk + 1; i < ikinci; i++) {
            System.out.print((char) i + " ");
        }


    }
}
