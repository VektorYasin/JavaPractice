package pacticeAdvanced.practice04;

import java.util.Scanner;

public class Q01_Switch_AyGunleri {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("yılı giriniz..:");
        int yil= input.nextInt();
        System.out.println("ay numarasını giriniz..:");
        int ay= input.nextInt();

        int gun;
        //1,3,5,7,8,10,12  -->31 gun
        //4,6,9,11--> 30 gun

        switch (ay){
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                gun= 31;
                System.out.println("girdiginiz gun sayısı : "+ gun);
                break;

            case 4: case 6: case 9: case 11:
                gun=30;
                System.out.println("girdiginiz gun sayısı = "+ gun);
                break;

            case 2:
                if((yil%4 ==0 && yil%100 !=0) || yil%400==0){
                    gun=29;
                    System.out.println("girdiginiz gun sayısı = "+ gun);

            }else {
                    gun=28;
                    System.out.println("girdiginiz gun sayısı = "+ gun);
                }
                break;

            default:
                System.out.println("gecerli bir gun numarası gırınız");



        }

    }
}
