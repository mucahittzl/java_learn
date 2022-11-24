package HalukHocaJava.j01_Variables.j36_Map.TASKS.TaskProject;

import java.util.HashMap;
import java.util.Scanner;

public class User {

    Scanner sc=new Scanner(System.in);
    HashMap<String, User> userMap = new HashMap<>();

    String kimlikNo;
    String adSoyad;
    String adres;
    String telefon;

    public User(String kimlikNo, String adSoyad, String adres, String telefon) {
        this.kimlikNo = kimlikNo;
        this.adSoyad = adSoyad;
        this.adres = adres;
        this.telefon = telefon;
    }

    public User(){}

    public void saveInfo() {
        String kimlik;
        while(true) {
            System.out.print("Kimlik numarası giriniz : ");
            kimlik = sc.next();
            if(userMap.containsKey(kimlik) || kimlik.length()!=4)
                System.out.println("Kimlik numarası zaten mevcut veya 4 haneden farklıdır, tekrar deneyiniz ");
            else break;
        }
        System.out.print("adSoyad giriniz : ");
        String adSoyad = sc.next();
        System.out.print("adres giriniz : ");
        String adres = sc.next();
        System.out.print("Telefon giriniz : ");
        String telefon = sc.next();
        userMap.put(kimlik, new User(kimlik, adSoyad, adres, telefon));
    }

    public void getInfo() {
        System.out.print("Aramak istediğiniz kimlik numarasını giriniz : ");
        String getKimlik = sc.next();
        System.out.println(userMap.containsKey(getKimlik) ? userMap.get(getKimlik) : "Aradığınız kimlik no da kişi yok");
    }

    public void removeInfo() {
        System.out.print("Silmek istediğiniz kimlik numarasını giriniz : ");
        String getKimlik = sc.next();
        System.out.println(userMap.isEmpty() ? "Kullanıcı sayısı 0 old. kimseyi silemezsiniz" : (userMap.containsKey(getKimlik)) ? userMap.remove(getKimlik) : "Girdiğiniz Tc de kimse yok");
    }

    public void selectOption() {
        System.out.print("Yapmak istediğiniz işlemi giriniz\n[1] - Kullanıcı ekleme\n[2] - K. Arama\n[3] - K. Silme\n[4] - Çıkış\n[5] - Kullanıcıları yazdır\nSeçiminiz : ");
        int secim = sc.nextInt();
        switch(secim) {
            case 1 : saveInfo(); selectOption(); break;
            case 2 : getInfo(); selectOption(); break;
            case 3 : removeInfo(); selectOption(); break;
            case 4 : System.out.println("İyi günler"); break;
            case 5 : mapYazdir();selectOption();break;
            default : System.out.println("Yanlış seçim yaptınız tekrar deneyiniz "); selectOption();
        }
    }

    public String toString() {
        return "[adSoyad=" + adSoyad + ", adres=" + adres + ", telefon=" + telefon + "]";
    }

    public void mapYazdir() {
        for(User value : userMap.values()) {
            System.out.println(value);
        }
    }

}
