import java.util.Scanner;

public class Coinstack
{
    private Stack<Coin> coins;

    private Stack<Coin> tenCents;
    private Stack<Coin> twentyCents;
    private Stack<Coin> fiftyCents;
    private Stack<Coin> oneEuro;
    private Stack<Coin> twoEuro;

    private int tenCentsWorth = 0;
    private int twentyCentsWorth = 0;
    private int fiftyCentsWorth = 0;
    private int oneEuroWorth = 0;
    private int twoEuroWorth = 0;

    private int worth = 0;

    private int laenge = 20;

    public Coinstack()
    {
        this.coins = new Stack<Coin>();

        this.tenCents = new Stack<Coin>();
        this.twentyCents = new Stack<Coin>();
        this.fiftyCents = new Stack<Coin>();
        this.oneEuro = new Stack<Coin>();
        this.twoEuro = new Stack<Coin>();

        for (int i = 0; i < laenge; i++)
        {
            Coin pCoin = new Coin();
            this.coins.push(pCoin);
        }

        try 
        {
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) 
        {
            Thread.currentThread().interrupt();
        }

        sort();

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

    public void sort()
    {
        for(int i = 0; i < laenge; i++)
        {
            int temp = 0;
            temp = this.coins.top().getWorth();

            if (temp == 10)
            {
                this.tenCents.push(this.coins.top());
                this.tenCentsWorth += 10;
                this.coins.pop();
            }
            else if (temp == 20)
            {
                this.twentyCents.push(this.coins.top());
                this.twentyCentsWorth += 20;
                this.coins.pop();
            }
            else if (temp == 50)
            {
                this.fiftyCents.push(this.coins.top());
                this.fiftyCentsWorth += 50;
                this.coins.pop();
            }
            else if (temp == 100)
            {
                this.oneEuro.push(this.coins.top());
                this.oneEuroWorth += 100;
                this.coins.pop();
            }
            else if (temp == 200)
            {
                this.twoEuro.push(this.coins.top());
                this.twoEuroWorth += 200;
                this.coins.pop();
            }
        }
            //this.worth += (this.tenCentsWorth + this.twentyCentsWorth + this.fiftyCentsWorth + this.oneEuroWorth + this.twoEuroWorth + this.twoEuroWorth);
            this.worth += this.tenCentsWorth;
            this.worth += this.twentyCentsWorth;
            this.worth += this.fiftyCentsWorth;
            this.worth += this.oneEuroWorth;
            this.worth += this.twoEuroWorth;
        
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("Total Worth:" + this.worth);
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("Ten Cents Worth:" + this.tenCentsWorth);
            System.out.println("");
            System.out.println("Twenty Cents Worth:" + this.twentyCentsWorth);
            System.out.println("");
            System.out.println("Fifty Cents Worth:" + this.fiftyCentsWorth);
            System.out.println("");
            System.out.println("One Euro Worth:" + this.oneEuroWorth);
            System.out.println("");
            System.out.println("Two Euro Worth:" + this.twoEuroWorth);
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public void reset()
    {
        while(this.tenCents.top() != null)
        {
            this.tenCents.pop();
        }
        while(this.twentyCents.top() != null)
        {
            this.twentyCents.pop();
        }
        while(this.fiftyCents.top() != null)
        {
            this.fiftyCents.pop();
        }
        while(this.oneEuro.top() != null)
        {
            this.oneEuro.pop();
        }
        while(this.twoEuro.top() != null)
        {
            this.twoEuro.pop();
        }
        
        while(this.coins.top() != null)
        {
            this.coins.pop();
        }

        this.tenCentsWorth = 0;
        this.twentyCentsWorth = 0;
        this.fiftyCentsWorth = 0;
        this.oneEuroWorth = 0;
        this.twoEuroWorth = 0;

        this.worth = 0;

        for (int i = 0; i < laenge; i++)
        {
            Coin pCoin = new Coin();
            this.coins.push(pCoin);
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Reset successfully");
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        sort();

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
            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}
