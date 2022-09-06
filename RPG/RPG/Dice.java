import java.util.Random;
public class Dice
{
    private int faces;

    public Dice(int pFaces)
    {
        faces = pFaces;
    }

    private int roll(int faces)
    {
        int diceFace = (int)(Math.random() * faces + 1);
        return diceFace;
    }
}