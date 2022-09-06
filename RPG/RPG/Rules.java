public class Rules
{
    private int faces;

    private Dice dice;

    private Rules(int pFaces)
    {
        faces = pFaces;
        this.dice = new Dice(faces);
    }
}