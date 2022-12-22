package pacticeAdvanced.practice05;

import java.util.Scanner;

public class Q02_NestedFor {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("satir sayisini gir:");

        int satir=input.nextInt();
        for(int i=0; i<satir; i++){//satir kontrolu
           for(int bosluk=satir-i; bosluk>1; bosluk--){
               System.out.print(" ");
           }
           for(int yildiz=0; yildiz<=i; yildiz++){
               System.out.print("* ");

           }
            System.out.println();
        }
    }
}
