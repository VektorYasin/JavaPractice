package pacticeAdvanced.practice6;

public class Q03_ArraySimetrik {
//arrayin simetrik olup olmadığını kontrol et

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 2, 1};
        System.out.println("Array simetrik mi = " + simetrik(arr));

    }

    public static boolean simetrik(int[] arr) {
        boolean sonuc = true;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != arr[arr.length - 1]) {

                sonuc = false;
                break;
            }
        }
        return sonuc;
    }
}
