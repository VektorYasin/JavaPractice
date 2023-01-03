package pacticeAdvanced.practice09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q02_MarketGunlukGelir {


    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "sali", "carsamba", "persembe", "cuma", "cumartesi", "pazar"));
    static List<Double> gunlukGelirler = new ArrayList<>();
    static double toplamGelir = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gun = 0;
        while (gun < 7) {
            System.out.println(gunler.get(gun) + " gelirini giriniz");
            double gununGeliri = input.nextDouble();
            gunlukGelirler.add(gununGeliri);
            toplamGelir += gununGeliri;
            gun++;
        }

        System.out.println("gunluk gelirler:" + gunlukGelirler);
        System.out.println("toplam gelir : " + toplamGelir);
        System.out.println("Gelir ortalaması: " + gelirOrtalamasi());
        System.out.println("ortlama ustu gunler :" + ortalamUstuGelirler());
        System.out.println("ortlama alti gunler :" + ortalamAltiGelirler());

    }

    static double gelirOrtalamasi() {
        return toplamGelir / gunler.size();
    }

    static String ortalamUstuGelirler() {
        String str = "";
        for (int i = 0; i < gunlukGelirler.size(); i++) {
            if (gunlukGelirler.get(i) > gelirOrtalamasi()) {
                str += gunler.get(i) + " ";
            }

        }
        return str;
    }

    static String ortalamAltiGelirler() {
        String str = "";
        for (int i = 0; i < gunlukGelirler.size(); i++) {
            if (gunlukGelirler.get(i) < gelirOrtalamasi()) {
                str += gunler.get(i) + " ";
            }

        }
        return str;
    }

}
