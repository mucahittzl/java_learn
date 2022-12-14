package PROJELER.KutuphaneDenemesi.DepoYönetimiProjesi.DepoYönetimi6;

public class UrunTanimlama {
    private int id;
    private String urunIsmi;
    private String uretici;
    private int miktar;
    private String birim;
    private String raf;
    public UrunTanimlama() {
    }
    public UrunTanimlama(int id, String urunIsmi, String uretici, Integer miktar,String birim,String raf) {
        this.id = id;
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.birim = birim;
        this.miktar= miktar;
        this.raf = raf;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUrunIsmi() {
        return urunIsmi;
    }
    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }
    public String getUretici() {
        return uretici;
    }
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }
    public int getMiktar() {
        return miktar;
    }
    public void setMiktar(int miktar) {
        if (miktar < 0) {
            System.out.println("girilen Miktar mevcut miktardan fazla olmamalıdır. ");
            this.miktar =0;
        } else
            this.miktar = miktar;
    }
    public String getBirim() {
        return birim;
    }
    public void setBirim(String birim) {
        this.birim = birim;
    }
    public String getRaf() {
        return raf;
    }
    public void setRaf(String raf) {
        this.raf = raf;
    }
    @Override
    public String toString() {
        return "Urunleriniz "+
                "id=" + id +
                ", urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +"\n"
                ;
    }

}
