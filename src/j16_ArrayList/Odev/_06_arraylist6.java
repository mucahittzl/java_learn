package j16_ArrayList.Odev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {

        ArrayList<Integer>sayı=new ArrayList<>(List.of(5,4,6,2,1));


        hillNum(sayı);


    }

    private static void   hillNum(ArrayList<Integer>sayı) {
        ArrayList<Integer>sayı2=new ArrayList<>();
        for (int i = 0; i <sayı.size() ; i++) {
            if (sayı.get(i)<sayı.get(i)-1&&sayı.get(i)> sayı.get(i)+1)sayı2.add(sayı.get(i));
        }
        System.out.println(sayı2);
    }
}
