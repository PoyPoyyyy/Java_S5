package pokemon;

import pokemon.TypePokemon;
import java.util.Random;

public abstract class Pokemon {
    private String nom;
    private int niveau;
    private double hp;
    private float atk;
    private TypePokemon type;
    

    public Pokemon(String nom, TypePokemon type) {
        Random random = new Random();
        this.nom = nom;
        this.niveau = random.nextInt(1, 11);
        this.hp = 2*this.niveau;
        this.atk = (this.niveau / 2) + 1;
        this.type = type;
    }
    
    public TypePokemon getType() {
    	return this.type;
    }
    
    public void setType(TypePokemon type) {
    	this.type = type;
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

    public double getHp() {
        return hp;
    }

    public void setHp(double d) {
        this.hp = d;
    }

    public float getAtk() {
        return atk;
    }

    public void setAtk(float atk) {
        this.atk = atk;
    }

    public boolean isKO() {
        return this.hp <= 0;
    }

    public void soigner() {
        this.hp = 2;
    }

    public abstract void attaquer(Pokemon pokemon);
    
    public abstract void subir(Pokemon pokemon);

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
        System.out.println("[ Pokémon " + this.nom + " ]");
        System.out.println(message);
    }
}
