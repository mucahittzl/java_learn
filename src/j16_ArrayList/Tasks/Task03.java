package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        //bir listte istenen sayının varlığını kontrol eden code create ediniz

        ArrayList<Integer> listSayi=new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));

        Scanner sc=new Scanner(System.in);
        System.out.println("hangi sayıyı arıyorsunuz:");
        int ara=sc.nextInt();
        boolean varMI=false;
        for (int i = 0; i <listSayi.size() ; i++) {
            if (listSayi.get(i)==ara){
                varMI=true;
                System.out.println("sayı mevcut");
                break;
            }
        }
            if (!varMI){
            System.out.println("aranan sayı yok");
}

    }
}
