package gioco.astratte;

import gioco.interfacce.Base;

public abstract class AzioniComuni implements Base{
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
	
	
	
	

	
	public abstract int attaccoSpeciale();
}
