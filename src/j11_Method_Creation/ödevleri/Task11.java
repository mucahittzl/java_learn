package j11_Method_Creation.ödevleri;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */
        Scanner sc=new Scanner(System.in);
        System.out.println("şifrelenecek cümleyi girin:");
        String cümle= sc.nextLine();


        kodlama(cümle);

    }

    private static void kodlama( String harfler) {
        System.out.println(harfler.replace("s","5").replace("a","4").replace("e","3")
                .replace("i","1").replace("o","0").toUpperCase());
    }


}