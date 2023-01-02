package pacticeAdvanced.practice04;

public class Q06_Static_Butce_Runner {
    //basit bir ev bütçesi yazınız

    public static void main(String[] args) {

        Butce baba = new Butce();
        System.out.println("Maas oncesi butce =" + Butce.butce);
        baba.maasAl(5000);
        System.out.println("Maas sonrası butce = " + Butce.butce);
        baba.harclikAl(500);

        baba.butcedenHarca(266);


        System.out.println("baba harclik = " + baba.harclik);

        Butce anne = new Butce();
        anne.maasAl(2000);
        anne.maasAl(3000);
        anne.harclikAl(2000);

        System.out.println("Butce= " + Butce.butce);
        System.out.println("harclik: " + anne.harclik);

        //bütçe statik olduğundan, herkesin bütçeden yaptığı harcama bütçeyi etkiler.


    }

}
