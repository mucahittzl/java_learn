package HalukHocaJava.j01_Variables.j09_SwitchStatement;

import java.util.Scanner;

public class C02_SwithCase {
    public static void main(String[] args) {

        //kullanıcının girdiği yılın ay sırasına gore ayın ısmını prınt eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("yıl giriniz");
        int yıl= sc.nextInt();
        switch (yıl){
            case 1:
                System.out.println("ocak");
                break;

            case 2:
                System.out.println("subat");
                break;

            case 3:
                System.out.println("mart");
                break;

            case 4:
                System.out.println("nisan");
                break;

            case 5:
                System.out.println("mayıs");
                break;

            case 6:
                System.out.println("hazıran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekım");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;

            default:
                System.out.println("dogru tarıh gır");






        }
























    }
}
