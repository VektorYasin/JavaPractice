package pacticeAdvanced.practice09;

import java.util.Scanner;

public class Q03_StringRakamToplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir string gir");
        String str = input.nextLine();

        rakamlarToplami(str);

    }

    static void rakamlarToplami(String str) {

        int toplam = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {

                toplam += Integer.parseInt("" + str.charAt(i));//ASCI degerleri almamasi için integere cevirdik
                            //Integer.parseInt(): char degerini int cevirir.
            }
        }
        System.out.println("Rakamlar toplami " + toplam);

    }

}
