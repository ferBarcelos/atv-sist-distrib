package Exercicio02;

public class CalcRaizQuad implements Runnable{

	
	public void run() {
		for(int i = 1; i <= 99;i++ ) {
			if(i%2 != 0) {
				System.out.println(Math.sqrt(i));
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

