package TekrarDersleri.BOŞ_DENEMELER;

public class DENEMESWİTCHCASE {
    public static void main(String[] args) {


        /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/


        String day = "wednesday";

        switch (day) {
            case "monday":
            case "tuesday":
                System.out.println("java class");
                break;
            case "friday":
            case "thursday":
                System.out.println("selenyum dersi");
                break;
            case "wednesday":
            case "saturday":
                System.out.println("sql dersleri");
                break;
            default:
                System.out.println("izin günü");
        }


    }
}
