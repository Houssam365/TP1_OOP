class Livre {
    String titre;
    String auteur;
    int anneePremiereParution;

    // Constructeur
    public Livre(String titre, String auteur, int anneePremiereParution) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePremiereParution = anneePremiereParution;
    }

    public void affichePersonnages(){
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("Année de première parution: " + anneePremiereParution);
    }

    public void ajouterPersonnage(Personnage unPersonnage){
        
    }

    public boolean contientPersonnage(String nom){
        return true;
    }

    public String toString(){
        return "Titre: " + titre + "\nAuteur: " + auteur + "\nAnnée de première parution: " + anneePremiereParution;
    }
}