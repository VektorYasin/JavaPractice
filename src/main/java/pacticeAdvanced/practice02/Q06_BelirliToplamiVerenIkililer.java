package pacticeAdvanced.practice02;

public class Q06_BelirliToplamiVerenIkililer {
    /*
    {4 6 5 -10 8 5 20}

     */

    public static void main(String[] args) {
        int[]arr = {4, 6, 5, -10, 8, 5, 20};
        iklileriBul(arr, 10);

    }
    public static void iklileriBul(int[] arr, int number){

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==number){
                    System.out.println(arr[i]+ "+" +arr[j]+ "=" + number);

                }
            }

        }


    }
}
