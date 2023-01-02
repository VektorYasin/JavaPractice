package pacticeAdvanced.practice05;

public class Q03_MethodOverloading_Hacim {
    //kup, kare prizma, ve dikdortgen prizmanın hacmini hesapla
    //1,2 ve 3 parametreli bir metod
    //method overloading, metod isim kalabalığını onler

    public static void main(String[] args) {
        Hacim hacim = new Hacim();
        int karePrizma = hacim.hacimHesapla(5);
        int kupPrizma = hacim.hacimHesapla(5, 6, 7) + 50;
        int dikdortgenPrizma = hacim.hacimHesapla(5, 9);
        System.out.println(kupPrizma);
        System.out.println(karePrizma);
        System.out.println(dikdortgenPrizma);
        System.out.println(hacim.hacimHesapla(10));
        System.out.println("dikdortgenPrizma = " + hacim.hacimHesapla(1, 2, 3));

        //method overriding: parent classtaki metodu, child clasta body'sini
        //değiştirerek kullanmaktır.
    }


}



