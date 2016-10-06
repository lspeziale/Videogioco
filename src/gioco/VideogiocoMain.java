package gioco;

import gioco.personaggi.Goku;

public class VideogiocoMain {

	public static void main(String[] args) {
		Goku p1 = new Goku(3, 120);
		Goku p2 = new Goku(2, 120);

		p1.dannoRicevuto (p2.calcio());
	}

}
