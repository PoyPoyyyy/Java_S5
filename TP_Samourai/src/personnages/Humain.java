package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;
	
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	public void parler(String texte) {
		System.out.println(texte);
	}
	
	public void direBonjour() {
		String message = new String();
		message += "Bonjour ! Je m'appelle ";
		message += this.nom;
		message += " et j'aime boire du ";
		message += this.boisson;
		this.parler(message);
	}
	
	public void boire() {
		String message = new String();
		message += "Mmmm, un bon verre de ";
		message += this.boisson;
		message += " ! GLOUPS !";
		this.parler(message);
	}
	
	public int getArgent() {
		return this.argent;
	}
	
	public String getBoisson() {
		return this.boisson;
	}
	
	public void gagnerArgent(int montant) {
		this.argent = this.argent + montant;
	}
	
	public void perdreArgent(int montant) {
		this.argent = this.argent - montant;
	}
}