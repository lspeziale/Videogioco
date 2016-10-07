package gioco.astratte;

import java.util.Scanner;

public abstract class AzioniComuni {
	public void avanti() {
		System.out.println("avanti");
	}

	public void indietro() {
		System.out.println("indietro");
	}

	public void destra() {
		System.out.println("destra");
	}

	public void sinistra() {
		System.out.println("sinistra");
	}

	public void salta() {
		System.out.println("salta");
	}
	
	public void scegliPersonaggio(){
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.next();
	}

	
	public abstract int attaccoSpeciale();
}
