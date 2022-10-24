package j19_StaticVariable.ödevTask1;

import java.util.Scanner;

public class C01_RectangleRunner {
    public static void main(String[] args) {


        /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */



            C01_Rectangle ucgen1 = new C01_Rectangle(10, 10);
            System.out.println("cevre= "+ucgen1.cevre());
            System.out.println("alan= "+ucgen1.alan());

            C01_Rectangle ucgen2 = new C01_Rectangle(20, 10);
            System.out.println("cevre= "+ucgen2.cevre());
            System.out.println("alan= "+ucgen2.alan());



















    }
}
