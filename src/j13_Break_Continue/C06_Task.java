package j13_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {

        //girilen bir ifadedeki c karakterine kadar a karakter sayısını print eden code yazınız

        Scanner sc=new Scanner(System.in);
        System.out.println("string karakter giriniz:");
        String karakter= sc.nextLine();
        int aSayısı=0;
        for (int i = 0; i <karakter.length() ; i++) {
            if (karakter.charAt(i)=='a'){
            aSayısı++;
            } else if (karakter.charAt(i)=='c') {
                break;
            }
            System.out.println("döngüde işleme giren karakterler:"+karakter.charAt(i));
        }
        System.out.println("girilen karakterde a sayısı:"+aSayısı);









    }
}
