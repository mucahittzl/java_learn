package HalukHocaJava.j01_Variables.j09_SwitchStatement;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi = sc.nextInt();

    switch (sayi/10%10){
        case 1: System.out.println("sayının onlar basamağı 1");break;
        case 2: System.out.println("sayının onlar basamağı 2");break;
        case 3: System.out.println("sayının onlar basamağı 3");break;
        case 4: System.out.println("sayının onlar basamağı 4");break;
        case 5: System.out.println("sayının onlar basamağı 5");break;
        case 6: System.out.println("sayının onlar basamağı 6");break;
        case 7: System.out.println("sayının onlar basamağı 7");break;
        case 8: System.out.println("sayının onlar basamağı 8");break;
        case 9: System.out.println("sayının onlar basamağı 9");break;
        case 0: System.out.println("sayının onlar basamağı 0");break;
            default:
            System.out.println("dogru code giriniz");













    }



    }
}
