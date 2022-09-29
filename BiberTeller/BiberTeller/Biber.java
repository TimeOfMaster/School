import java.util.Random;

public class Biber {
    private boolean big;

    public Biber() {
        this.random();
    }

    public void random() {
        Random random = new Random();
/*
        if (random.nextInt(1) == 0)
        {
            this.big = false;
        }
        else
        {
            this.big = true;
        }
    }*/

        this.big = random.nextBoolean();
    }

    public boolean getBig() {
        return this.big;
    }

    public void setBig(boolean big) {
        this.big = big;
    }
}
