package HalukHocaJava.j01_Variables.j22_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        //LocalDateTime->tarih(yıl ay gun) ve xaman (saat dakika saniye mlsn) bilgilerini tutar

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("ldt = " + ldt);//ldt = 2022-10-25T23:01:28.826250100

        LocalDate d=LocalDate.of(2016,3,13);//tarih ataması yapıldı
        LocalTime t=LocalTime.of(14,45,35);//zaman ataması yapıldı
        //of() methodu ile ayrı ayrı zamanlar birleştirilebilir
        LocalDateTime trhZmn=LocalDateTime.of(d,t);
        System.out.println("trhZmn = " + trhZmn);
        LocalDateTime ldt1=LocalDateTime.of(2018, Month.MAY,19,20,30);
        System.out.println("ldt1 = " + ldt1);
        System.out.println("trhZmn.getDayOfMonth() = " + trhZmn.getDayOfMonth());
        System.out.println("trhZmn.getDayOfWeek() = " + trhZmn.getDayOfWeek());
        System.out.println("trhZmn.getHour() = " + trhZmn.getHour());
        System.out.println("trhZmn.plusWeeks(3).minusDays(5).plusHours(13).minusMinutes(72) = " + trhZmn.plusWeeks(3).minusDays(5).plusHours(13).minusMinutes(72));
    }

}
