package PROJELER.KutuphaneDenemesi.DepoYönetimiProjesi.DepoYönetimi5;

import java.util.ArrayList;
import java.util.List;

import static PROJELER.KutuphaneDenemesi.DepoYönetimiProjesi.DepoYönetimi5.Variables.*;


public class urunTanimla {
    public static void urunTanimla() {
        while (true) {
            System.out.println("Bitirmek için X'e basiniz. ");
            System.out.println("Urun bilgileri giriniz : ");
            int urunID = rnd.nextInt(1000);
            String urunIsmi = "";
            try {
                System.out.print("Urun ismi :");
                urunIsmi = scan.next();
                if (urunIsmi.equalsIgnoreCase("X")) {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            scan.nextLine();//dummy
            System.out.print("Uretici Firma : ");
            String ureticiFirma = scan.nextLine();
            Urun yeniUrun = new Urun(urunID, urunIsmi, ureticiFirma);
            List<Urun> urunTanimlaList = new ArrayList<>();
            urunTanimlaList.add(yeniUrun);
            urunlerMap.put(yeniUrun.getId(), urunTanimlaList);
        }
        urunListele.urunListele();
    }
}
