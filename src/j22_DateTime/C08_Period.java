package j22_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {

        //Period->iki tarih arasında geçen tekrarlanabilen zamanı tutar

        LocalDate bugun=LocalDate.now();
        LocalDate fathBirthDay=LocalDate.of(1993,5,19);

        Period fark=Period.between(fathBirthDay,bugun);
        System.out.println("fark = " + fark);//fark = P-29Y-5M-7D

        System.out.println("fark.toTotalMonths() = " + fark.toTotalMonths());//fark datasının ay cinsinden değeri
        System.out.println("fark.getDays() = " + fark.getDays());//fark datasının gun bilgisi

        System.out.println(" ****** ");
        System.out.println("bugun = " + bugun);

        Period period5Gun=Period.ofDays(5);//5 gunde bir tekrarlana period
        Period period7Ay=Period.ofMonths(7);//7 ay da bir tekrarlanan perion
        Period periodX=Period.ofMonths(7).ofDays(21);//21 gün ileri gider
        //TRİCK-> periodda çoklu tanımlamalarda sondaki geçerli olur

        bugun=bugun.plus(period5Gun);//bugune 5 gunluk period eklendi
        System.out.println("bugun = " + bugun);
        bugun=bugun.minus(period7Ay);//bugun e 7 aylık period geri gidildi
        System.out.println("bugun = " + bugun);
        bugun=bugun.plus(periodX);
        System.out.println("bugun = " + bugun);

        //TASK->5,9,2022 de baslayan kurs 9 ay olduguna göre bitiş tarihini print eden code create ediniz
        LocalDate kurs=LocalDate.of(2022,9,5);
        Period bitis = Period.ofMonths(9);
        System.out.println("kurs.plus(ay9) = " + kurs.plus(bitis));

        System.out.println("Kurs bitiş tarihi = "+kurs.plus(bitis).format(DateTimeFormatter.ISO_DATE));

    }
}
