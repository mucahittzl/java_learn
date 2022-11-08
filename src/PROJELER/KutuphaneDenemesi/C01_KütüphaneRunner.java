package PROJELER.KutuphaneDenemesi;

public class C01_KütüphaneRunner {
    public static void main(String[] args) {


        C01_Kutuphane kitaplık=new C01_Kutuphane("sefalet","Mücahit",2010,100,"javaca",3.5,true);

        kitaplık.kitapAdı="sefalet";
        kitaplık.yazarAdı="Mücahit";
        kitaplık.kitapÖdül=true;
        kitaplık.KitapÜcreti=3.5;
        kitaplık.basımTarihi=2022;
        kitaplık.KitapDili="javaca";
        kitaplık.sayfaSayısı=100;
        C01_Kutuphane.kitapOnsöz();


        System.out.println("kitaplık = " + kitaplık);

    }
}
