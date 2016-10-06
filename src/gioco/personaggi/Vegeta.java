package gioco.personaggi;

import gioco.astratte.AzioniComuni;
import gioco.interfacce.Base;

public class Vegeta extends AzioniComuni implements Base{

	@Override
	public void pugno() {
		System.out.println("Sto dando un pugno");
		
	}

	@Override
	public void calcio() {
		System.out.println("Sto calciando");
		
	}

	@Override
	public void attaccoSpeciale() {
		
		
	}

}
