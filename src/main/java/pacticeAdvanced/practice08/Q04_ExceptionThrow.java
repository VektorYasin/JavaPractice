package pacticeAdvanced.practice08;

import java.util.Random;

public class Q04_ExceptionThrow {


    public static void main(String[] args) throws Exception {

        //kendi oluşturduğumuz exception'a "custom exception" denir.
        rastegeleSayi();

    }

    public static void rastegeleSayi() throws Exception {

        Random random = new Random();

        while (true) {


            int a = random.nextInt(11);
            int b = random.nextInt(11);

            try {
                if (a + b < 12) {
                    throw new Exception();
                } else {
                    System.out.println(a + "---" + b);
                    System.out.println(a + b);
                    break;
                }

            } catch (Exception e) {
                System.out.println("a+b =" + (a + b));
                System.out.println("toplam 12'den kucuk olamaz");
            }
        }
    }
}
