package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task01_Bakkal {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     */

    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> gunler = new ArrayList<>(List.of("Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"));
    static ArrayList<Integer> gunlukKazanclar = new ArrayList<>();
    public static void main(String[] args) {
        int index = 0;
        while (gunlukKazanclar.size() < 7) {
            System.out.print(gunler.get(index) + " günü için kazanç giriniz = ");
            int kazanc = scan.nextInt();
            gunlukKazanclar.add(kazanc);
            index++;
        }
        getOrtalama();
        System.out.println("Ortalamanın altında kalan gunler = " + getOrtalamaninAltindaKazancGünleri(getOrtalama()));
        System.out.println("Ortalamanın üstünde kalan gunler = " + getOrtalamaninUstundeKazancGünleri(getOrtalama()));

    }
    public static int getOrtalama() {
        int toplam = 0;
        for (int i = 0; i <= gunlukKazanclar.size() - 1; i++) {
            toplam += gunlukKazanclar.get(i);
        }
        return toplam / gunlukKazanclar.size();
    }
    public static String getOrtalamaninUstundeKazancGünleri(int a) {
        String flag = "";
        for (int i = 0; i <= gunlukKazanclar.size() - 1; i++) {
            flag += (gunlukKazanclar.get(i) >= a ? gunler.get(i) : "") + ", ";
        }
        return flag;
//List dönmek istersek flag yerine bir ArrayList oluşturup ArrayList e elemanları
// ortalamaUstu.add((gunlukKazanclar.get(i)>a)? gunler.get(i) : ""); ile de ekleyebiliriz.
    }
    public static String getOrtalamaninAltindaKazancGünleri(int a) {
        String flag = "";
        for (int i = 0; i <= gunlukKazanclar.size() - 1; i++) {
            flag += (gunlukKazanclar.get(i) < a ? gunler.get(i) : "") + ", ";
        }
        return flag;
    }

}
