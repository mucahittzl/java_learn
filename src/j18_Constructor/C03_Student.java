package j18_Constructor;

public class C03_Student {//main olmayan sadece student objesi create etmek için pojo->plan old java object:obje için standart class kalıphane

    //fields->
    String ad;
    String soyad;
    int sınıf;
    double ortalama;
    int okulNo;
    boolean takdir;
    public void mezuniyet(){//method
        if (ortalama>=50){
            System.out.println("agam diploman hayırlı olsun");
        }else System.out.println("agam seneye de bekleriz dewamkee");

    }

    @Override
    public String toString() { //obj referans değeri print etmemesi için obj datalarını stringe çeviren method
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf=" + sınıf +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdir=" + takdir +
                '}';
    }
}
