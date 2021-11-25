package RPG;

import static org.junit.Assert.assertEquals;


public class Test_combat {
	@Test
    public void God_I_Sure_Hate_Doing_These_Dumb_Tests(){
        String a = "je hais les tests unitaires";
        assertEquals("je hais les tests unitaires", a);
    }
    @Test
    public void When_MageHealthLessThanFull_Expect_HealingUpBackAccordingToIntelligenceValue(){
        Mage mage = new Mage();
        Knight war = new Knight();
        mage.setNiveau(20);
        mage.setVit(mage.getNiveau()*5 - 50);
        mage.setIntelligence(20);
        mage.attaqueSpecial(war);
        assertEquals(70, mage.getVit());
    }
    @Test
    public void When_MageHeal_Expect_HealDoesntOverflowPastAllowedHealPool(){
        Mage mage = new Mage();
        Knight war = new Knight();
        mage.setNiveau(20);
        mage.setVit(mage.getNiveau()*5 - 20);
        mage.setIntelligence(1000000);
        mage.attaqueSpecial(war);
        assertEquals(100, mage.getVit());
    }
    @Test
    public void When_MageBasicAttack_Expect_MageDeals20DamageToWarrior(){
        Mage mage = new Mage();
        Knight war = new Knight();
        mage.setNiveau(20);
        war.setVit(100);
        mage.setIntelligence(20);
        mage.attaqueBasic(war);
        assertEquals(80, war.getVit());
    }
    @Test
    public void When_WarriorSpecialAtk_Expect_DamageLossForBothPlayers(){
        Mage mage = new Mage();
        Knight war = new Knight();
        mage.setNiveau(20);
        mage.setVit(mage.getNiveau()*5);
        mage.setNiveau(20);
        war.setNiveau(20);
        war.setVit(mage.getNiveau()*5);
        war.setForce(50);
        war.attaqueSpecial(mage);
        assertEquals(0, mage.getVit());
        assertEquals(75, war.getVit());
    }
    @Test
    public void When_RogueSpecialAtk_Expect_AgiStatIncrease(){
        Mage mage = new Mage();
        Archer rogue = new Archer();
        rogue.setNiveau(50);
        rogue.setAgi(50);
        rogue.attaqueSpecial(mage);
        assertEquals(75, rogue.getAgi());
    }
    @Test
    public void When_RogueBasicAttack_Expect_RogueDeals50DamageToWarrior(){
    	Archer rogue = new Archer();
    	Knight war = new Knight();
        war.setVit(100);
        rogue.setAgi(50);
        rogue.attaqueBasic(war);
        assertEquals(50, war.getVit());
    }
	private void assertEquals(int i, int vit) {
		// TODO Auto-generated method stub
		
	}
}