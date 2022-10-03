package HalukHocaJava.j01_Variables.j02_DataTypes_WrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String name="Haluk";
        int yas=33;


        System.out.println(name.toLowerCase());//lowerclass içinde yapılan işlemi küçük yazar.
        System.out.println(name.toUpperCase());//lowerclass içinde yapılan işlemi büyük yazar.


        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
        //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.

        //TASK id ve tc String değerlernin toplamını print eden code yazınız
        String tc ="1234455";
        String id="98765";
        System.out.println(tc+id);//concat-> birleştirme : 123445598765

        int yeniTC=  Integer.valueOf(tc);// tc String değerini int cevirdi ve yeniTC'ye atadı
        System.out.println("yeniTC = " + yeniTC);

        int yeniId=  Integer.valueOf(id);// tc String değerini int cevirdi ve yeniId'ye atadı
        System.out.println("yeniId = " + yeniId);

        System.out.println(yeniId+yeniTC);// aritmetik toplama->1333220
        String okulNo="234543l";
        //  int yeniOkulNo= Integer.valueOf(okulNo);// run time Exception-> çalışma zamanı hatası
        //  System.out.println("yeniOkulNo = " + yeniOkulNo);

        //TASK:byte short int maximum ve minimum değerlerini print eden code yazınız.

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        byte maxByteDegeri=Byte.MAX_VALUE;
        byte minBytedegeri=Byte.MIN_VALUE;
        int maxIntdegeri=Integer.MAX_VALUE;
        int minIntegerdegeri=Integer.MIN_VALUE;
        System.out.println("Integer.MAX_VALUE="+Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE="+Integer.MIN_VALUE);
        //wrapper class ta değerler farklı türlerde tanımlanır.string ifadeler integer e dönüştürülebilir.






    }
}














