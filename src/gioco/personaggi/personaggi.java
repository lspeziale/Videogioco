package gioco.personaggi;

public class personaggi{

	private int liv;
	private int hp;
	private int hpInizio;
	private int danno = 50;
	private int energia = 0;
	private boolean mossaSpeciale;
	private String nome;

	public int pugno() {

		System.out.println(nome + " Sta tirando un pugno ");
		int dannoPugno = danno * liv;
		energia += 5;
		return dannoPugno;

	}

	public int calcio() {
		System.out.println(nome + " Sta calciando ");
		int dannoPugno = (int) (danno * liv * 1.2);
		energia += 5;
		if (energia == 15) {
			mossaSpeciale = true;
		}
		return dannoPugno;

	}
}