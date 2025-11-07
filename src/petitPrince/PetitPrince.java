package petitPrince;
import asteroide.console.*;
import asteroide.Sujet;

public class PetitPrince implements Sujet{
	
	private String nom;
	private int argent;
	private ConsoleJavaBoy console;
	private int cpt;
	
	public PetitPrince(String nom) {
		this.nom = nom;
		this.argent = 0;
		console = new ConsoleJavaBoy(this);
		//run();
	}
	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public int getArgent() {
		return argent;
	}

	@Override
	public void run() {
		console.parler("Bonjour");
		console.seDirigerVers(0);
		cpt ++;
	}

}

