package HalukHocaJava.j01_Variables.j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertList {
    public static void main(String[] args) {

        //King of Trick->Array'dan çevirilen List array kaynaklı olduğğu için array
        // davranışı gösterir boyut sabittir dolayısıyla remove addd method çalışmaz

        String arrJavaCan[]={"Akif","Gamze","Musty","Sevdenur"};

        List<String>listJavaTar= Arrays.asList(arrJavaCan);//arrJavaCannnnnn değeri list'e eleman olarak atandı
        System.out.println("listJavaTar = " + listJavaTar);//[Akif, Gamze, Musty, Sevdenur]
        //listJavaTar.add("sefilCan Haluk"); array'a eleman eklenmez
                                            //RTE->UnsupportedOperationException verir
        //Trick(önemli)->list data type ArrayList tanımlanırsa RTE vermez kaynağı array de olsa list davranır boyut esneklıoı yapar
        ArrayList<String>listJavatar1=new ArrayList<>(Arrays.asList(arrJavaCan));
        listJavatar1.add("sefil haluk");
        System.out.println("listJavatar1 = " + listJavatar1);

    }
}
