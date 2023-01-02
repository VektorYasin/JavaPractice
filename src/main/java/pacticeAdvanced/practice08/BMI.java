package pacticeAdvanced.practice08;

public class BMI {
    private double kilo;
    private double boy;

    public BMI(double kilo, double boy) {
        this.kilo = kilo;
        this.boy = boy;
    }

    public BMI() {
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public void MBIHesapla() {
        double bmi = kilo / (boy * boy);
        System.out.println("BMI ="+bmi);

        if (bmi > 0 && bmi < 18) {
            System.out.println("zayif");
        } else if (bmi > 18 && bmi < 25) {
            System.out.println("normal");
        } else if (bmi > 25 && bmi < 30) {
            System.out.println("kilolu");
        } else if (bmi > 30) {
            System.out.println("obez");
        } else {
            System.out.println("gecerli deger gir");
        }

    }


    @Override
    public String toString() {
        return "BMI{" +
                "kilo=" + kilo +
                ", boy=" + boy +
                '}';
    }
}
