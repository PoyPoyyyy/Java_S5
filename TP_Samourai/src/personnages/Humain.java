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
		System.out.println(this.getClass().getSimpleName()+ "  -->  " + texte);
	}
	
	public void direBonjour() {
		String message = new String();
		message += "Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boisson;
		this.parler(message);
	}
	
	public void boire() {
		String message = new String();
		message += "Mmmm, un bon verre de " + this.boisson + " ! GLOUPS !";
		this.parler(message);
	}
	
	public String getNom() {
		return this.nom;
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
