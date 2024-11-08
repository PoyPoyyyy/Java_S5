package personnages.secondaires;
import personnages.principaux.*;
import personnages.*;

public class Traitre extends Samourai {
	private int niveauTraitrise;
	
	public Traitre(String nom, String boisson, int argent, String seigneur) {
		super(nom, boisson, argent, seigneur);
		this.niveauTraitrise = 0;
	}
	
	public void extorquer(Commercant commercant) {
		if (this.niveauTraitrise < 3) {
			int argent = commercant.seFaireExtorquer();
			this.gagnerArgent(argent);
			this.niveauTraitrise ++;
			String message = new String();
			message += "Je viens d'extorquer un commercant";
			this.parler(message);
		} 

	}
	
	@Override
	public void direBonjour() {
        super.direBonjour();
        String message = new String();
        message += "Mon niveau de maitrise " + this.niveauTraitrise;
        this.parler(message);
	}
	
	public void faireLeGentil(Humain humain, int argent) {;
		this.perdreArgent(argent);
		humain.gagnerArgent(argent);
		String message = new String();
		message += "Je fais ami ami";
		this.parler(message);
		float traitrise = argent / 10;
		if (this.niveauTraitrise < traitrise) {
			this.niveauTraitrise = 0;
		}
		else {
			this.niveauTraitrise -= traitrise;
		}
	}
}
