package gioco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import gioco.astratte.PersonaggioAstratto;
import gioco.personaggi.Goku;
import gioco.personaggi.Vegeta;

public class VideogiocoMain {

	public static void main(String[] args) {
		List<PersonaggioAstratto> listaPersonaggi = new ArrayList<PersonaggioAstratto>();

		Goku g1 = new Goku(1, 10000, " Goku ");
		Vegeta v1 = new Vegeta(1, 10000, " Vegeta ");

		listaPersonaggi.add(g1);
		listaPersonaggi.add(v1);

		int playerUno = 0;
		int playerDue = 1;
		int attacco=0;
		int attaccoEstratto;
		boolean morte;
		String nomePersonaggio1=listaPersonaggi.get(0).getNome();
		String nomePersonaggio2=listaPersonaggi.get(1).getNome();
		int puntiVita1=0;
		int puntiVita2=0;
		while (true) {
			
			System.out.println("-----------------------------------------");
			System.out.print("("+listaPersonaggi.get(playerUno).getNome() +" "+listaPersonaggi.get(playerUno).getHp()+" - ");
			System.out.println(listaPersonaggi.get(playerDue).getNome() +" "+listaPersonaggi.get(playerDue).getHp()+")");
			attaccoEstratto = (int) (Math.random() * 100);
			if((attaccoEstratto <50)&&(attaccoEstratto>=0))
			{
				attacco = listaPersonaggi.get(playerDue).pugno();
			}else if((attaccoEstratto <90)&&(attaccoEstratto>=50))
			{
				attacco = listaPersonaggi.get(playerDue).calcio();
			}else if((attaccoEstratto <100)&&(attaccoEstratto>=90))
			{
				attacco = listaPersonaggi.get(playerDue).attaccoSpeciale();
			}
			morte = listaPersonaggi.get(playerUno).dannoRicevuto(attacco);
			System.out.print("("+listaPersonaggi.get(playerUno).getNome() +" "+listaPersonaggi.get(playerUno).getHp()+" - ");
			System.out.println(listaPersonaggi.get(playerDue).getNome() +" "+listaPersonaggi.get(playerDue).getHp()+")");
			if (morte)
			{
				System.exit(0);
			}else{
				if(playerUno == 0)
				{
					playerUno = 1;
					playerDue = 0;
				}else
				{
					playerUno = 0;
					playerDue = 1;
				}
			}
			//System.out.println("-----------------------------------------");
		}
	}

}