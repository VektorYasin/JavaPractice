package pacticeAdvanced.practice08;

import java.util.Arrays;

public class Q01_ArrayToStringNegative {
    /*
    input String []arr={J,a, v,a, I,s,D,i,f,f,i,c,u,l,t};
    output= JavaIsNotDifficult
    stringbuilder mutuable yapıda; string immutable yapıda, her işem için yeni memory tahsis eder
    */
    public static void main(String[] args) {

        String[] arr={"J","a","v","a", "I","s","D","i","f","f","i","c","u","l","t"};
        System.out.println(Arrays.toString(arr));
        //once stringe cevirdim. sonra replace ile degistirdim

        String str="";
        for(String w: arr){
            str +=w;
        }
        System.out.println("str = " + str);
        
        String strNegative= str.replace("Is", "IsNot");
        System.out.println("strNegative = " + strNegative);

    }

}
