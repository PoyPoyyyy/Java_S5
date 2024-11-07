package personnages.principaux;
import personnages.*;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
		this.reputation = 0;
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
		this.reputation ++;
		String message = new String();
		message += "Je viens d'extorquer un commerçant";
		this.parler(message);
	}
	
	public void gagnerDuel() {
		this.reputation ++;
		String message = new String();
		message += "J'ai gagné un duel";
		this.parler(message);
	}
	
	public int perdreDuel() {
		int argent = this.getArgent();
		this.perdreArgent(argent);
		this.reputation --;
		String message = new String();
		message += "J'ai perdu un duel";
		this.parler(message);
		return argent;
	}
	
	@Override
	public void direBonjour() {
	    super.direBonjour();
	    String message = new String();
	    message += "Je suis un yakuza du clan" + this.clan;
	    this.parler(message);
	}

}
