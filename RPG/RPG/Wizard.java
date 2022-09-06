public class Wizard extends Hero
{
    private int magicpower;

    public Wizard(int pMagicpower, String pName, int pStrenght, int pAttackValue, int pHitpoints)
    {
        super(pAttackValue, pHitpoints, pName, pStrenght);
        this.magicpower = pMagicpower;
    }

    private int attackValueGen() 
    {
        int attack = 0;
        
        return attack;
    }
    
    private int heal() 
    {
        int hitpoints =+ 10;
        return hitpoints;
    }

    public int getMagicpower()
     {
        return magicpower;
    }

    public void setMagicpower(int magicpower) 
    {
        this.magicpower = magicpower;
    }
}