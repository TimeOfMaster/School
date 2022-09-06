public class Knight extends Hero
{
    private int endurance;

    public Knight(int pEndurance, int pAttackValue, String pName, int pStrenght, int pHitpoints)
    {
        super(pAttackValue, pHitpoints, pName, pStrenght);
        endurance = pEndurance;
    }

    private int attackValueGen() 
    {
        int attack = 0;
        
        return attack;
    }

    public int getEndurance() 
    {
        return endurance;
    }

    public void setEndurance(int endurance)
     {
        this.endurance = endurance;
    }
}