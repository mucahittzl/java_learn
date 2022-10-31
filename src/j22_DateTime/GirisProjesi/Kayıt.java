package j22_DateTime.GirisProjesi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayıt {
    ArrayList<Kullanıcı> kullanıcıKisiler=new ArrayList<>();//kullanıcı class'dan olusturulacak objelerin tutulacagı boş list
    //Task 2. step
   public ArrayList<Kullanıcı> kayıtAl(){//kullanıcı Class'dan obj uretmek ıcın cons.'a gereken name ve kayıtZamanı bilgilerini olusturup olusan obj'i liste ekler
       Scanner sc=new Scanner(System.in);
       System.out.print("agam adını giresen :");
       String ad=sc.nextLine();//kullanıcı obj için name alındı
       Kullanıcı k1=new Kullanıcı(ad, LocalDateTime.now());//k1 obj name kullanıcıdan kayıtzamanı LocalDateTime.now() alacak parametre olarak
       kullanıcıKisiler.add(k1);//olusturulan k1 objsi liste eklendi

   return kullanıcıKisiler;//kullanıcıKısıler list'i method cıktısı return olarak tanımlandı
    }
    //Task 3. step
    public void sansliKullanici(ArrayList<Kullanıcı>kllObj){//kullanıcı listindeki obj'lerin kayıtZamanını 10 sn az olmasını
                                                         //veya olmamasını ve sanslı kullanıcıyı prınt edecek
        for (Kullanıcı k:kllObj){//Kullanıcı class'dan uretılen kayıtAl() method ile üretilip KullanıcıKişi listine eklenen objeler dönguye alındı
            if (k.kayıtZamanı.getSecond()<=10){//döngüye giren her bir kullanıcı objesinin kayıtZamanı datasındakı sanıye verisi 10'dan kucuk olma şartı
                System.out.println(k.name+"agam şanslı kişisin 5kilo Bal kazandınız :) sisteme giriş zamanı :"+k.kayıtZamanı);
            }else System.out.println("agam şanslı lişi değilsin :("+k.kayıtZamanı);
        }
    }
    public void listele(ArrayList<Kullanıcı>kllObj){
        System.out.println(kllObj);//kullanıcı Class'daki toString print eder
    }



}
