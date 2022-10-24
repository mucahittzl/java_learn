package j19_StaticVariable;

public class C01_OgrtmnRunner {
    public static void main(String[] args) {
        C01_Ogrtmn.okul="KABATAŞ ERKEK LİSESİ"; //GÜNEŞ DEĞERİ UPDATE OLDU

    C01_Ogrtmn hc1=new C01_Ogrtmn("Cüneyt",11);
        System.out.println("hc1.tecrübe = " + hc1.tecrübe);
        System.out.println("hc1.isim = " + hc1.okul);
      //  hc1.okul="kabadaş";
        System.out.println("hc1.isim = " + hc1.isim);


        C01_Ogrtmn hc2=new C01_Ogrtmn("Bekir",7);
        System.out.println("hc2.tecrübe = " + hc2.tecrübe);
        System.out.println("hc2.isim = " + hc2.isim);
      //  hc2.okul="kabatas";
        System.out.println("hc2.okul = " + hc2.okul);


        C01_Ogrtmn hc3=new C01_Ogrtmn("Nazım",13);
        System.out.println("hc3.tecrübe = " + hc3.tecrübe);
        System.out.println("hc3.isim = " + hc3.isim);
      //  hc3.okul="gabataş";
        System.out.println("hc3.okul = " + hc3.okul);

        hc1.evlilikYıldonumu();//obj ile non-static method call edildi
        C01_Ogrtmn.maasHesapla();//CLASSnAME İLE STATİC METHOD CALL EDİLDİ
        hc2.maasHesapla();//obje ile method call edildi -*-BAD PRACTİCE-*- SARI YAZDI UYARDI





    }

}
