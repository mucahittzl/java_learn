package HalukHocaJava.j01_Variables.j12_Loops.L01_ForLoop.TASK;

import java.util.Scanner;

public class Task02Polindrome {
    public static void main(String[] args) {

//girilen ifadenin polindrome olmasını kontrol eden method creaaaaaaaaaatettttt ediniz
//polindrome=her iki yönden okundugunda şit olan ifadeler ör:ey edip adanada pide ye

        Scanner sc=new Scanner(System.in);
        System.out.println("kontrol edilecek ifadeyi giriniz");
        String str= sc.nextLine();

        polindrome(str);





    }

    private static void polindrome(String str) {

        String tersstr="";//boş bir string kutu açtım
        for (int i=str.length()-1;i>=0;i--){
            tersstr+=str.charAt(i);// str nin i.ci karakterini tersstr ye ekler.

        }
        System.out.println("girilen ifadenin tersi:"+tersstr);
        if (str.equalsIgnoreCase(tersstr)){//str ile tersstr esitlik kontrolu
            System.out.println("girilen ifade POLİNDROME");
        }else System.out.println("girilen ifade POLİNDROME DEĞİL!!");

    }
}
