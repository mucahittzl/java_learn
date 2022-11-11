package HalukHocaJava.j01_Variables.j29_Exceptions.TASKS.OkulTaskı;

import java.util.ArrayList;
import java.util.Scanner;

public class Claruway {
   Scanner sc = new Scanner(System.in);

    String okulAd;

    int maxOgrenciSayisi;
    ArrayList<IT> ogrenciliste = new ArrayList<>();


   public void ogrencikayıt() {
      try {


         System.out.println("öğrenci adını giriniz :");
         String ad = sc.next();
         System.out.println("öğrenci soyad giriniz :");
         String soyad = sc.next();
         System.out.println("öğrenci yaşını giriniz :");
         int yas = sc.nextInt();
         if (yas < 15) {
         throw new IllegalArgumentException();
      }else{ IT ögrenci=new IT(ad,soyad,yas);
      ogrenciliste.add(ögrenci);
         }
      }
      catch (IllegalArgumentException e) {
         System.out.println("15 yaşından küçüklerin kaydı yapılamaz");
         ogrencikayıt();
      }

   }
   public void ogrenciBilgileri(){
      for (IT value:ogrenciliste){
         System.out.println("Ad :"+value.ad+" Soyad :"+value.soyad+" Yaş :"+value.yas);
      }
   }
}