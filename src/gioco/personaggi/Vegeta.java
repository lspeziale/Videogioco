package gioco.personaggi;

import gioco.astratte.PersonaggioAstratto;
import gioco.interfacce.Metodi_Combattimento;

public class Vegeta extends PersonaggioAstratto implements Metodi_Combattimento {

	public Vegeta(int liv, int hp, String nome) {
		super(liv, hp, nome);
	}

	@Override
	public int attaccoSpeciale() {
		if (mossaSpeciale == true) {
			danno = danno * 5;
			energia = 0;
			mossaSpeciale = false;
		}
		System.out.println("Attacco speciale");
		return danno;

	}

	@Override

	public int getHp() {
		return hp;
	}

}