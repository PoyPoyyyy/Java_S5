package personnages.principaux;

import personnages.*;

public class Commercant extends Humain {
	public Commercant(String nom, int argent) {
		super(nom, argent, "the");
	}
	
	public int seFaireExtorquer() {	
		int argent = this.getArgent();
		this.perdreArgent(argent);
		return argent;
	}
	
	public void recevoir(int montant) {
		this.gagnerArgent(montant);
	}
}
