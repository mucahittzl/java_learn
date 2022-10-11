package j14_Scope;

public class C04_LocalVariable {


    public static void main(String[] args) {

        int yas=33;
        System.out.println("yas="+yas);//33
        for (int i = 0; i <7 ; i++) { //for başı
            System.out.print(yas+" :) "); // yas local variable aynı methoda call edildi
        } //for sonu

      // i=34; //local dışı call edilemez sadece for içinde çalısır bu halıyle
        yas=35; //local variable call edildi. main içi işlem




    }//amin sonu

   // yas=48; //local dişi call edilemez

}
