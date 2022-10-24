package j18_Constructor;

public class C02_Arac {

    String marka;
    String model;
    int km = 10;
    double motorHacım;
    boolean vitesOuto = false;
    boolean ikinciEl;
    int yıl;

    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacım=" + motorHacım +
                ", vitesOuto=" + vitesOuto +
                ", ikinciEl=" + ikinciEl +
                ", yıl=" + yıl +
                '}';
    }

    public static void main(String[] args) {

        C02_Arac arac1 = new C02_Arac();//DEFAULT CONSTRUCTOR ILE ARAC1 CREATE EDİLDİ
        arac1.ikinciEl = true;
        arac1.marka = "volvo";
        arac1.km = 50000;
        arac1.model = "xc60";
        arac1.motorHacım = 2.4;
        //                  volvo               xc60        50000      default:0        true                    2.4
        System.out.println(arac1.marka + " " + arac1.model + " " + arac1.km + " " + arac1.yıl + " " + arac1.ikinciEl + " " + arac1.motorHacım);

//TASK-> 2. bir aracın tum fıeldlerını atayarak prınt edınız

        C02_Arac arac2 = new C02_Arac();

        arac2.ikinciEl = true;
        arac2.marka = "tofaş";
        arac2.km = 50000;
        arac2.model = "DoğanSLX i.e";
        arac2.motorHacım = 1.6;

        System.out.println(arac2.marka + " " + arac2.model + " " + arac2.km + " " + arac2.yıl + " " + arac2.ikinciEl + " " + arac2.motorHacım);
        System.out.println("arac2 = " + arac2);// referans değerini verir. sağ tık+generate+tostring() yaparsak voerride olur o şekilde yazılır.


    }
}