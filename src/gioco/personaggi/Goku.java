package gioco.personaggi;

import gioco.astratte.PersonaggioAstratto;
import gioco.interfacce.Base;

public class Goku extends PersonaggioAstratto implements Base {

	public Goku(int liv, int hp, String nome) {
		super(liv,hp,nome);
	}
	

	@Override
	public int attaccoSpeciale() {
		if( mossaSpeciale == true){
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
