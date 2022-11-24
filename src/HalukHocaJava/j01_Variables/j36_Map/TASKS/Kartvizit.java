package HalukHocaJava.j01_Variables.j36_Map.TASKS;

public class Kartvizit {

         String isim;
         String email;
         String adres;
         String tel;
        int id=100;
    public Kartvizit(String isim, String email, String adres, String tel) {
        this.isim = isim;
        this.email = email;
        this.adres = adres;
        this.tel = tel;
        this.id++;
    }

    @Override
    public String toString() {
        return "Kartvizit{" +
                "isim='" + isim + '\'' +
                ", email='" + email + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' ;


    }
}
