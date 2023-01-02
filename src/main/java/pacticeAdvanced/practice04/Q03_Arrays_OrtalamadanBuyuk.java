package pacticeAdvanced.practice04;

public class Q03_Arrays_OrtalamadanBuyuk {
    public static void main(String[] args) {
        int[] arr = {5, 9, 15, 1, 0, 11, 3, 7, 9};

        int toplam = 0;
        for (int w : arr) {
            toplam += w;
        }

        double ortalama = toplam / arr.length;//list, arrayden daha güçlüdür, non primitivedir.
        System.out.println(ortalama);
        for (int w : arr) {
            if (w > ortalama) {
                System.out.print(w + " ");
            }
        }
    }

}
