package HalukHocaJava.j01_Variables.j03_ScannerClass_TypeCasting;


import java.util.Scanner;

public class C01_ScannerClass {

    public static void main(String[] args) {
        //kullanıcıdan veri almak için şu 3 adım takip edilir
        //1.adım->Scanner classtan obje create edilir

        Scanner scan =new Scanner(System.in);//Scannerclasstan scan isminde değerini System içinden alan bir objedir


        //2.adım->kullanıcıdan istenen veri için bildirimde bulunulur->sout("....")
        //  System.out.println("adınızı giriniz:");

        //3.adım->kullanıcının girdiği veri data type'ne göre bir variable atanır.

        //  String isim = scan.nextLine();//kullanıcıdan gelen String tipinde isim verisi scan obj'ni nextLine()methodu ile atandı

        // System.out.println("isim=" + isim);

        //Task->kullanıcının girdiği değere göre kare alanı ve çevresini hesaplayan bir code create ediniz..

        Scanner sc = new Scanner(System.in);
        //  System.out.print("karenin kenarını giriniz:");
        //  int kenar= scanner.nextInt();
        //  System.out.println("alan :"+(kenar+kenar)+"çevre:"+(kenar*4));
        /*kulanıcın günde içtiği çay ve kullandığı şeker değerine göre
        bir yılda kaç kg şeker kullandığını hesaplayan bir code create ediniz.
        1 şeker =1.7gr
        örnek: ınput:cay sayısı:10 seker sayısı:2
        output:yılda12.41 kg şeker kullanıyorsunuz
         */
        //   System.out.println("günlük içtiğiniz çay sayısını giriniz:");//çay için 2.adım
        //  int caySayısı =sc.nextInt();//çay için 3.adım


        //    System.out.println("şeker sayınızı giriniz:");//seker için 2.adım
        //   int seker =sc.nextInt();//seker için 3.adım

        //   System.out.println("yıllık şeker tüketimimiz:" + (caySayısı * seker * 1.7 * 365 / 1000));

        // System.out.println("isminizi giribiz:");
        // char ch=sc.nextLine().charAt(0);//kullanıcıdan gelen string ifadenin 0. index ilk karakterini alır
        // System.out.println("isminizin ilk karakteri:"+ch);

        //  String isim= sc.nextLine();//kullanıcının girdiği tüm satırı isim'e atar
        //  String ad=sc.next();//kullanıcının girdiği ilk ifadeyi ad'a atar







    }
}