package j18_Constructor;

public class C04_Teacher {
    String ad;
    String soyad;
    String branş;
    double maaş;
    int tecrübe;
    int id;
    boolean emekli;

    public C04_Teacher(String ad, String soyad, String branş, double maaş, int tecrübe, int id, boolean emekli) {
        this.ad = ad;
        this.soyad = soyad;
        this.branş = branş;
        this.maaş = maaş;
        this.tecrübe = tecrübe;
        this.id = id;
        this.emekli = emekli;
    }

    public C04_Teacher() {// parametrelinin ezdiği default cons yerine parametresiz cons create edildi
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", branş='" + branş + '\'' +
                ", maaş=" + maaş +
                ", tecrübe=" + tecrübe +
                ", id=" + id +
                ", emekli=" + emekli +
                '}';
    }
//King Trick-> parametreli constructor parametresızı default eder
    public void dersSaati(){
        System.out.println("agam haftada 20 saatten sonrası extraya girer");
    }

}
