package TekrarDersleri;

public class C01_Kutuphane {

    String kitapAdı;
    String yazarAdı;
    int basımTarihi;
    int sayfaSayısı;
    String KitapDili;
    double KitapÜcreti;
    boolean kitapÖdül;

    public C01_Kutuphane(String kitapAdı, String yazarAdı, int basımTarihi, int sayfaSayısı, String kitapDili, double kitapÜcreti, boolean kitapÖdül) {
        this.kitapAdı = kitapAdı;
        this.yazarAdı = yazarAdı;
        this.basımTarihi = basımTarihi;
        this.sayfaSayısı = sayfaSayısı;
        KitapDili = kitapDili;
        KitapÜcreti = kitapÜcreti;
        this.kitapÖdül = kitapÖdül;
    }

    @Override
    public String toString() {
        return "C01_Kutuphane{" +
                "kitapAdı='" + kitapAdı + '\'' +
                ", yazarAdı='" + yazarAdı + '\'' +
                ", basımTarihi=" + basımTarihi +
                ", sayfaSayısı=" + sayfaSayısı +
                ", KitapDili='" + KitapDili + '\'' +
                ", KitapÜcreti=" + KitapÜcreti +
                ", kitapÖdül=" + kitapÖdül +
                '}';
    }

    public static void kitapOnsöz(){
        System.out.println("Oku Adam Ol");
    }












}
