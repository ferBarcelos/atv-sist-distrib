package Exercicio01;

public class ClassProg implements Runnable {
	
	
	private String texto;
	private long lapso;
	
	public ClassProg(String texto, long lapso) {
		this.texto = texto;
		this.lapso = lapso;
	}
	

	public void run() {
		for(char a: texto.toCharArray()) {
			System.out.println(a);
			try {
				Thread.sleep(lapso);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	

}