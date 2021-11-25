package RPG;

import java.util.Scanner;

// combat entre 2 personnages
public class Fight {
    private Personnage p1;
    private Personnage p2;
    private boolean tester = false;

    
    Fight(Personnage p1, Personnage p2){
        this.p1 = p1;
        this.p2 = p2;
    }

   
    public void commenceCombat() {
        while (!this.tester) {
            System.out.println("Joueur "+ p1.getJoueur() +" ("+p1.getVit()+
            		" Vitalité)veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");
            try {
                Scanner sc = new Scanner(System.in);
                int attaqueP1 = sc.nextInt();

                if (attaqueP1 < 1 || attaqueP1 > 2) {
                    System.out.println("Cette attaque n'existe pas");
                } else if (attaqueP1 == 1) {
                        p1.attaqueBasic(p2);
                        SwapJoueur();
                } else {
                        p1.attaqueSpecial(p2);
                        SwapJoueur();
                }
            } catch (Exception e) {
                System.out.println("Caractere invalide");
            }
        }
    }

    //changement du personnage
    private void SwapJoueur(){
        if (p2.getVit() <= 0 || p1.getVit() <= 0){
            this.tester = true;
        }
        else {
            Personnage fake;
            fake =  this.p1;
            this.p1 = this.p2;
            this.p2 = fake;
        }
    }
}