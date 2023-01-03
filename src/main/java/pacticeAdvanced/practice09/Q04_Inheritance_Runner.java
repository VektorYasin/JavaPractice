package pacticeAdvanced.practice09;

public class Q04_Inheritance_Runner {
    public static void main(String[] args) {
        child obj1 = new child();
        obj1.i = 0;
        System.out.println(obj1.i);//0
        //Parent class'tan varaible alıp değiştirerek kullanabilir.
        //Parent class, child classların varaible'larını alıp kullanmaz.

        Parent objA = new Parent();
        objA.yazdir();//1

        Parent obj2 = new child();//child class, parent class tipinde data tipi seçebilir
        obj2.yazdir();//5
        System.out.println(obj2.j);//3 parent class'taki j degerini alır


    }


}
