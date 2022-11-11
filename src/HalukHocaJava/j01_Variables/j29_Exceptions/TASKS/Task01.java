package HalukHocaJava.j01_Variables.j29_Exceptions.TASKS;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

      /*  'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
        int v = vize
        int f = final

        Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
        Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
        Diğer durumlarda ise,
                vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)
        vizeye 120, finale 80 girin.

                Programın çalışmasını sağlayın. (handle edin) */



        Scanner sc=new Scanner(System.in);
        int vize = 0;
        int fınal = 0;
        while (true){

            try {
                System.out.print("Vize giriniz: ");
                vize = sc.nextInt();
                if (vize<0||vize>100){
                    throw new ArithmeticException();
            }else break;

            }catch( ArithmeticException  e){
                System.out.println("0 ile 100 arasında not giriniz");
            }
        }

        while (true){

            try {
                System.out.print("final notu giriniz: ");
                fınal = sc.nextInt();
                if (fınal<0||fınal>100){
                    throw new ArithmeticException();
                }else break;

            }catch( ArithmeticException  e){
                System.out.println("0 ile 100 arasında not giriniz");
            }
        }

        ortalama(vize,fınal);

    }



    private static void ortalama(int vize,int fınal) {

        double ortalama = (vize*0.40 + fınal*0.60);
        System.out.println("Ortalamanız : " + ortalama);
        if (ortalama >= 70) System.out.println("Geçtiniz");
        else System.out.println("Kaldınız");
    }


}
