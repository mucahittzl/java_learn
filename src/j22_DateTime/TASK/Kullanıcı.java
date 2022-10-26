package j22_DateTime.TASK;

import java.time.LocalDateTime;

public class Kullanıcı {
    //kullanıcı obj uretecek kalıphane class

    String name;//obj değer alacak inst. var.
    LocalDateTime kayıtZamanı;//obj de değer alacak inst. var.


    public Kullanıcı(String name, LocalDateTime kayıtZamanı) {//full p'li teleskopik cons.
        this.name = name;
        this.kayıtZamanı = kayıtZamanı;
    }

}
