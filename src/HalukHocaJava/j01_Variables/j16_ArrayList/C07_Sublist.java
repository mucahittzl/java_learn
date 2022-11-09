package HalukHocaJava.j01_Variables.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_Sublist {
    public static void main(String[] args) {


        ArrayList<String> listSehir=new ArrayList<>(List.of("Munih","losAngeles","Londra","stockholm","Angara","patAGONYA"));
        //SUBLİST()->LİSTİN İSTENEN LİST PARÇASINI RETURN EDER..
        System.out.println("listSehir.subList(3,5) = " + listSehir.subList(3, 5));//3. ve 4. index elemanları verir listSehir.subList(3,5) = [stockholm, Angara]

        ArrayList<String>city=new ArrayList<>(listSehir.subList(2,5));//listSehirden 2.3.4. index elemanları city liste atandı
        System.out.println("city = " + city);//city = [Londra, stockholm, Angara]



    }
}
