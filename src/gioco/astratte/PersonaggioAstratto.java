package gioco.astratte;

import gioco.interfacce.Base;

public abstract class PersonaggioAstratto implements Base {
	protected int liv;
	protected int hp;
	protected int hpInizio;
	protected int danno = 50;
	protected int energia = 0;
	protected boolean mossaSpeciale;
	protected String nome;

	public PersonaggioAstratto(int liv, int hp, String nome) {
		setHp(hp);
		this.liv = liv;
		this.hpInizio = hp;
		this.nome = nome;
	}

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

	public boolean dannoRicevuto(int attacco) {
		setHp(getHp() - attacco);
		boolean a;
		if (getHp() <= 0) {
			System.out.print(" Morto " + nome);
			a = true;
		} else {
			//System.out.print(I punti vita di "+ nome + " = " + getHp() + "; ");
			a = false;
		}
		return a;
	}

	public int pugno() {
		System.out.println(nome + " sta tirando un pugno ");
		int dannoPugno = danno * liv;
		energia += 5;
		if (energia == 15) {
			mossaSpeciale = true;
		}
		return dannoPugno;
	}

	public int calcio() {
		System.out.println(nome +" sta tirando un calcio ");
		int dannoPugno = (int) (danno * liv * 1.2);
		energia += 5;
		if (energia == 15) {
			mossaSpeciale = true;
		}
		return dannoPugno;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

	public int getLiv() {
		return liv;
	}

	public int getHpInizio() {
		return hpInizio;
	}

	public int getDanno() {
		return danno;
	}

	public int getEnergia() {
		return energia;
	}

	public boolean isMossaSpeciale() {
		return mossaSpeciale;
	}

	public String getNome() {
		return nome;
	}
}
