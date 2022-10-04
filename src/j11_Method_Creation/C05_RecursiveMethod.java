package j11_Method_Creation;

import java.util.Scanner;

public class C05_RecursiveMethod {
/*
Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek konumu oluşur.
Bu yüzden özyineleme ile yapılan hesaplamalar daha yavaş ve verimsizdir.
Peki özyinelemeyi neden kullanıyoruz?
Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
 */

    public static void main(String[] args) {

//faktoriyel girilen sayıdan 1 e kadar olan tamsayıların çarpımına denir. ör:1! =1,  0! = 1
   //   Task->girilen sayının faktorıyelini hesaplayan method create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("sayıyı gir:");
        int sayı=sc.nextInt();

        System.out.println(faktoriyel(sayı));


    }//main dışı

    private static int faktoriyel(int a) {

        if(a>=1){
    return a*faktoriyel(a-1);
        }else return 1;


    }


}
