import java.util.Arrays;

public class JeuDeTests {
    public static void main(String[] args) {
        // Création des auteurs
        Auteur auteur1 = new Auteur("Saint-Exupéry", "Antoine", "Français");
        Auteur auteur2 = new Auteur("Orwell", "George", "Anglais");
        Auteur coAuteur = new Auteur("Co-Auteur", "Nom", "Français");

        // Création d'un livre avec plusieurs auteurs
        Livre livre1 = new Livre("Le Petit Prince", Arrays.asList(auteur1, coAuteur), 1943);
        Livre livre2 = new Livre("1984", Arrays.asList(auteur2), 1949);
        
        // Affichage des informations des livres
        System.out.println(livre1.toString());
        System.out.println(livre2.toString());
        
        // Modification des attributs du livre
        livre1.setTitre("Le Petit Prince (Edition Révisée)");
        livre1.setAuteurs(Arrays.asList(auteur1, coAuteur));
        livre1.setAnneePremiereParution(1945);
        
        // Affichage des informations modifiées du livre
        System.out.println(livre1.toString());
        
        // Création de personnages
        Personnage personnage1 = new Personnage("Le Petit Prince", "Un jeune prince venu d'une autre planète");
        Personnage personnage2 = new Personnage("Le Renard", "Un renard sage qui apprend au Petit Prince des leçons de vie");
        
        // Ajout de pouvoirs magiques aux personnages
        personnage1.ajouterPouvoirMagique("Invisibilité");
        personnage1.ajouterPouvoirMagique("Téléportation");
        
        personnage2.ajouterPouvoirMagique("Guérison");
        
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
        System.out.println("Livres de l'auteur 'Saint-Exupéry' :");
        bibliotheque.afficherLivresParAuteur("Saint-Exupéry");
        
        System.out.println("Livres de l'auteur 'Orwell' :");
        bibliotheque.afficherLivresParAuteur("Orwell");
        
        // Affichage de tous les livres de la bibliothèque
        System.out.println("Tous les livres de la bibliothèque :");
        bibliotheque.afficherTousLesLivres();
        
        // Vérification des pouvoirs magiques des personnages
        System.out.println("Le personnage 'Le Prince' a-t-il le pouvoir 'Invisibilité' ? " + personnage1.aPouvoirMagique("Invisibilité"));
        System.out.println("Le personnage 'Renard' a-t-il le pouvoir 'Téléportation' ? " + personnage2.aPouvoirMagique("Téléportation"));
    }
}
