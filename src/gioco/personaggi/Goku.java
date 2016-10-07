package gioco.personaggi;

import gioco.astratte.AzioniComuni;
import gioco.interfacce.Base;

public class Goku extends AzioniComuni implements Base {
	private int liv;
	private int hp;
	private int hpInizio;
	private int danno = 50;
	private int energia = 0;
	private boolean mossaSpeciale;
	private String nome;

	public Goku(int liv, int hp, String nome) {
		this.setHp(hp);
		this.liv = liv;
		this.hpInizio = hp;
		this.nome = nome;
	}

	public int pugno() {
		System.out.println(nome + " Sta tirando un pugno ");
		int dannoPugno = danno * liv;
		energia += 5;
		return dannoPugno;
	}

	@Override
	public int calcio() {
		System.out.println(nome+ " Sta calciando ");
		int dannoPugno = (int) (danno * liv * 1.2);
		energia += 5;
		if (energia == 15) {
			mossaSpeciale = true;
		}
		return dannoPugno;
	}

	@Override
	public int attaccoSpeciale() {
		if( mossaSpeciale == true){
			danno = danno * 2;
		}
		System.out.println("Attacco speciale");
		return danno;
		

	}

	@Override
	public void dannoRicevuto(int attacco) {
		setHp(getHp() - attacco);
		if (getHp() <= 0) {
			System.out.print(" Morto ");
		} else {
			System.out.print("I punti vita di "+ nome + " = " + getHp() + ";  ");
		}

	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	

}
