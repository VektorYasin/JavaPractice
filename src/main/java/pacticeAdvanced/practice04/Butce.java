package pacticeAdvanced.practice04;

public class Butce {

    public static int butce;
    public int harclik;

    public void harclikAl(int alinanHarclik) {
        harclik += alinanHarclik;
        butce -= alinanHarclik;
    }

    public void butcedenHarca(int harcanacakPara) {
        butce -= harcanacakPara;

    }

    public void harclikHarcamasi(int harclikHarcamasi) {
        harclik -= harclikHarcamasi;

    }

    public void maasAl(int alinanMaas) {
        butce += alinanMaas;
    }

}
