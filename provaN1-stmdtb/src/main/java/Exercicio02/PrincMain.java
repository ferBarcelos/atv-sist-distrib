package Exercicio02;

public class PrincMain {
	
	public static void main(String[] args) {
	
		Thread t1 = new Thread(new CalcRaizQuad());
	    Thread t2 = new Thread(new CalcRaizCubica());

		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			System.out.println("FIM");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
