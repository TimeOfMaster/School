public class Weatherstation
{
    private int[] weather;

    public Weatherstation()
    {
        this.weather = new int[14];

        initializeWeather();
    }

    public void initializeWeather()
    {
        int i = 0;

        this.weather[i] = 12;
        i ++;    
        
        // brauch man theorethisch nicht
        this.weather[i] = 14;
        i ++;    
        
        this.weather[i] = 9;
        i ++;    
        
        this.weather[i] = 12;
        i ++;    
        
        this.weather[i] = 15;
        i ++;    
        
        this.weather[i] = 16;
        i ++;    
        
        this.weather[i] = 15;
        i ++;    
        
        this.weather[i] = 15;
        i ++;    
        
        this.weather[i] = 11;
        i ++;    
        
        this.weather[i] = 8;
        i ++;    
        
        this.weather[i] = 13;
        i ++;    
        
        this.weather[i] = 13;
        i ++;    
        
        this.weather[i] = 15;
        i ++;    
        //

        this.weather[i] = 12;
        i ++;    
    }

    public double average()
    {
        double average = 0;
        int length = weather.length;

        for (int i = 0; i < length; i++)
        {
            average += weather[i];
        }

        average = average / length;

        return average;
    }

    public int max()
    {
        int max = 0;
        int length = weather.length;

        for (int i = 0; i < length; i++)
        {
            if (weather[i] > max)
            {
                max = weather[i];
            }
        }

        return max;
    }

    public int min()
    {
        int min = 0;
        int length = weather.length;

        for (int i = 0; i < length; i++)
        {
            if (weather[i] < min)
            {
                min = weather[i];
            }
        }

        return min;
    }
}