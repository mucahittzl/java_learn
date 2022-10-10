package TekrarDersleri.For.While;

public class C01 {
    public static void main(String[] args) {




// 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.


        for (int i = 0 ; i<=255 ; i++) {
            System.out.println(i);
            System.out.println((char)i);
        }


        int k=0;
//*************************
        while (k<255){
            System.out.print(k);
            System.out.print((char)k);
            k++;
        }
//*************************

        int t=0;
        do {
            System.out.print(t);
            System.out.print((char)t);
            t++;

        }while (t<=255);

    }


}
