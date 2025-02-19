import java.util.ArrayList;
import java.util.List;

class Livre {
    String titre;
    String auteur;
    int anneePremiereParution;
    List<Personnage> personnages; 

    
    public Livre(String titre, String auteur, int anneePremiereParution) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePremiereParution = anneePremiereParution;
        this.personnages = new ArrayList<>();
    }

    
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getAnneePremiereParution() {
        return anneePremiereParution;
    }


    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setAnneePremiereParution(int anneePremiereParution) {
        this.anneePremiereParution = anneePremiereParution;
    }

    public void affichePersonnages(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("Année de première parution: " + anneePremiereParution);
        System.out.println("------------------------------------------------------------------");
    }

    public void ajouterPersonnage(Personnage unPersonnage){
        personnages.add(unPersonnage);
    }

    public boolean contientPersonnage(String nom){
        for (Personnage personnage : personnages) {
            if (personnage.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return "Titre: " + titre + "\nAuteur: " + auteur + "\nAnnée de première parution: " + anneePremiereParution;
    }
}