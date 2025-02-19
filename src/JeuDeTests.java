public class JeuDeTests {
    public static void main(String[] args) {
        // Création d'un livre
        Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943);
        Livre livre2 = new Livre("1984", "George Orwell", 1949);
        
        // Affichage des informations des livres
        System.out.println(livre1.toString());
        System.out.println(livre2.toString());
        
        // Modification des attributs du livre
        livre1.setTitre("Le Petit Prince (Edition Révisée)");
        livre1.setAuteur("A. de Saint-Exupéry");
        livre1.setAnneePremiereParution(1945);
        
        // Affichage des informations modifiées du livre
        System.out.println(livre1.toString());
        
        // Création de personnages
        Personnage personnage1 = new Personnage("Le Petit Prince", "Un jeune prince venu d'une autre planète");
        Personnage personnage2 = new Personnage("Le Renard", "Un renard sage qui apprend au Petit Prince des leçons de vie");
        
        // Affichage des informations des personnages
        System.out.println(personnage1.toString());
        System.out.println(personnage2.toString());
        
        // Modification des attributs des personnages
        personnage1.setNom("Le Prince");
        personnage1.setDescription("Un prince venu d'une autre planète");
        
        personnage2.setNom("Renard");
        personnage2.setDescription("Un renard sage");
        
        // Affichage des informations modifiées des personnages
        System.out.println(personnage1.toString());
        System.out.println(personnage2.toString());
        System.out.println("Personnages ajoutés au livre");
        
        // Ajout des personnages au livre
        livre1.ajouterPersonnage(personnage1);
        livre1.ajouterPersonnage(personnage2);
        
        // Vérification si le livre contient les personnages
        System.out.println("Le livre contient-il le personnage 'Le Prince' ? " + livre1.contientPersonnage("Le Prince"));
        System.out.println("Le livre contient-il le personnage 'Renard' ? " + livre1.contientPersonnage("Renard"));
        
        // Affichage des personnages du livre
        livre1.affichePersonnages();
        
        // Création d'une bibliothèque
        Bibliotheque bibliotheque = new Bibliotheque("Bibliothèque Municipale");
        
        // Ajout des livres à la bibliothèque
        bibliotheque.ajouterLivre(livre1);
        bibliotheque.ajouterLivre(livre2);
        
        // Vérification si la bibliothèque contient un livre
        System.out.println("La bibliothèque contient-elle le livre 'Le Petit Prince' ? " + bibliotheque.contientLivre("Le Petit Prince"));
        System.out.println("La bibliothèque contient-elle le livre '1984' ? " + bibliotheque.contientLivre("1984"));
        
        // Affichage des livres d'un certain auteur
        System.out.println("Livres de l'auteur 'A. de Saint-Exupéry' :");
        bibliotheque.afficherLivresParAuteur("A. de Saint-Exupéry");
        
        System.out.println("Livres de l'auteur 'George Orwell' :");
        bibliotheque.afficherLivresParAuteur("George Orwell");
        
        // Affichage de tous les livres de la bibliothèque
        System.out.println("Tous les livres de la bibliothèque :");
        bibliotheque.afficherTousLesLivres();
    }
}
