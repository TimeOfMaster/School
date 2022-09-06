import java.util.concurrent.ThreadLocalRandom;

public class Weapon
{
    private String material;
    private int bonus;
    private int magic;

    private int min;
    private int max;

    Weapon(String pMaterial, int pBonus, int pMagic)
    {
        material = pMaterial;
        bonus = pBonus;
        magic = pMagic;
    }

    private int bonusGen() 
    {
        int gen = 0;
        min = 0;
        max = 20;

        gen = ThreadLocalRandom.current().nextInt(min, max + 1);

        return gen;
    }

    public String getMaterial() 
    {
        return material;
    }

    public int getBonus() 
    {
        return bonus;
    }

    public int getMagic() 
    {
        return magic;
    }

    public void setMaterial(String pm)
    {
        this.material = pm;
    }

    public void setBonus(int pb)
    {
        this.bonus = pb;
    }

    public void setMagic(int pm)
    {
        this.magic = pm;
    }
}