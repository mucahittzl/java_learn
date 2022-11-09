package TekrarDersleri.BOŞ_DENEMELER;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args)  {


/*
    Kullanici dan yas bilgisini alarak

       oy kullanma yasi :
      age >= 18  ==> oy kullanmaya uygun
      age >= 70  ==> uc kez oy kullanabilir
      70 > age >=50 ==> iki kez oy kullanabilir
      50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

    */


        Scanner sc=new Scanner(System.in);
        System.out.println("yas gir:");
        int yas=sc.nextInt();
        if(yas>=18){
            System.out.println("yasınız oy kullanmaya uygun");
            if(yas>=70){
                System.out.println("3kez oy kullanabilirsiniz");}
            else if(yas>=50){
                System.out.println("2 kez oy kullanabılır");
            }
            else{
                System.out.println("1 kez oy kullanabilirsiniz");}

        }else {
            System.out.println("yasiniz oy kullanmaya uygun değil");}















}
    }

