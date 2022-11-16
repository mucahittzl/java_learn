package HalukHocaJava.j01_Variables.j32_Abstract.Ornek2;

public class Dikdörtgen extends Sekil{


    private  double uzunKenar;
    private  double KisaKenar;

    public Dikdörtgen(double uzunKenar, double kisaKenar) {//full p'li cons.
        this.uzunKenar = uzunKenar;
        KisaKenar = kisaKenar;
    }

    @Override
    public double alanHesapla() {
        return this.KisaKenar*this.uzunKenar;
    }

    @Override
    public double cevreHesapla() {
        return (this.uzunKenar+this.KisaKenar)*2;
    }
}
