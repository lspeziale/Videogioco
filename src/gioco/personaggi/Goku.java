package gioco.personaggi;

import gioco.astratte.AzioniComuni;
import gioco.interfacce.Base;

public class Goku extends AzioniComuni implements Base {
	int liv;
	int hp;
	int hpInizio;
	int danno = 50;

<<<<<<< HEAD
	public Goku(int liv, int hp) {
		this.hp = hp;
		this.liv = liv;
		this.hpInizio= hp;
	}

	public int pugno() {
		System.out.println("Sto pugnando");
		int dannoPugno = danno * liv;
		return dannoPugno;

=======
	@Override
	public void pugno() {
				//Bella per te!
>>>>>>> branch 'master' of https://github.com/lspeziale/Videogioco.git
	}

	@Override
	public int calcio() {
		System.out.println("Sto calciando");
		int dannoPugno = (int) (danno * liv * 1.2);
		return dannoPugno;
	}

	@Override
	public void attaccoSpeciale() {
<<<<<<< HEAD
		// TODO Auto-generated method stub

=======
	
		
>>>>>>> branch 'master' of https://github.com/lspeziale/Videogioco.git
	}

	@Override
	public void dannoRicevuto(int attacco) {
		hp = hp - attacco;
        if (hp<=0){
        	System.out.print("MORTO");
        }else{System.out.print("PUNTI VITA"+ hp);}
        
	}

}
