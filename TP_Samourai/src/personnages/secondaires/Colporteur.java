package personnages.secondaires;

import personnages.principaux.*;
import personnages.Humain;

public class Colporteur extends Commercant {

    public Colporteur(String nom, int argent, String boisson) {
        super(nom, argent);
    }
    
    @Override
    public int seFaireExtorquer() {
        int argentExtorque = this.getArgent() / 2;
        this.perdreArgent(argentExtorque); 
        this.parler("Je donne seulement la moitié de mon argent");
        return argentExtorque;
    }
}
