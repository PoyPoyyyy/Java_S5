package personnages.principaux;
import personnages.*;

public class Ronins extends Humain {
	private int honneur;
	
	public Ronins(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		this.honneur = 1;
	}
	
	public void donner(int montant, Commercant commercant) {
		this.perdreArgent(montant);
		commercant.gagnerArgent(montant);
	}
	
	public void provoquer(Yakuza yakuza) {
		if ((this.honneur * 2) > yakuza.getReputation()) {
			int gain = yakuza.perdreDuel();
			this.gagnerArgent(gain);
			this.honneur ++;
			String message = new String();
			message += "J'ai gagné le duel";
			this.parler(message);
		}
		else {
			yakuza.gagnerDuel();
			this.honneur --;
		}
	}
	
}