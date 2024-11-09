package personnages.secondaires;
import personnages.*;
import personnages.principaux.*;

import java.util.Random ;

public class Grandmere extends Humain{
	private Humain[] memoire = new Humain[30];
	private int compteur = 0;
	
	public Grandmere(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		this.memoire = new Humain[30];
	}
	
	private String HumainHasard() {
		Random random = new Random();
		String message = new String();
		switch (random.nextInt(1, 9)) {
			case 1:
				message += "Commercant";
				break;
			case 2:
				message += "Ronins";
				break;
			case 3:
				message += "Samourai";
				break;
			case 4:
				message += "Yakuza";
				break;
			case 5:
				message += "Colporteur";
				break;
			case 6:
				message += "Ninja";
				break;
			case 7:
				message += "Traitre";
				break;
			case 8:
				message += "Humain";
				break;
			default:
				message += " ";
				break;
		}
		return message;	
	}
	

	public void faireConnaissanceAvec(Humain humain) {
	    if (compteur < 30) {
	        this.memoire[compteur++] = humain;
	    }
	}
	
	public void ragoter() {
	    for (int i = 0; i < compteur; i++) {
	        String type = "Humain";
	        if (memoire[i] instanceof Commercant) {
	        	type = "Commerçant";
	        }
	        else if (memoire[i] instanceof Ronins) {
	        	type = "Ronin";
	        }
	        else if (memoire[i] instanceof Samourai) {
	        	type = "Samouraï";
	        }
	        else if (memoire[i] instanceof Yakuza) {
	        	type = "Yakuza";
	        }
	        else if (memoire[i] instanceof Traitre) {
	        	type = "Traître";
	        }
	        else {
	        	type = this.HumainHasard();
	        }
	        
	        if (memoire[i] instanceof Traitre) {
	        	String message = new String();
	        	message += ("Je sais que " + memoire[i].getNom() + " est un traître");
	        	this.parler(message);
	        } else {
	        	String message = new String();
	        	message += ("Je sais que " + memoire[i].getNom() + " est un" + type);
	        	this.parler(message);
	        }
	    }
	}
}
