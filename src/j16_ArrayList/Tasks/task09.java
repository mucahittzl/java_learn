package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class task09 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */


        ArrayList<Integer>sayılar=new ArrayList<>(List.of(1,2,3,4,5));
        int toplam=0;
        for (int i = 0; i <sayılar.size() ; i++) {
            toplam+= sayılar.get(i)* sayılar.get(i);
        }
        System.out.println("toplam = " + toplam);


    }
}

