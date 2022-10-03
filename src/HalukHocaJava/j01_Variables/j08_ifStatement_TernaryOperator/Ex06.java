package HalukHocaJava.j01_Variables.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

       /* TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
        kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
        kontrol edip kalan yıl ve prim gununu print eden code create ediniz  */


        Scanner sc=new Scanner(System.in);
        System.out.println("cinsiyet\n kadın için K giriniz\nerkek için E\n giriniz");
        char cnsyt=sc.next().charAt(0);
        System.out.println("yas gırınız:");
        int yas=sc.nextInt();

        if(cnsyt=='K') {  //cinsiyetin kadın olması kontrol edıldı
            if(yas>60){   //yasın 60 tan buyuklugu kontrol edıldı
                System.out.println("pirim gününüzü giriniz");
                int pirimGunu=sc.nextInt();
                if(pirimGunu>6000) {   //pirim gunu 6000 den nuyuklugu kontrol edıldı
                    System.out.println("tebrikler emeklı oldunuz");
                }else System.out.println("emeklılıgınız ıcın:"+(6000-pirimGunu)+"yatırmanız lazım");

            }else System.out.println("emekliliğinize daha:"+(60-yas)+"yıl daha var");




        } else if (cnsyt=='E') {  if(yas>65){   //yasın 65 tan buyuklugu kontrol edıldı
            System.out.println("pirim gününüzü giriniz");
            int pirimGunu=sc.nextInt();
            if(pirimGunu>7000) {   //pirim gunu 7000 den nuyuklugu kontrol edıldı
                System.out.println("tebrikler emeklı oldunuz");
            }else System.out.println("emeklılıgınız ıcın:"+(7000-pirimGunu)+"yatırmanız lazım");

        }else System.out.println("emekliliğinize daha:"+(65-yas)+"yıl daha var");}


        else System.out.println("agam ne oldugunuı yaz ona gore emeklı edeyım senı :(");






        }

































    }






