package pacticeAdvanced.practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCikar {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        List<Integer> list= new ArrayList<>();

        while(true){

            System.out.println("ekleme yapmak için 'add'\n"+
                    "güncelleme yapmak için 'update'\n"+
                    "silmek için 'delete'\n"+
                    "çımamk için 'quit' komutunu giriniz");

            String option= input.next();//option string olarak kullanıcı tarafından yazılacak


            if(option.equalsIgnoreCase("add")){
                System.out.println("eklemek istediğiniz sayıyı giriniz");
                int eklenecekSayi= input.nextInt();
                list.add(eklenecekSayi);

            }else if(option.equalsIgnoreCase("update")){
                System.out.println("guncellemek istediginiz sayıyı giriniz..:");
                int guncellencekSayi= input.nextInt();
                System.out.println("yeni sayıyı giriniz..:");
                int yeniSayi= input.nextInt();
                list.set(list.indexOf(guncellencekSayi), yeniSayi);


            }else if(option.equalsIgnoreCase("delete")){
                System.out.println("silmek istediğiniz sayiyi gir..:");
                int silinecekSayi= input.nextInt();
                list.remove((Integer)silinecekSayi);//sayının indeksi yerine kendisini girmek için Integer wrapper classa, type casting yaptık, artık objeye dönüştü
            }

            else if(option.equalsIgnoreCase("quit")){
                break;
            }else{
                System.out.println("gecerli bir komut giriniz");
            }
            System.out.println(list);

        }

    }

}
