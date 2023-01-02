package pacticeAdvanced.practice08;

public class Q04_ExceptionThrows {


    public static void main(String[] args) throws Exception {

        //kendi oluşturduğumuz exception'a "custom exception" denir.
        rastegeleSayi();


    }

    public static void rastegeleSayi() throws Exception {
        int a = (int) (Math.random() * 11);
        int b = (int) (Math.random() * 11);

        System.out.println(a + b);

        //throw ile kullanırsak sürekli handle etmek zorundayız.
        //methodu baska bir yerde kullanırsak yine handle etmek zorundayız
        //try-catch yaparsak bir kere handle ediyoruz.

        if (a + b < 12) {//throm new exception
            throw new Exception("Sayı 12'den kücük ise hata verirr");

        }


    }
}
