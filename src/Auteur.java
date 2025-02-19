import java.util.ArrayList;
import java.util.List;

public class Auteur {
    private String nom;
    private String prenom;
    private String languePrincipale;
    private List<Livre> livres;

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

    public List<Livre> getLivres() {
        return new ArrayList<>(livres);
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    @Override
    public String toString() {
        return prenom + " " + nom + " (" + languePrincipale + ")";
    }
}