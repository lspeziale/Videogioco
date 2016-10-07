package gioco;

import gioco.personaggi.Goku;
import gioco.personaggi.Vegeta;

public class VideogiocoMain {

	public static void main(String[] args) {
		Goku g1 = new Goku(3, 120);
		Goku g2 = new Goku(2, 120);
		Vegeta v1 = new Vegeta(3, 120);

		g1.dannoRicevuto (g1.calcio());
	}

}
