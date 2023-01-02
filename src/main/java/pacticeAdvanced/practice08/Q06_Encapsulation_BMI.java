package pacticeAdvanced.practice08;

import java.util.Scanner;

public class Q06_Encapsulation_BMI {
    /*
    security icin yapılır, variable'Ları "private" yapınca baska yerden ulasılamaz,
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("kilonuzu kg olarak gir:");
        double kilo = input.nextDouble();

        System.out.println("boyunuzu m cinsinden gir:");
        double boy = input.nextDouble();

        BMI kisi1 = new BMI(kilo, boy);//once sınıftan obje yarat, o obje ile metot cagir
        kisi1.MBIHesapla();

    }
}
