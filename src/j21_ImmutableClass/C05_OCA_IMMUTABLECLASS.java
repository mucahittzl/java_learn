package j21_ImmutableClass;

public class C05_OCA_IMMUTABLECLASS {
    public static void main(String[] args) {

        String a = "";
        a += 2;
        a += 'c';
        a += false;

        if (a == "2cfalse") {//şart sağlamaz if çalışmaz->a referansı "2cfalse" atama olmadıgı ıcın ref yok
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("equals");
        }





    }
}
