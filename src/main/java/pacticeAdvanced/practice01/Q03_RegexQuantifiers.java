package pacticeAdvanced.practice01;

public class Q03_RegexQuantifiers {
    public static void main(String[] args) {
        //bir string değerin belirli sayıda bir karakter içerip belirli bir karakter ile bitip bitmediğini kontrol edelim
        String str = "!s";
        System.out.println(str.matches(".."));//iki karakter olup olmadıgını kontrol eder
        System.out.println(str.matches(".s"));//ture --herhangi bir karakter ile başlayıp  s harfi ile bittiğini gösterir
        //matches() methodu regex ile çalışıp String değerin regex ile karşılaştırmasını yapar.

        System.out.println(str.matches("..s"));//false verir, 3 karakter yok

        //bir String degerin 2nci karakterinin belirli bir karakter olup olmadığını kontrol et
        System.out.println("jshshdshbdshbdh".matches(".s.*"));
        System.out.println("   jshshdshbdshbdh".trim().matches(".s.*"));
        //.* istediğimiz kadar karakter olabilir demek.


        //bir string değerin sadece harf içerip içermediğini kontrol et
        System.out.println("abc".matches("[a-zA-Z].*"));

        //string degerin belirli bir sayıda belirli karakterleri içerdiği
        System.out.println("abchd".matches("[a-zA-Z]{5}"));//true--5 karakterli ve hepsi harf
        System.out.println("AbchdX".matches("[a-zA-Z]{5}"));//false--5ten fazla karakter içeriyor
        System.out.println("1dfgh".matches("[a-zA-Z]{5}"));//false--harf dışında karakter içeriyor

        //string degerin belirli sayıda en az belirli sayıda içerdiği
        System.out.println("123456".matches("[0-9]{5}"));//false--5 rakam içersin ancak 6 rakam var
        System.out.println("12345".matches("[0-9]{6,10}"));//false--en az 6 en fazla 10 rakam içermeli
        System.out.println("123456X".matches("[0-9]{6,10}"));//false--en az 6 en fazla 10 rakam içermeli fakat burda rakam dışında karakter içeriyor

        //string degerin belirli karakterleri en az ve en çok belirli sayıda içerdiği
        System.out.println("abcd123xAc".matches("\\w{7,10}"));//true-->7-10 arası haraf ve reakam içerebilir
        //   "\\w=[a-zA-Z0-9_] demek"

        System.out.println("abcd123xA_".matches("\\w{7,10}"));// "_ harf ve rakam grubuna dahil"

        //ilk karakteri 1, 2.karakteri noktalama işareti, ve kalan 8 karakter ve toplam 10 karakter
        System.out.println("1?.!12345678".matches("[1][\\p{Punct}]{3}[0-9]{8}"));
        /*
         [] parantez bir karakter demek
         [\p{Punct}] ifadesi ilgili karakterin bir noktalama işareti olacağını gösteriyor
         [1] [\\p{Punct}]{3}  [0-9]{8}--> ilk karakter 1, sonarki üç karakter {3} noktalama [\\p{Punct}]  {3}
         [0-9]{8} geriye kalan 8 karakter ise rakam olacak demek
         */
        System.out.println("1?.!12345678".matches("[1][\\p{Punct}]{3}[0-9]*"));// * istediğim sayıda rakam olacak geriye kalanlar

        System.out.println("1?.!12345678".matches("[1][\\p{Punct}]{3}[0-9]{8}"));

        System.out.println("1?12345678".matches("[1]{1}[\\p{Punct}]{1}[0-9]{8}"));


    }

}
