package pacticeAdvanced.practice09;

import java.util.ArrayList;
import java.util.List;

public class Q06_List_RastegeleSayi {

    public static void main(String[] args) {

        rastegeleSayiEkle();

    }

    static void rastegeleSayiEkle() {
        List<Object> list = new ArrayList<>();
        //object data tipi tüm data tiplerini kabul eder, ancak fazla method kullanma secenegi vermez

        for (int i = 0; i < 10; i++) {

            list.add((int) (Math.random() * 21));
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if ((int) (list.get(i)) % 2 == 0) {
                list.set(i, "cift sayi");
            }
        }

        System.out.println(list);
        if (!list.contains("cift sayi")) {
            System.out.println("cift sayi yoktur");

        }
    }
}



