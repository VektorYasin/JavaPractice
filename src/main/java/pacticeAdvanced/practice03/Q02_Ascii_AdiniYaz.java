package pacticeAdvanced.practice03;

public class Q02_Ascii_AdiniYaz {
    //adınızın içerdiği harfleri kullanmadan adınızı yazdıran bir kod yazdırı


    public static void main(String[] args) {
        //java 'A' char ile matematik işlem yapar, "Aaé" string ile yapmaz

        char ch1='B'-1;//A
        char ch2='m'-1;//l
        char ch3='h'+1;//i
        System.out.println(""+ch1+ch2+ch3);//başa string koyunca conconatation yapar
        //java yukarıdan aşagıya ve soldan sağa çalışır

    }
}
