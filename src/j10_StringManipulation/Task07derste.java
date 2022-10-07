package j10_StringManipulation;

import java.util.Scanner;

public class Task07derste {
    public static void main(String[] args) {

/*
girilen string içindeki istenen indexteki karakteri print eden code create ediniz
 */

        Scanner sc = new Scanner(System.in);
        System.out.println("string ifade gir:");
        String s1 = sc.next();
        System.out.println("istediğin karakter için index gir");
        int index = sc.nextInt();
        if (s1.length() > index) {

            System.out.println(s1.substring(index, index + 1));
        } else System.out.println("girdiğin metinde olmayan index");


    }
}
