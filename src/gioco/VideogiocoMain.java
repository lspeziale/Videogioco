package gioco;

import java.util.ArrayList;
import java.util.Iterator;

import gioco.astratte.AzioniComuni;
import gioco.personaggi.Goku;
import gioco.personaggi.Vegeta;

public class VideogiocoMain {

	public static void main(String[] args) {
		ArrayList<Object> listaPersonaggi = new ArrayList<Object>();
		
		Goku g1 = new Goku(3, 1000, " Goku ");
		Vegeta v1 = new Vegeta(1, 190, " Vegeta ");
		
		listaPersonaggi.add(g1);
		listaPersonaggi.add(v1);
		
/*		
		Iterator<AzioniComuni> ite = listaPersonaggi.iterator();

		while (ite.hasNext()) {
			AzioniComuni lista = (AzioniComuni) ite.next();
		}
		*/

		while (g1.getHp() >= 0 || v1.getHp() >= 0) {
				/*
				 * 
				 ciclo(true)
				 {
				 	indice= 0 / 1;
				 	
				 	arrayList(indice).dannoSubito(ArrayList(!indice).calcio());
				 	if(arrayList(indice).getHP <= 0)
				 	{
				 		Stampa(arrayList(indice).getName() " è MORTO");
				 		BREAK;
				 	}
				 	
				 	CAMBIA INDICE;
				 }
				 
				 */
			
			g1.dannoRicevuto(v1.calcio());
			v1.dannoRicevuto(g1.pugno());

			g1.dannoRicevuto(v1.pugno());
			v1.dannoRicevuto(g1.calcio());

			g1.dannoRicevuto(g1.attaccoSpeciale());
		}

	}
}