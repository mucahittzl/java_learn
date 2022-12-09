package PROJELER.KutuphaneDenemesi.GirisProjesi;

import java.time.LocalDateTime;

public class Kullanıcı {
    //kullanıcı obj uretecek kalıphane class

    String name;//obj değer alacak inst. var.
    LocalDateTime kayıtZamanı;//obj de değer alacak inst. var.

//Task 1. step
    @Override
    public String toString() {//bu class'dan olustuurlan obj print etmek için obj datalarını string cevirir
        return "Kullanıcı{" +
                "name='" + name + '\'' +
                ", kayıtZamanı=" + kayıtZamanı +
                '}';
    }

    public Kullanıcı(String name, LocalDateTime kayıtZamanı) {//full p'li teleskopik cons.
        this.name = name;
        this.kayıtZamanı = kayıtZamanı;


    }

}
