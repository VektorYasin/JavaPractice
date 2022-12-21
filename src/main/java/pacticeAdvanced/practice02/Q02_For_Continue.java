package pacticeAdvanced.practice02;

import java.util.Scanner;

public class Q02_For_Continue {

    /*
    kullanıcı 5 sayı girsin
    bu sayılardan 5 ila 10 arasındakiler hariç toplamı bul
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int toplam=0;

        for(int i=0; i<5;i++){
            System.out.println("bir sayı giriniz..:");
            int sayi=input.nextInt();

            if(sayi>5 && sayi<10){
                System.out.println("girdiginiz sayı 5 ile 10 arasında oldugundan işleme alınmamıştır");
                continue;
            }
            toplam +=sayi;

        }
        System.out.println("toplam= "+ toplam);
    }
}
