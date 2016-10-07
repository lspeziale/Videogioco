package gioco.personaggi;

import gioco.astratte.AzioniComuni;
import gioco.interfacce.Base;

public class Vegeta extends AzioniComuni implements Base{
	int liv;
	int hp;
	int hpInizio;
	int danno = 50;
	
	public Vegeta(int liv, int hp){
		this.hp = hp;
		this.liv = liv;
		this.hpInizio= hp;
	}
	
	
	
	
	@Override
	public int pugno() {
		
		return 0;
	}

	@Override
	public int calcio() {
		
		return 0;
	}

	@Override
	public void dannoRicevuto(int a) {
		
		
	}




	@Override
	public int attaccoSpeciale() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
}
