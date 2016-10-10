package gioco.personaggi;

import gioco.interfacce.Metodi_Combattimento;
import gioco.astratte.PersonaggioAstratto;

public class Bu extends PersonaggioAstratto implements Metodi_Combattimento {

	public Bu(int liv, int hp, String nome) {
		super(liv, hp, nome);
	}

	@Override
	public int attaccoSpeciale() {
		if (mossaSpeciale == true) {
			danno = danno * 2;
			energia = 0;
			mossaSpeciale = false;
		}
		System.out.println(nome + " Attacco speciale");
		return danno;
	}

	
	
	@Override

	public int getHp() {
		return hp;
	}


}
