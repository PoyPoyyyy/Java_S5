package dresseur;
import java.util.ArrayList;
import java.util.Random;
import pokemon.*;
import pokemon.type.*;
import dresseur.SacADos;

public class Dresseur {
	public static int nbDresseurs;
	public static int[] nbParEquipe;
	private String nom;
	private int argent;
	private SacADos sacados;
	private Equipe equipe;
	
	public Dresseur(String nom) {
		this.nom = nom;
		choixEquipe();
		nbDresseurs++;
	}
	
	private void choixEquipe() {
		Random random = new Random();
		switch(random.nextInt(1,4)) {
			case 1:
				this.equipe = Equipe.Bravoure;
				break;
			case 2:
				this.equipe = Equipe.Intuition;
				break;
			case 3:
				this.equipe = Equipe.Sagesse;
				break;
			
		}
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getNbPokemons() {
		return this.sacados.getNbPokemons();
	}
	
	public int getArgent() {
		return this.argent;
	}
	
	public void setArgent(int argent) {
		this.argent = argent;
	}
	
	public void prendreArgent(Dresseur dresseur) {
		dresseur.setArgent(dresseur.getArgent());
		this.setArgent(this.getArgent()+10);
	}
	
	public void capturerPokemons() {
		this.sacados.capturerPokemons();
	}
	
	public boolean peutCombatre() {
		boolean peut = true;
		for (Pokemon pokemon : sacados) {
			
		}
	}
}
