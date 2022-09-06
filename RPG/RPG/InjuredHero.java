public class InjuredHero
{
    private Hero patient;
    private InjuredHero next;

    private int x;
    private String xs;

    public InjuredHero(Object pHero)
    {
        patient = new Hero(x, x, xs, x);
        next = new InjuredHero(pHero);
    }
}