package pacticeAdvanced.practice04;

import java.util.ArrayList;
import java.util.List;

public class Q04_ArraysOrtakElemanlar {
    // input1={John, Brad, angel,sofia, emily}
    //input1={brad, sofia, emily}

    public static void main(String[] args) {
        String []arr={"John", "Brad", "angel","sofia", "emily"};
        String [] brr= {"sofia", "Brad", "grace","hazel", "emily"};

        List<String> list=new ArrayList<>();

        for(String w: arr){   //w bir kez çalışırken u eleman sayısı kadar çalışıp eşit mi diye kontrol edecek.
            for(String u:brr){
                if(w.equalsIgnoreCase(u)){
                    list.add(w);
                }
            }
        }
        System.out.println("ortak elementler= "+list);
    }
}
