package HalukHocaJava.j01_Variables.j22_DateTime.GirisProjesi;

import java.util.ArrayList;
import java.util.Scanner;

public class GirisPaneli {




public static void giris(){
    Scanner sc=new Scanner(System.in);
    Kayıt yeniKayıt=new Kayıt();//Kayıt Class'a erişim için parametresiz cons. ile yeni kayıt objsi uretıldı.
    ArrayList<Kullanıcı> kişi=new ArrayList<>();//Kullanıcı Class'dan uretilen obj lerın tutulacagı boş list

    boolean cıkılsınMı=true;
    while (cıkılsınMı){
        System.out.println("agam ne istirsen\n1->Kullanıcı Kayıt al\n2->sanslı kişi bul\n3->Listele\n4->çıkış\nseçermisin:");
        int tercih= sc.nextInt();
        switch (tercih){

            case 1:
                kişi= yeniKayıt.kayıtAl();//Kayıt Class'dan yeniKayıt obj ile kayıtAl() method call edildi
                break;
            case 2:
                yeniKayıt.sansliKullanici(kişi);
                break;
            case 3:
                yeniKayıt.listele(kişi);
                break;
            case 4:
                cıkılsınMı=false;
                break;
            default:
                System.out.println("agam adam gibi bi şeyler gir");
                break;
        }
    }

}
}
