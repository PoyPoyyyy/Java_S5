package histoires;
import personnages.*;
import personnages.secondaires.*;
import personnages.principaux.*;

public class MonHistoire {

	public static void main(String [] args) {    
	  Humain humain = new Humain("Prof", 10, "Porto");
	  humain.direBonjour();
	  humain.boire();
	  Commercant commercant = new Commercant("Marchand", 35);
	  commercant.direBonjour();
	  Yakuza yakusa = new Yakuza("Yaku␣le␣noir", 42, "biere", "WarSong");
	  yakusa.direBonjour();
	  yakusa.extorquer(commercant);
	  Ronins ronin = new Ronins("Roro", 61, "sake");
	  ronin.donner(10, commercant );
	  ronin.provoquer(yakusa);
	  ronin.direBonjour();
	  Colporteur colporteur = new Colporteur("Axel", 0, "Ricard");
	  Grandmere grandmere = new Grandmere("Le B", 0,"Schweps");
	  grandmere.faireConnaissanceAvec(colporteur);
	  grandmere.direBonjour();
	  Ninja ninja = new Ninja("Le M", 0, null, null);
	  ninja.direBonjour();
	  Traitre traite = new Traitre("Le A", null, 0, null);
	  traite.direBonjour();
	}
	
}
