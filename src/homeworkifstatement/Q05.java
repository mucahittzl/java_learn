package homeworkifstatement;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */


        Scanner sc = new Scanner(System.in);
        System.out.println("yaşınızı giriniz:");
        double yas = sc.nextDouble();
        if (yas > 18) {
            System.out.println("kilonuzu giriniz");
            double kg = sc.nextDouble();
            if (kg > 50) {
                System.out.println("kan bagısı yapabilirsiniz");}
                else  {
                    System.out.println("kg nız dusuk bağıs yapamazsınız");
                }





        }

        else System.out.println("kan bagısı yapamazsınız.");

























    }

    }


