public class Hero extends Figure
{
    private String name;
    private int strenght;
    private int invLength;
    private int sort;
    private int bonus;
    private int magic;

    private Weapon Inventar[];

    // private Weapon myWeapon;

    Hero(int pAttackValue, int pHitpoints, String pName, int pStrenght)
    {
        super(pAttackValue, pHitpoints);
        name = pName;
        strenght = pStrenght;

        invLength = 9;  //Inventar Length
        
        Inventar[0] = new Weapon("wood", 1, 0);
        Inventar[1] = new Weapon("livingwood", 2, 30);
        Inventar[2] = new Weapon("stone", 3, 0); 
        Inventar[3] = new Weapon("diamond", 6, 0);
        Inventar[4] = new Weapon("gold", 0, 0);
        Inventar[5] = new Weapon("netherite", 8, 5);
        Inventar[6] = new Weapon("gaiawood", 6, 50);
        Inventar[7] = new Weapon("manasteel", 8,30);
        Inventar[8] = new Weapon("elementium", 15, 50);
        Inventar[9] = new Weapon("terrasteel", 10, 30);

        /* ----------------------------------
        Inventar = new Weapon[invLength];
        for (int i = 0; i < invLength ; i++)
        {
            
        }
        */

        /* ---------------------------------------------------
         * String material = "steel";
         * int bonus = 3;
         * int magic = 42;
         * this.myWeapon = new Weapon(material, bonus, magic);
         */
    }

    public int sortBonus()
    {
        sort = 0;

        for (int i = 0; i < invLength; i++)
        {
            bonus = Inventar[i].getBonus();

            if(sort < bonus)
            {
                sort = bonus;
            }
        }

        return sort;
    }

    public int sortMagic()
    {
        sort = 0;

        for (int i = 0; i < invLength; i++)
        {
            magic = Inventar[i].getMagic();

            if(sort < magic)
            {
                sort = magic;
            }
        }

        return sort;
    }
    
    private void fight()
    {
        
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getStrenght()
     {
        return strenght;
    }

    public void setStrenght(int strenght) 
    {
        this.strenght = strenght;
    }
}