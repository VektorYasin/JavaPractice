package pacticeAdvanced.practice02;

import java.util.Scanner;

public class Q01_IfDiscirimanant {
    public static void main(String[] args) {
        /*
        ax^2+bx +c;
        kullanıcıdan a,b, c al
        formul= 8-b+/- karakok/2a
         */


        Scanner input= new Scanner((System.in));
        System.out.println("denklemin a,b,c sayılarını gir");
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();

        int delta= b*b-4*a*c;

        if(delta>0){
           double x1=(-b+ Math.sqrt(delta))/(2*a);
           double x2= (-b-Math.sqrt(delta)/(2*a));
            System.out.println("denklemin iki koku vardir: x1="+ x1+"x2="+x2);

        }else if(delta==0){
            double x= -b/(2*a);
            System.out.println("denklemin bir koku vardir:x="+ x);

        }else System.out.println("denkelmin bir koku yoktur");

    }



}
