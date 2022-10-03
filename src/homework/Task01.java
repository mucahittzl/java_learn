package homework;

public class Task01 {
	public static void main(String[] args) {
		int x = 4;
        x++; // x=5
        x += x; // x=10
        --x;   // x=9
        x = 7 + x; // x=16
        x *= x;    // x=256
        x -= 3;   // x=253

        System.out.println(" x = " + x );
        
        int a = 3;
        double d = 4.5;

        d+=a; // 7.5
        a+=d; // 10
        d-=a; // -3
        a-=d; // -2.5

        System.out.println(" d = " + ++d );
        System.out.println(" a = " + a-- );
        
        

	}

}
