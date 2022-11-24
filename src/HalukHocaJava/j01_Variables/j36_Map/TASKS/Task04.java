package HalukHocaJava.j01_Variables.j36_Map.TASKS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Task04 {

    ///			KELİME ANALİZİ

    /*
     * Girilen bir metinde kelimelerin kaç kere geçtiğini bulan program yazınız.
     *
     * 1. Adım : ( Kelime = Kaç Kere Geçiyor ) Şeklinde veri tutmak için HashMap oluşturun.
     * 2. Adım : Girilen metni split methodu ile parçalayalım.
     * 			 ilk önce "." ya göre parçalayıp cümleleri elde edelim
     * 			 daha sonra " " boşluğa göre parçalayıp kelimeleri elde edelim
     * 3. Adım : Tüm kelimeleri kontrol etmek için for döngüsü kullanalım ve tüm kelimeleri oluşturduğumuz hashMap'e aktaralım.
     * 			 Eğer hashmap'te yoksa ekleyelim ve sayısına 1 yazalım.
     * 		 	 Eğer hashmap'te zaten varsa, sayısını bir artıralım.
     * 3. Adım : Tüm kelimeler kontrol edildikten çıktı verelim. Ve tüm kelimeleri tekrar sayısıyla birlikte gösterelim.
     *
     * İpucu : "." özel karakter olduğu için "\\." şeklinde split ediniz.
     * */



    public static void main(String[] args) {

        String str = "Ali ata bak. Veli ata bak. Veli ata Ali ile bak.";
        HashMap<String, Integer> Map = new HashMap<>();
        ArrayList<String> CumleList = new ArrayList<>( Arrays.asList(str.split("\\.")));
        System.out.println(CumleList);
        for(int i = 0; i<CumleList.size();i++) {
            ArrayList<String> KelimeList = new ArrayList<>(Arrays.asList((CumleList.get(i).trim()).split(" ")));
            for(int j = 0; j<KelimeList.size();j++) {
                if(Map.containsKey(KelimeList.get(j))) Map.replace(KelimeList.get(j), Map.get(KelimeList.get(j))+1);
                else Map.put(KelimeList.get(j), 1);
            }
        }
        System.out.println(Map);
        }

    }



