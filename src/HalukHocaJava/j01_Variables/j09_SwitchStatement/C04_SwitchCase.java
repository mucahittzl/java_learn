package HalukHocaJava.j01_Variables.j09_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {

        //girilen ayın hangı mevsimde oldugunu print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("ay giriniz");
        int ay= sc.nextInt();

        switch (ay){
            case 12:
            case 1:
            case 2:
                System.out.println("kıs ayı");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar ayı");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz ayı");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar ayı");
           break;
            default:
                System.out.println("dogru tarih gir");
        }


























    }
}
