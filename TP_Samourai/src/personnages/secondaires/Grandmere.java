package personnages.secondaires;
import personnages.*;
import java.util.Random ;

public class Grandmere extends Humain{
	private Humain[] memoire = new Humain[30];
	
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
		
		public void faireConnaissanceAvec (Humain humain) {
			
		}
		
		public void ragoter() {
			
		}
	}
}
