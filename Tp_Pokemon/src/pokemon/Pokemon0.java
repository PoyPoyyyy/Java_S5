package pokemon;
import java.util.Random;

public class Pokemon0 {
	private String nom;
	private int niveau;
	private float hp;
	private float atk;
	
	public Pokemon0(String nom) {
		Random random = new Random();
		int niveau = random.nextInt(1, 11);
		this.nom =nom;
		this.niveau = niveau;
		this.hp =2;
		this.atk = (niveau/2) +1;
		
		
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public float getHp() {
		return hp;
	}

	public void setHp(float f) {
		this.hp = f;
	}

	public float getAtk() {
		return atk;
	}

	public void setAtk(float atk) {
		this.atk = atk;
	}
	
	public boolean isKO() {
		if (this.hp <= 0) {
			return true;
		}
		return false;
	}
	
	public void soigner() {
		this.hp =2;
	}
	
	public void attaquer(Pokemon0 pokemon) {
		pokemon.setHp((pokemon.getHp()-this.atk));
		if (pokemon.isKO()) {
			pokemon.setHp(0);
			System.out.println("Le Pokemon " + this.nom + " est mort.");
		}
	}
	
	@Override
	public String toString() {
		String message = new String();
		message += "Nom : " + nom;
		message += "\nNiveau : " + niveau;
		message += "\nHP : " + hp;
		message += "\nATK : " + atk;
		return message;
	}
	
	public void log(String message) {
		System.out.println("[ Pokemon " + this.nom + " ]");
		System.out.println(message);
	}
	
}
