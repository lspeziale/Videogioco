package gioco;

import gioco.personaggi.Goku;
import gioco.personaggi.Vegeta;

public class VideogiocoMain {

	public static void main(String[] args) {
		Goku g1 = new Goku(3, 1000, " Goku ");
		Goku g2 = new Goku(2, 1200, " Vegeta ");
		Vegeta v1 = new Vegeta(1, 190);

		while (g1.getHp() >= 0 || g2.getHp() >= 0) {

			g1.dannoRicevuto(g2.calcio());
			g2.dannoRicevuto(g1.pugno());

			g1.dannoRicevuto(g2.pugno());
			g2.dannoRicevuto(g1.calcio());

			g1.dannoRicevuto(g1.attaccoSpeciale());
		}

	}
}