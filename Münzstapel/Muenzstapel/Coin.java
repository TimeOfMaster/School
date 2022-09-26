import java.util.Random;

public class Coin
{
    private int worth;
    private String coinType;

    public Coin()
    {
        random();
    }

    public int getWorth() {
        return worth;
    }

    public void setWorth(int worth) 
    {
        this.worth = worth;
    }

    public String getWorthString() 
    {
        return coinType;
    }

    public void setWorthString(String coinType) 
    {
        this.coinType = coinType;
    }

    public void random()
    {
        int[] worthR = {10, 20, 50, 100, 200};

        Random randomWorthR = new Random();
        int indexWorthR = randomWorthR.nextInt(worthR.length);

        this.worth = worthR[indexWorthR];

        if (worth == 10)
        {
            coinType = "10Cent";
        }
        else if (worth == 20)
        {
            coinType = "20Cent";
        }
        else if (worth == 50)
        {
            coinType = "50Cent";
        }
        else if (worth == 100)
        {
            coinType = "1€";
        }
        else if (worth == 200)
        {
            coinType = "2€";
        }
    }
}