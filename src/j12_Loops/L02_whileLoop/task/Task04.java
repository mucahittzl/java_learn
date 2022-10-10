package j12_Loops.L02_whileLoop.task;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */
int sayı=999;

		while (sayı>99){
			if (sayı%4==0&&sayı%6==0){
				System.out.println(sayı);

			}sayı--;
		}


		
			
	}

}
