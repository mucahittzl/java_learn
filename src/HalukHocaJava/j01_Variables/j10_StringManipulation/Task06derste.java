package HalukHocaJava.j01_Variables.j10_StringManipulation;

import java.util.Scanner;

public class Task06derste {
    public static void main(String[] args) {

        /*
        girilen stringin son karakterini silen code create ediniz
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("karakter gir:");
        String s1= sc.nextLine();

        System.out.println(s1.substring(0, s1.length() - 1));// son karakteri almaz


    }
}
