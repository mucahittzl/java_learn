package j11_Method_Creation.ödevleri;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */
        Scanner sc=new Scanner(System.in);
        System.out.println("saatlik çalışma ücreti girin:");
        int sçü= sc.nextInt();
        System.out.println("çalıştığınız saat girin:");
        int saralıgı= sc.nextInt();
        System.out.println("çalıştığınız mesai saat girin:");
        int mesaisaati= sc.nextInt();
        System.out.println("fazla mesai de saat ücreti girin:");
        int mesaiucret= sc.nextInt();

        ücrethesap(saralıgı,sçü,mesaiucret,mesaisaati);



    }

    private static void ücrethesap(int saralıgı, int sçü, int mesaiucret, int mesaisaati) {



        System.out.println("maaş ="+((sçü * saralıgı)+(mesaiucret*mesaisaati)));

}

}
