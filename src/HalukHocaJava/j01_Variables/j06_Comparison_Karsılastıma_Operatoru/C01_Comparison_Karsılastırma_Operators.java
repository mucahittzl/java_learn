package HalukHocaJava.j01_Variables.j06_Comparison_Karsılastıma_Operatoru;

public class C01_Comparison_Karsılastırma_Operators {
    public static void main(String[] args) {
        /*

==     Esit               x == y
!=     Esit degil         x != y
>      buyuk              x > y
<      kucuk              x < y
>=     buyuk esit         x >= y
<=     kücük esit         x <= y

 */

        int slmYs=33;
        int krmYs=41;


        System.out.println("krm b esit mi slm b ->"+(krmYs==slmYs));// false
        System.out.println("krm b esit değil mi slm b ->"+(krmYs!=slmYs));// true
        System.out.println("krm b kucuk mu  slm b -> "+(krmYs<slmYs));//false
        System.out.println("krm b buyuk mu   slm b -> "+(krmYs>slmYs));//true


        String name="kerem bey";
        String name1="kerem bey";
        System.out.println(name1==name);

       /* s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir. s3 ve s4 ise farklı nesneleri ifade eder.
                s1 == s2 , s1 ve s2 'nin hafızadaki adres değerlerini karşılaştırır ve  String constant pool üzerinde aynı adresi gösterirler.
        Böylece ekrana TRUE yazdırır. */

        String s1="kerem bey";
        String s2="kerem bey";
        System.out.println(s2==s1); // true





    }
}
