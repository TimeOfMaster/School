public class Verkehrskontrolle
{
    private Queue<Fahrzeug> straße;
    private Queue<Fahrzeug> seite;

    private int anzMaengel;
    private int anzKontrolle;

    public Verkehrskontrolle(Fahrzeug pFahrzeug)
    {
        int iLaenge; // temporary

        for(int i = 0; i < iLaenge; i++)
        {
            
            this.straße.enqueue(pFahrzeug);
        }
        
        this.straße.enqueue(pFahrzeug);
    }    

    /*
     * "shift" first entry in straße to seite
     */
    public void herauswinken()
    {
        if(this.straße.front().getAuffaelligkeit() == true)
        {
            this.seite.enqueue(this.straße.front());
            this.straße.dequeue();
        }
        else
        {
            this.durchlassen();     // or this.straße.dequeue();  
        }
    }

    /*
     * maengel count
     */
    public void fahrzeugUeberpruefen()
    {
        // getData
        this.seite.front().getFarbe();
        this.seite.front().getKennzeichen();
        this.seite.front().getModell();
        this.seite.front().getVerkehrstauglichkeit();

        // Maengel count
        if(this.seite.front().getAuffaelligkeit() == true) 
        {
            this.anzMaengel ++;
        }
    }

    /*
     * kontrolle count
     * dequeue 
     */
    public void kontrolle()
    {
        // Kontrolle count; dequeue
        this.anzKontrolle ++;
        this.seite.dequeue();
    }

    /*
     * dequeue all
     */
    public void kolonneAufloesen()
    {
        /* // eigentlich auch benötigt
        // dequeue straße
        while(this.straße.front() != null)
        {
            this.straße.dequeue();
        }
        */

        // dequeue seite
        while(this.seite.front() != null)
        {
            this.seite.dequeue();
        }
    }

    /*
     * dequeue a single entry in straße
     */
    public void durchlassen()
    {
        this.straße.dequeue();
    }
}
