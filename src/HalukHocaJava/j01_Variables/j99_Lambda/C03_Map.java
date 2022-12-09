package HalukHocaJava.j01_Variables.j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Map {
    public static void main(String[] args) {
        //map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.



        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));


        ciftKarePrint(sayi);//576 1444 1764 4356 2116 256
        System.out.println("\n   ***   ");
        tekKup1fazla(sayi);//117650 35938 344 28 421876 91126 166376 42876 15626 300764
        System.out.println("\n   ***   ");
        ciftKarekok(sayi);//4 6 6 8 6 4

    }//main sonu

    // Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz

    public static void ciftKarePrint(List<Integer>sayi){
        sayi.stream().//List elemanlar akısa alındı
                filter(C01_LambdaExpression::ciftMi).//akıştaki çift elemanlar filtrelendı
               // map(t->t*t).//akışta filtrelenen çıft elemanlar karesı alınarak update edildi akısa sokuldu
                map(t->(int)Math.pow(t,3)+1).
                forEach(C01_LambdaExpression::yazdir);//akışta filtrelenmiş çift elemanlar karesi alınıp işaretlenen akıstan print edildi

    }
    // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi

    public static void tekKup1fazla(List<Integer>sayi){
        sayi.stream().filter(t->t%2!=0).map(t->t*t*t+1).forEach(C01_LambdaExpression::yazdir);
    }

    // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void ciftKarekok(List<Integer>sayi){
        sayi.
                stream().
                filter(C01_LambdaExpression::ciftMi).
                map(t->(int)Math.sqrt(t)).
                forEach(C01_LambdaExpression::yazdir);


    }
}
