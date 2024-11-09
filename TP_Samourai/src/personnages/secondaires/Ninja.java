package personnages.secondaires;

import personnages.principaux.Yakuza;
import java.util.Random;

public class Ninja extends Yakuza {

    private static final String[] CLANS_NINJA = {
        "of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"
    };
    
    private String clanSecret;

    public Ninja(String nom, int argent, String boisson, String clan) {
        super(nom, argent, boisson, clan);
        this.clanSecret = clan + " " +getRandomClan();
    }

    private String getRandomClan() {
        Random random = new Random();
        switch (random.nextInt(5)) {
            case 0:
                return CLANS_NINJA[0];
            case 1:
                return CLANS_NINJA[1]; 
            case 2:
                return CLANS_NINJA[2]; 
            case 3:
                return CLANS_NINJA[3];
            case 4:
                return CLANS_NINJA[4];
            default:
            	return "";
        }
    }

    @Override
    public void direBonjour() {
        super.direBonjour();
        String message = new String();
        message += "Je fais partie du clan " + this.getClan();
        message += "Mon clan secret est " + this.clanSecret;
        this.parler(message);
    }
}
