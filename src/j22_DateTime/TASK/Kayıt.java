package j22_DateTime.TASK;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayıt {
    ArrayList<Kullanıcı> kullanıcıKisiler=new ArrayList<>();//kullanıcı class'dan olusturulacak objelerin tutulacagı boş list
   public ArrayList<Kullanıcı> kayıtAl(){
       Scanner sc=new Scanner(System.in);
       System.out.print("agam adını giresen :");
       String ad=sc.nextLine();//kullanıcı obj için name alındı
       Kullanıcı k1=new Kullanıcı(ad, LocalDateTime.now());//k1 obj name kullanıcıdan kayıtzamanı LocalDateTime.now() alacak parametre olarak
       kullanıcıKisiler.add(k1);//olusturulan k1 objsi liste eklendi

   return kullanıcıKisiler;
    }




}
