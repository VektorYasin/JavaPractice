package pacticeAdvanced.practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahToCelcius {
    public static void main(String[] args) {
        //fah to celcius ceviren kod yaz
        //formul c= (f-32)*5/9

        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit degeri gir");

        double f = input.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println(c);

        NumberFormat numberFormat = new DecimalFormat(",##");
        //class                         //constructor
        String formattedC = numberFormat.format(c);
        System.out.println("formattedC = " + formattedC + 1);//concatenation
        double doubleC = Double.valueOf(formattedC);
        System.out.println("doubleC = " + (doubleC + 1));//matematiksel islem

    }


}
