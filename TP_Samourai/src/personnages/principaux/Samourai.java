package personnages.principaux;

public class Samourai extends Ronins {
    private String seigneur;
    
    public Samourai(String nom, String boisson, int argent, String seigneur) {
        super(nom, argent, boisson);
        this.seigneur = seigneur;
    }
    
    @Override
    public void direBonjour() {
        super.direBonjour();
        String message = new String();
        message += "Je suis un samouraï et je sers le seigneur" + this.seigneur;
        this.parler(message);
    }

    public void boire(String boisson) {
        String message = new String();
        message += "Mmmm, un bon verre de " + boisson + " ! GLOUPS !";
        this.parler(message);
    }
}
