package RPG;

public class Archer extends Personnage {
    //Création de l'archer
	Archer(){
        setAtkBase("Tir a l'Arc");
        setAtkSpe("Concentration");
        setCri("Woohoo");
        setClasse("Archer");
    }

    // attaque basic 
    @Override
    public void attaqueBasic(Personnage adversaire){
        int atk = this.getAgi();
        System.out.println("Joueur "+this.getJoueur()+" utilise "+this.getAtkBase()+" et inflige "+atk+" dommages");
        adversaire.setVit(adversaire.getVit()-atk);
        System.out.println("Joueur "+adversaire.getJoueur()+" perd "+ atk +" points de vie");
        if(adversaire.getVit() <= 0){
            System.out.println("Joueur "+adversaire.getJoueur()+" est mort");
            System.out.println("Joueur "+adversaire.getJoueur()+" a perdu !");
        }
    }

    // attaque spécial
    @Override
    public void attaqueSpecial(Personnage adversaire){
        int augmente = this.getNiveau()/2;
        this.setAgi(this.getAgi()+augmente);
        System.out.println("Joueur "+this.getJoueur()+" utilise "+getAtkSpe()+" et gagne "+this.getAgi()+ " en agilité");
    }
}
