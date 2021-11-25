package RPG;

public class Main {
    // les caractéristiques des personnages
    private static void description(Personnage p){
        System.out.println(p.getCri()+" je suis le "+p.getClasse() + " Joueur " + p.getJoueur() + " niveau " + p.getNiveau() + " je possède " + p.getVit() + " de vitalité, " + p.getForce() +" de force, "+ p.getAgi()+" d'agilité et "+p.getIntelligence()+" d'intelligence !");
    }
    /**
     * Lancement d'un combat entre 2 perso
     */
    public static void main(String[] args) {
        PersonnageInit n = new PersonnageInit();
        Personnage p1 = n.initPersonnage(1);
        p1.setJoueur(1);
        description(p1);
        PersonnageInit m = new PersonnageInit();
        Personnage p2 = m.initPersonnage(2);
        p2.setJoueur(2);
        description(p2);

        Fight combat = new Fight(p1,p2);
        combat.commenceCombat();
    }
}
