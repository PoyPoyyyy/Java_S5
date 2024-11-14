package pokemon;

public enum TypePokemon {
    PokemonFeu("PokemonFeu"), 
    PokemonEau("PokemonEau"), 
    PokemonPlante("PokemonPlante");

	private String type;
	
	TypePokemon(String type) {
		this.type = type;
	}

}
