package j14_Scope;

public class C02_StaticVariable {

    /* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
    ogrenci notlari veya ogretmen branslari gibi
    bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

   Static variabler ise class variable olarak tanimlanir
   ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
   eger static variable'in degeri degistirilirse herkes icin degisir
 */

    static String firmaname="clarusway";
    static int firmaID;
    static boolean firmaIT; // bunlar static her heye çagırılır

    public static void main(String[] args) {
        System.out.println(firmaID);
        firmaID=1001; //tavsiye edilen call etme şekli
        System.out.println("firmaID"+firmaID);//1001
C02_StaticVariable.firmaIT=true; //classname ile static variable call>bad practise amele işi

        staticMethod();//static method static maine call edildi ->astral seyehat gibi
      //  nonStaticmethod(); //static olmadıgı için çagırılamaz
    } //main sonu

public static void staticMethod(){
        firmaID=2002; //static oldugu için call edilebilir
    System.out.println("agam yeni ıd :"+firmaID);
}
public void nonStaticmethod(){

      firmaname="javacanlar"; //method static olmasa da call edilen değer static oldugu ıcın cagırılabılır
    System.out.println("agam yeni firman:"+firmaname);

}

}
