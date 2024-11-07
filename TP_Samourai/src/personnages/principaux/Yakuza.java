package personnages.principaux;
import personnages.*;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, int argent, String boisson, String clan, int reputation) {
		super(nom, argent, boisson);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public String getClan() {
		return this.clan;
	}
	
	public int getReputation() {
		return this.reputation;
	}
	
	public void extorquer(Commercant commercant) {
		int argentExtorque = commercant.seFaireExtorquer();
		this.gagnerArgent(argentExtorque);
		this.reputation += 1;
		String message = new String();
		message += "Je viens d'extorquer un commerçant";
		this.parler(message);
	}
	
	public void gagnerDuel() {
		this.reputation += 1;
		String message = new String();
		message += "J'ai gagné un duel";
		this.parler(message);
	}
	
	public int perdreDuel() {
		int argent = this.getArgent();
		this.perdreArgent(argent);
		this.reputation -= 1;
		String message = new String();
		message += "J'ai perdu un duel";
		this.parler(message);
		return argent;
	}
	
	@Override
	public void direBonjour() {
		
	}
}
