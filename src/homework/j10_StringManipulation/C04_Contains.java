package homework.j10_StringManipulation;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {

/*
string içerisinde istenen stringin varlığını kontrol eder boolean return eder.

 */
String s1="Enise Hanım başarılı bir Qa tester team lead";
        System.out.println(s1.contains("hanım"));//false buyuk harle baslamadıgı ıcın false verdı
        System.out.println(s1.contains("E"));//true verir
        System.out.println(s1.contains(" "));//true verir

        String s2="Qa";
        System.out.println(s1.contains(s2));//true
        System.out.println(s2.contains(s1));//false
        //TASK-->girilen bir cümlede aranan kelimenin varlığını kontrol eden code create ediniz.-->ternary kullanınız.

        Scanner sc=new Scanner(System.in);
        System.out.println("cumle giriniz");
        String cumle= sc.next();
            System.out.println("sorgulamak istediğin kelimeyi seç");
        String kelime=sc.nextLine();
        System.out.println(kelime.contains(kelime)?"kelimeyi içeriyor":"bıyle bir kelime yok");










    }
}
