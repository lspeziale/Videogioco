package gioco;

import gioco.personaggi.Goku;
import gioco.personaggi.Vegeta;
import gioco.personaggi.personaggi;

public class VideogiocoMain {

	public static void main(String[] args) {
		Goku g1 = new Goku(3, 1000, " Goku ");
		Vegeta v1 = new Vegeta(1, 190, " Vegeta ");

		while (g1.getHp() >= 0 || v1.getHp() >= 0) {

			g1.dannoRicevuto(v1.calcio());
			v1.dannoRicevuto(g1.pugno());

			g1.dannoRicevuto(v1.pugno());
			v1.dannoRicevuto(g1.calcio());

			g1.dannoRicevuto(g1.attaccoSpeciale());
		}

	}
}