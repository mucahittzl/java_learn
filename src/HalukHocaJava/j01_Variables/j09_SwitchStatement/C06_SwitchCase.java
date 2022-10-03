package HalukHocaJava.j01_Variables.j09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

//TASK-->girilen haftanın gününü hafta içi veya sonu olduğunu print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("günü giriniz");
        String gun =sc.next().toLowerCase();//buyuk harf kucuk harf hepsini kucuk yaptık
        switch (gun){
            case "pazartesi":
            case "salı":
            case "çarsamba":
            case "perşembe":
            case "cuma":
                System.out.println("hafta içi");
            break; //yukarıdakı tum acse işlemlerini bu break karşılıyor
            case "cumartesi":
            case "pazar":
                System.out.println("hafta sonu");
                break;   //yukarıdakı tum acse işlemlerini bu break karşılıyor
            default:   //switch hiçbir case ile eşleşmezse çalısır else gibi
                System.out.println("doğru değer giriniz");


        }





















    }
}
