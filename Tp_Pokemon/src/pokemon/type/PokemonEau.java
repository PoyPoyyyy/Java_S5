package pokemon.type;
import pokemon.Pokemon;
import pokemon.TypePokemon;

public class PokemonEau extends Pokemon {

	public PokemonEau(String nom) {
		super(nom, TypePokemon.PokemonEau);
	}

	@Override
	public void attaquer(Pokemon pokemon) {
		System.out.println(this.getNom() +"attaque" + pokemon.getNom());
		pokemon.subir(this);
	}

	@Override
	public void subir(Pokemon pokemon) {
		switch(pokemon.getType()) {
		case PokemonEau:
			this.setHp(this.getHp()- (pokemon.getAtk()*2));
		case PokemonFeu, PokemonPlante:
			this.setHp(this.getHp()- (pokemon.getAtk()*0.5));
		}
		if (this.isKO()) {
			this.setHp(0);
			System.out.println("Le Pokemon " + this.getNom() + " est mort.");
		}
	}
}