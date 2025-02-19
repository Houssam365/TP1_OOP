import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private String nom;
    private List<Livre> livres;

    // Constructeur
    public Bibliotheque(String nom) {
        this.nom = nom;
        this.livres = new ArrayList<>();
    }

    // Méthode pour ajouter un livre à la bibliothèque
    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    // Méthode pour chercher l'existence d'un livre dans la bibliothèque
    public boolean contientLivre(String titre) {
        for (Livre livre : livres) {
            if (livre.getTitre().equalsIgnoreCase(titre)) {
                return true;
            }
        }
        return false;
    }

    // Méthode pour afficher les livres d'un certain auteur
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

    // Getter pour le nom de la bibliothèque
    public String getNom() {
        return nom;
    }

    // Setter pour le nom de la bibliothèque
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthode pour afficher tous les livres de la bibliothèque
    public void afficherTousLesLivres() {
        for (Livre livre : livres) {
            System.out.println(livre);
        }
    }
}
