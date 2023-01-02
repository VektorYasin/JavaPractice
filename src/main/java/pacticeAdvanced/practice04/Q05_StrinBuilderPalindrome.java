package pacticeAdvanced.practice04;

public class Q05_StrinBuilderPalindrome {

    //bir string değerin palindrome olup olmadığı kontrol

    public static void main(String[] args) {

//        String str="nazan1";
//        String strReverse="";
//
//        for(int i=str.length()-1; i>=0; i--){
//
//            strReverse += str.charAt(i);
//        }
//        System.out.println(strReverse);
//
//
//        if(str.equalsIgnoreCase(strReverse)){
//            System.out.println("palindrome");
//        }else
//            System.out.println("palindrome değil");


        String str = "nazan1";

        StringBuilder stb = new StringBuilder(str);

        String stbReverse = stb.reverse().toString();//string builder objesini stringe çevirip String türünde stsbReverse atadık
        System.out.println(stb);

        if (str.equals(stbReverse)) {
            System.out.println("palindrome");
        } else
            System.out.println("palindrome değil");
    }


}



