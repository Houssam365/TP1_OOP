import java.util.ArrayList;
import java.util.List;

class Personnage {
    String nom;
    String description;
    ArrayList<String> pouvoirsMagiques;

    // Constructeur
    public Personnage(String nom, String description) {
        this.nom = nom;
        this.description = description;
        this.pouvoirsMagiques = new ArrayList<>();
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getPouvoirsMagiques() {
        return pouvoirsMagiques;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void ajouterPouvoirMagique(String pouvoir) {
        pouvoirsMagiques.add(pouvoir);
    }

    public boolean aPouvoirMagique(String pouvoir) {
        return pouvoirsMagiques.contains(pouvoir);
    }

    
    public String toString() {
        return "Nom: " + nom + "\nDescription: " + description + "\nPouvoirs magiques: " + String.join(", ", pouvoirsMagiques);
    }
}
