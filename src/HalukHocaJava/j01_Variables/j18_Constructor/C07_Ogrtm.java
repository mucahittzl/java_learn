package HalukHocaJava.j01_Variables.j18_Constructor;

public class C07_Ogrtm {

    String isim;
    int tecrübe;
    int kıdem=5;

    public C07_Ogrtm(String isim, int tecrübe) {//2p li cons
        this.isim = isim;
        this.tecrübe = tecrübe;
    }
    public void kıdemHesapla(int kıdem){//int parametreli void method
        System.out.println("agam kıdemın :"+(kıdem*2));//method parametresi değeri kıdeme atanır
        System.out.println("agam kıdemın :"+(this.kıdem*2));//inst. obj değeri kıdeme atanır
    }
}
