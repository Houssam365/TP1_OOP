import java.util.ArrayList;


public class Auteur {
    private String nom;
    private String prenom;
    private String languePrincipale;
    private ArrayList<Livre> livres; // liste des livres ecrits par l'auteur

    public Auteur(String nom, String prenom, String languePrincipale) {
        this.nom = nom;
        this.prenom = prenom;
        this.languePrincipale = languePrincipale;
        this.livres = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getLanguePrincipale() {
        return languePrincipale;
    }

    public ArrayList<Livre> getLivres() {
        return new ArrayList<>(livres);
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    
    public String toString() {
        return prenom + " " + nom + " (" + languePrincipale + ")";
    }
}