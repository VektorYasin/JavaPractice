package pacticeAdvanced.practice05;

public class Q04_Varargs_HesapMakinesi {
    //temel 4 matematik işlemini yapan kod
    public static void main(String[] args) {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        hesapMakinesi.toplama(3, 5, 8);
        hesapMakinesi.bolme(8, 2);
        hesapMakinesi.carpma(6, 4, 3);
        hesapMakinesi.cikarma(10, 8);
    }


}
