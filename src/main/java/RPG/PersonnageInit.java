package RPG;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * lance un perso et ses capacitées
 */
public class PersonnageInit {
    Personnage newPerso;
    /**
    *permet de choisir son perso
    */
    public void choisirClasse(int nombreJoueur){
        System.out.println("Création du personnage du Joueur" + nombreJoueur);
        System.out.println("Veuillez choisir la classe de votre personnage ( 1 : Chevalier, 2 : Archer, 3 : Mage)");
        Scanner sc = new Scanner(System.in);
        try{
            int val = sc.nextInt();
            if (val == 1){
                newPerso = new Knight();
            } else if (val == 3){
                newPerso = new Mage();
            } else if (val == 2){
                newPerso = new Archer();
            } else{
                System.out.println("Valeur incorrecte ");
                choisirClasse(nombreJoueur);
            }
        }
        catch(InputMismatchException e){
            System.out.println("Veuillez n'entrer que des chiffres. ");
            choisirClasse(nombreJoueur);
        }
    }

    /**
     *choisir les capacités du perso
     */
    public void selectStats() {
        Scanner sc = new Scanner(System.in);
        boolean tester = false;
        while (!tester) {
            int stats;
            try {
                System.out.println("Niveau du personnage ?");
                stats = sc.nextInt();
                newPerso.setNiveau(stats);
                System.out.println("Force du personnage ?");
                stats = sc.nextInt();
                newPerso.setForce(stats);
                System.out.println("Agilité du personnage ?");
                stats = sc.nextInt();
                newPerso.setAgi(stats);
                System.out.println("Intelligence du personnage ?");
                stats = sc.nextInt();
                newPerso.setIntelligence(stats);
                newPerso.setVit(5 * newPerso.getNiveau());
            } catch (InputMismatchException e) {
                System.out.println("Vous pouvez seulement entrer des nombres !");
                selectStats();
            }
            if (newPerso.getNiveau() <= 100 && newPerso.getNiveau() >= 1 && newPerso.getNiveau() == newPerso.getForce() + newPerso.getAgi() + newPerso.getIntelligence()) {
                tester = true;
            } else{
                System.out.println("La somme de vos statistiques doit etre egale a votre niveau de personnage et un personnage ne peut pas avoir un niveau inferieur a 1 ou superieur a 100!");
            }
        }
    }

    /**
     *Appelle les méthodes choisirClasse et selectStats afin de créer de toutes pièces un nouveau personnage
     */
    public Personnage initPersonnage(int nombreJoueur){
        this.choisirClasse(nombreJoueur);
        this.selectStats();
        return newPerso;
    }
}
