package j10_StringManipulation.TekrarDersleri.StrinmanipulationDenemeler;

import java.util.Scanner;

public class StringManıpulatıon2 {
    public static void main(String[] args) {

        /* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

       ORNEK:          INPUT     OUTPUT
                       goat        gat
                      photo        hoto
                      ghost        ghost
                      kalem        lem

*/

        Scanner sc=new Scanner(System.in);
        System.out.println("kelime gir");
        String kelime= sc.next().toLowerCase();
        if (kelime.startsWith("gh")){
            System.out.println(kelime);
        } else if (kelime.startsWith("g")) {
            System.out.println(kelime.charAt(0)+kelime.substring(2));
        } else if (kelime.charAt(1)=='h') {
            System.out.println(kelime.substring(1));
        }else System.out.println(kelime.substring(2));



    }
}
