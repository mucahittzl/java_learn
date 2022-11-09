package HalukHocaJava.j01_Variables.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {
    public static void main(String[] args) {

        //get();->listte istenen elemanı return eder (arr[3]->arr'in 3. indexdeki elemanı ver)

        ArrayList<String> listSehir=new ArrayList<>(List.of("Munih","losAngeles","Londra","stockholm"));
        System.out.println(listSehir.get(1));//losangeles
      //  System.out.println(listSehir.get(11));//rte error verir olmayan index


    }
}
