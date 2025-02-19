class Personnage {
    String nom;
    String description;

    
    public Personnage(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }   

    
    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return "Nom: " + nom + "\nDescription: " + description;
    }

}
