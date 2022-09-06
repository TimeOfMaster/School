public class Figure
{
    private int hitpoints;
    private int attackValue;

    public Figure(int pAttackValue, int pHitpoints)
    {
        hitpoints = pHitpoints;
        attackValue = pAttackValue;
    }
    public int getHitpoints()
    {
        return hitpoints;
    }
    public int getAttackValue()
    {
        return attackValue;
    }


}