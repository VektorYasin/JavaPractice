package pacticeAdvanced.practice01;

import java.util.Scanner;

public class Q04_IfStatement_DikUcgen {

    public static void main(String[] args) {
        /*
        a2+b2=c2
         */
        Scanner input=new Scanner(System.in);
        System.out.println("1.kenarı gir");
        int birinciKenar=input.nextInt();
        System.out.println("2.kenarı gir");
        int ikinciKenar=input.nextInt();
        System.out.println("3.kenarı gir");
        int ucuncuKenar=input.nextInt();

        if(birinciKenar*birinciKenar+ikinciKenar*ikinciKenar==ucuncuKenar*ucuncuKenar){
            System.out.println("bu bir dik ucgendir.");

        }else if (birinciKenar*birinciKenar+ucuncuKenar*ucuncuKenar==ikinciKenar*ikinciKenar){
            System.out.println("bu bir dik ucgendir.");
        }else if (ikinciKenar*ikinciKenar+ucuncuKenar*ucuncuKenar==birinciKenar*birinciKenar){
            System.out.println("bu bir dik ucgendir.");
        }else {
            System.out.println("bu bir dik ucgen değildir.");

        }
    }

}
