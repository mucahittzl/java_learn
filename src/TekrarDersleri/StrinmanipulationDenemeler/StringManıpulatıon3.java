package TekrarDersleri.StrinmanipulationDenemeler;

import java.util.Scanner;

public class StringManıpulatıon3 {
    public static void main(String[] args) {


        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("kelime gir");
        String kelime = sc.next();
        if (kelime.contains("xyz")) {
            System.out.println(true);
        } else System.out.println("false");


        String s = "xyaz";
        boolean xyzIceriyorMu = false;
        if (s.contains("xyz")) {
            xyzIceriyorMu = true;
            System.out.println(xyzIceriyorMu);
        } else {
            xyzIceriyorMu = false;
            System.out.println(xyzIceriyorMu);


        }
    }
}
