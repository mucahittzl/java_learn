package HalukHocaJava.j01_Variables.j34_Iterators;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {

        /*
        task-> Verilen bir integer listin tek elemanlarının karesini tersten print eden code create ediniz(iterator ile)
         */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 9, 7, 12, 20));
        ListIterator<Integer> it1 = list.listIterator();

        while (it1.hasNext()) {
            it1.next();
            }
        while (it1.hasPrevious()){

            int sayi=it1.previous();
            if (sayi%2==0){
                System.out.println();
            }else System.out.print(sayi*sayi+" ");
        }

    }
}
