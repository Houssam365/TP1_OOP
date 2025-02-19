class Personnage {
    String nom;
    String description;

    // Constructeur
    public Personnage(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }   

    public String toString(){
        return "Nom: " + nom + "\nDescription: " + description;
    }
    
}
