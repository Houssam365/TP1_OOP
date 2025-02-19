import java.util.ArrayList;

public class Bibliotheque {
    private String nom;
    private ArrayList<Livre> livres;

    // Constructeur
    public Bibliotheque(String nom) {
        this.nom = nom;
        this.livres = new ArrayList<>();
    }

    // ajouter un livre à la bibliotheque
    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    //chercher l'existence d'un livre dans la bibliotheque
    public boolean contientLivre(String titre) {
        for (Livre livre : livres) {
            if (livre.getTitre().equalsIgnoreCase(titre)) {
                return true;
            }
        }
        return false;
    }

    //afficher les livres d'un certain auteur
    public void afficherLivresParAuteur(String nomAuteur) {
        for (Livre livre : livres) {
            for (Auteur auteur : livre.getAuteurs()) {
                if (auteur.getNom().equalsIgnoreCase(nomAuteur)) {
                    System.out.println(livre);
                    break;
                }
            }
        }
    }

    //pour le nom de la bibliotheque
    public String getNom() {
        return nom;
    }

    //pour le nom de la bibliotheque
    public void setNom(String nom) {
        this.nom = nom;
    }

    //afficher tous les livres de la bibliotheque
    public void afficherTousLesLivres() {
        for (Livre livre : livres) {
            System.out.println(livre);
        }
    }
}
