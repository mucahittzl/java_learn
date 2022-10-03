package HalukHocaJava.j01_Variables.j09_SwitchStatement;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı sayıyı kelime olarak print eden code create ediniz..


        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz :");
        int sayi = scan.nextInt();
        int yuzler=sayi/100,onlar=(sayi/10)%10,birler=sayi%10;


        switch (yuzler){
            case 1: System.out.println("yüz");break;
            case 2: System.out.println("ikiyüz");break;
            case 3: System.out.println("ucyuz");break;
            case 4: System.out.println("dortyuz");break;
            case 5: System.out.println("besyuz");break;
            case 6: System.out.println("altıyuz");break;
            case 7: System.out.println("yediyuz");break;
            case 8: System.out.println("sekızyuz");break;
            case 9: System.out.println("dokuzyuz");break;}
        switch (onlar){
            case 1: System.out.println("on");break;
            case 2: System.out.println("yirmi");break;
            case 3: System.out.println("tuz");break;
            case 4: System.out.println("kırk");break;
            case 5: System.out.println("elli");break;
            case 6: System.out.println("altmıs");break;
            case 7: System.out.println("yetmıs");break;
            case 8: System.out.println("seksen");break;
            case 9: System.out.println("doksan");break;

        }
        switch (birler){

            case 1: System.out.println("bir");break;
            case 2: System.out.println("iki");break;
            case 3: System.out.println("üç");break;
            case 4: System.out.println("dort");break;
            case 5: System.out.println("bes");break;
            case 6: System.out.println("altı");break;
            case 7: System.out.println("yedi");break;
            case 8: System.out.println("sekız");break;
            case 9: System.out.println("dokuz");break;
            default:
                System.out.println("doğru değer giriniz");
        }













    }
}
