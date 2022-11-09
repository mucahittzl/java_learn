package HalukHocaJava.j01_Variables.j25_Encapsulation.Encapsulation02;

public class Kisi {
    /*
    Kisi pojo class için fies->ad,soyad,password(String),yas
    tüm field'leri kullanıcı görebilmeli ve password hariç update edebilmeli
    password encapsulated update edilmemeli. yas variable negatif değer girmeye karşı encapsulated


    nner class'da obj ile field ları prınt eden code create ediniz
     */

    //fields...
     String ad;
     String soyad;
    private String password;
    private int yas;

    public Kisi(String ad, String soyad, String password, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.password = password;
        this.yas = yas;
    }



    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {

        this.yas =Math.abs(yas);// parametreden gelen yas - den kurtularak mutlak değerini aldı
    }

    public String getPassword() {
        return password;
    }
}
