package RPG;

public abstract class Personnage {
    private int joueur, niveau, vit, force, agi, intelligence;
    private String atkSpe, atkBase, cri, nomClasse;

    Personnage(){}

    /**
     *obtenir le numéro de joueur
     */
    public int getJoueur(){
        return joueur;
    }

    /**
     *défini le numéro du joueur
     */
    void setJoueur(int joueur){
        this.joueur = joueur;
    }

    /**
     *obtenir le niveau du joueur 
     */
    public int getNiveau(){
        return niveau;
    }


    void setNiveau(int niveau){
        this.niveau = niveau;
    }


    public int getVit(){
        return vit;
    }


    void setVit(int vit){
        this.vit = vit;
    }


    public int getForce(){
        return force;
    }


    void setForce(int force){
        this.force = force;
    }


    public int getAgi(){
        return agi;
    }


    void setAgi(int agi){
        this.agi = agi;
    }


    public int getIntelligence(){
        return intelligence;
    }


    void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }


    public String getAtkSpe(){
        return atkSpe;
    }


    void setAtkSpe(String atkSpe){
        this.atkSpe = atkSpe;
    }


    public String getAtkBase(){
        return atkBase;
    }

    void setAtkBase(String atkBase){
        this.atkBase = atkBase;
    }


    public String getCri(){
        return cri;
    }


    void setClasse(String classe){
        this.nomClasse = classe;
    }


    public String getClasse(){
        return nomClasse;
    }


    void setCri(String cri){
        this.cri = cri;
    }

    /**
     *Permet au personnage d'utiliser son attaque de base contre son adversaire
     */
    public abstract void attaqueBasic(Personnage adversaire);

    /**
     *Permet au personnage d'utiliser son attaque spécial contre son adversaire
     */
    public abstract void attaqueSpecial(Personnage adversaire);
}
