package pokemon.type;
import pokemon.Pokemon;
import pokemon.TypePokemon;

public class PokemonFeu extends Pokemon {
	public PokemonFeu(String nom) {
		super(nom, TypePokemon.PokemonFeu);
	}

	@Override
	public void attaquer(Pokemon pokemon) {
		System.out.println(this.getNom() +"attaque" + pokemon.getNom());
		pokemon.subir(this);
	}

	@Override
	public void subir(Pokemon pokemon) {
		switch(pokemon.getType()) {
		case PokemonEau, PokemonFeu:
			this.setHp(this.getHp()- (pokemon.getAtk()*0.5));
		case PokemonPlante:
			this.setHp(this.getHp()- (pokemon.getAtk()*2));
		}
		if (this.isKO()) {
			this.setHp(0);
			System.out.println("Le Pokemon " + this.getNom() + " est mort.");
		}
	}
}

