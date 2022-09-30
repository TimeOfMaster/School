import java.util.Random;
import java.util.Scanner;

public class Restaurant {
    private Queue<Biber> biberWarteschlange;
    private Stack<Teller> tellerStapel;

    private int anzahlBiber;

    public Restaurant() {
        this.biberWarteschlange = new Queue<Biber>();
        this.tellerStapel = new Stack<Teller>();

        this.oeffneRestaurant();
        this.bereiteTellerstapelVor();
        this.ueberpruefen();
        reset();
    }

    public void reset() {
        Scanner reader = new Scanner(System.in);    //reading from system.in
        System.out.println("Do you want to reset (y/n)");
        String str = reader.next();
        reader.close();     //close once finished

        if (str.equalsIgnoreCase("y")) 
        {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("Resetting...");
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            oeffneRestaurant();
            bereiteTellerstapelVor();
            ueberpruefen();
            reset();
        }
        else if (str.equalsIgnoreCase("n"))
        {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("Stopping");
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        else
        {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("invalid Input");
            System.out.println("Defaulting to Stopping");
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
    
    public void oeffneRestaurant() {
        this.anzahlBiber = 0;

        // empty biberWarteschlange / empty tellerStapel
        while (!this.biberWarteschlange.isEmpty()) {
            this.biberWarteschlange.dequeue();
        }
        
        while (!this.tellerStapel.isEmpty()) {
            this.tellerStapel.pop();
        }

        // gen new biberWarteschlange
        Random random = new Random();
        this.anzahlBiber = random.nextInt(20);

        for (int i = 0; i < this.anzahlBiber; i++) {
            Biber b = new Biber();

            this.biberWarteschlange.enqueue(b);
        }
    }

    public void bereiteTellerstapelVor() {
        boolean[] biberGroessen = new boolean[this.anzahlBiber];
        for (int i = 0; i < this.anzahlBiber; i++) {
            boolean istDerBiberGross = this.biberWarteschlange.front().getBig();
            this.biberWarteschlange.enqueue(this.biberWarteschlange.front());
            this.biberWarteschlange.dequeue();
            biberGroessen[i] = istDerBiberGross;
        }

        for (int i = this.anzahlBiber - 1; i >= 0; i--) {
            Teller pTeller = new Teller(biberGroessen[i]);
            this.tellerStapel.push(pTeller);
        }

    }

    public void ueberpruefen() {
        System.out.println("Anzahl an Bibern:" + "" + anzahlBiber);

        int wrongCounter = 0;

        while (!this.biberWarteschlange.isEmpty()) {
            
            if (this.biberWarteschlange.front().getBig() == this.tellerStapel.top().getBig())            
            {}
            else
            {
                wrongCounter++;
            }
            
            //System.out.println(this.biberWarteschlange.front().getBig());

            this.biberWarteschlange.dequeue();
            this.tellerStapel.pop();
        }

        if (wrongCounter > 0)
        {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("Teller passen nicht zu den Bibern");
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}
