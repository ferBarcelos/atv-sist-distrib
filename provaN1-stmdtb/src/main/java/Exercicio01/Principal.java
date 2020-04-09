package Exercicio01;

public class Principal {
	
public static void main(String[] args) {
		
		ClassProg crl = new ClassProg("eu achei isso", 500);
		ClassProg crl1 = new ClassProg("bastante dificil", 1000);
		ClassProg crl2 = new ClassProg("preciso estudar mais!", 2000);
		Thread th1 = new Thread(crl);
		Thread th2 = new Thread(crl1);
		Thread th3 = new Thread(crl2);

		th1.start();
		th2.start();
		th3.start();

	}
}
