import java.util.Random;

public class Fahrzeug
{
    private boolean verkehrstauglichkeit;
    private String modell;
    private String farbe;
    private String kennzeichen;
    private boolean auffaelligkeit;

    public Fahrzeug(/* boolean bVerkehrstauglichkeit, String sModell, String sFarbe, String sKennzeichen, boolean bAuffaelligkeit */) // kommentare entkommentieren und ranom() kommentieren um Modus auf manuell zu schalten
    {
        /*
        verkehrstauglichkeit = bVerkehrstauglichkeit;
        modell = sModell;
        farbe = sFarbe;
        kennzeichen = sKennzeichen;
        auffaelligkeit = bAuffaelligkeit;
        */
    }

    public boolean getVerkehrstauglichkeit() 
    { 
        return verkehrstauglichkeit;
    }

    public String getFarbe() 
    { 
        return farbe; 
    }

    public String getKennzeichen() 
    {
        return kennzeichen;
    }

    public String getModell() 
    {
        return modell;
    }

    public boolean getAuffaelligkeit()
    {
        return auffaelligkeit;
    }

    public void setVerkehrstauglichkeit(boolean verkehrstauglichkeit) 
    {
        this.verkehrstauglichkeit = verkehrstauglichkeit;
    }

    public void setModell(String modell) 
    {
        this.modell = modell;
    }

    public void setFarbe(String farbe) 
    {
        this.farbe = farbe;
    }

    public void setKennzeichen(String kennzeichen) 
    {
        this.kennzeichen = kennzeichen;
    }

    public void setAuffaelligkeit(boolean auffaelligkeit) 
    {
        this.auffaelligkeit = auffaelligkeit;
    }

    public void random()
    {
        String[] modell = {"BMW 1er", "BMW 2er", "BMW 3er", "BMW 4er", "BMW 5er", "BMW 6er", "BMW 7er", "BMW 8er", "BMW i3", "BMW i4", "BMW iX",
                           "SEAT Alhambra", "SEAT Arona", "SEAT Ateca", "SEAT Ibiza", "SEAT Leon", "SEAT Tarraco",
                           "SKODA Fabia", "SKODA Octavia", "SKODA Superb",
                           "VW Bus", "VW Golf", "VW ID.3", "VW ID.4", "VW Passat", "VW Polo"};
        String[] farbe = {"rot", "gruen", "blau", "gelb", "magenta", "schwarz", "grau", "weiß"}; // RGB CMYK GW
        String[] kennzeichen = {"PB1234", "PB2234", "PB1334", "PB1244", "PB1235"};

        //------------------------------------------------------------------------------------------------------------------------------------
        // Random modell
        Random randomModell = new Random();
        int indexModell = randomModell.nextInt(modell.length);

        this.modell = modell[indexModell];

        //------------------------------------------------------------------------------------------------------------------------------------
        // Random farbe
        Random randomFarbe = new Random();
        int indexFarbe = randomFarbe.nextInt(farbe.length);

        this.farbe = farbe[indexFarbe];

        //------------------------------------------------------------------------------------------------------------------------------------
        // Random kennzeichen
        Random randomKennzeichen = new Random();
        int indexKennzeichen = randomKennzeichen.nextInt(kennzeichen.length);

        this.kennzeichen = kennzeichen[indexKennzeichen];

        //------------------------------------------------------------------------------------------------------------------------------------
        // Random verkehrstauglichkeit 

        Random randomVerkehrstauglichkeit = new Random();
        int trueFalseVerkehrstauglichkeit = randomVerkehrstauglichkeit.nextInt(1);
        if(trueFalseVerkehrstauglichkeit == 1)
        {
            this.verkehrstauglichkeit = true;
        }
        else if(trueFalseVerkehrstauglichkeit == 0);
        {
            this.verkehrstauglichkeit = false;
        }

        //------------------------------------------------------------------------------------------------------------------------------------
        // Random auffaelligkeit 

        Random randomAuffaelligkeit = new Random();
        int trueFalseAuffaelligkeit = randomAuffaelligkeit.nextInt(1);
        if(trueFalseAuffaelligkeit == 1)
        {
            this.auffaelligkeit = true;
        }
        else if(trueFalseAuffaelligkeit == 0);
        {
            this.auffaelligkeit = false;
        }
    }
}