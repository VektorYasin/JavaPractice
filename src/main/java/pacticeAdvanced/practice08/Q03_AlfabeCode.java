package pacticeAdvanced.practice08;

import java.util.Scanner;

public class Q03_AlfabeCode {
    //abcdefghijklmnoprstuvyz    ali=zor
    //zyvutsrponmlkjihgfedcba
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("bir string giriniz");
//
//        String str1="abcdefghijklmnoprstuvyz";
//        String str2="zyvutsrponmlkjihgfedcba";
//        String str3=input.nextLine();
//
//        for(int i=0; i<str3.length(); i++){//ali
//
//            for(int j=0; j<str1.length(); j++){
//
//                if(str3.charAt(i) == str1.charAt(j)){
//
//                    System.out.print(str2.charAt(j));
//                }
//            }
//        }

        //2.yol
        System.out.println("bir string giriniz");
        String str = input.nextLine();//veli

        for (int i = 0; i < str.length(); i++) {

            int index = 'z' - str.charAt(i);

            System.out.print((char) ('a' + index));
        }
    }
}
