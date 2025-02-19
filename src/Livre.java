import java.util.ArrayList;
import java.util.List;

class Livre {
    String titre;
    List<Auteur> auteurs;
    int anneePremiereParution;
    List<Personnage> personnages; 

    // Constructeur
    public Livre(String titre, List<Auteur> auteurs, int anneePremiereParution) {
        this.titre = titre;
        this.auteurs = new ArrayList<>(auteurs);
        this.anneePremiereParution = anneePremiereParution;
        this.personnages = new ArrayList<>();

        for (Auteur auteur : auteurs) {
            auteur.ajouterLivre(this);
        }//ajouter le livre a la liste des livres de chaque auteur
    }

    // Getters
    public String getTitre() {
        return titre;
    }

    public List<Auteur> getAuteurs() {
        return new ArrayList<>(auteurs);
    }

    public int getAnneePremiereParution() {
        return anneePremiereParution;
    }

    // Setters
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteurs(List<Auteur> auteurs) {
        this.auteurs = new ArrayList<>(auteurs);
        for (Auteur auteur : auteurs) {
            auteur.ajouterLivre(this);
        }
    }

    public void setAnneePremiereParution(int anneePremiereParution) {
        this.anneePremiereParution = anneePremiereParution;
    }

    public void affichePersonnages(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("Titre: " + titre);
        System.out.println("Auteurs: ");

        for (Auteur auteur : auteurs) {
            System.out.println(auteur);
        }//afficher les auteurs

        System.out.println("Année de première parution: " + anneePremiereParution);
        System.out.println("Personnages:");

        for (Personnage personnage : personnages) {
            System.out.println(personnage);
        }//afficher les personnages
        
        System.out.println("------------------------------------------------------------------");
    }

    //pour ajouter un personnage
    public void ajouterPersonnage(Personnage unPersonnage){
        personnages.add(unPersonnage);
    }

    //pour verifier si un personnage existe
    public boolean contientPersonnage(String nom){
        for (Personnage personnage : personnages) {
            if (personnage.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    public String toString(){

        StringBuilder auteursStr = new StringBuilder();
        for (Auteur auteur : auteurs) {
            auteursStr.append(auteur).append(", ");
        }
        return "Titre: " + titre + "\nAuteurs: " + auteursStr.toString() + "\nAnnée de première parution: " + anneePremiereParution;
    }
}