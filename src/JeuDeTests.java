public class JeuDeTests {
    public static void main(String[] args) {
        // Création d'un livre
        Livre livre = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943);
        
        // Affichage des informations du livre
        System.out.println(livre.toString());
        
        // Modification des attributs du livre
        livre.setTitre("Le Petit Prince (Edition Révisée)");
        livre.setAuteur("A. de Saint-Exupéry");
        livre.setAnneePremiereParution(1945);
        
        // Affichage des informations modifiées du livre
        System.out.println(livre.toString());
        
        // Création d'un personnage
        Personnage personnage = new Personnage("Le Petit Prince", "Un jeune prince venu d'une autre planète");
        
        // Affichage des informations du personnage
        System.out.println(personnage.toString());
        
        // Modification des attributs du personnage
        personnage.setNom("Le Prince");
        personnage.setDescription("Un prince venu d'une autre planète");
        
        // Affichage des informations modifiées du personnage
        System.out.println(personnage.toString());
        
        // Ajout du personnage au livre
        livre.ajouterPersonnage(personnage);
        
        // Vérification si le livre contient le personnage
        System.out.println("Le livre contient-il le personnage 'Le Prince' ? " + livre.contientPersonnage("Le Prince"));
        
        // Affichage des personnages du livre
        livre.affichePersonnages();
    }
}
