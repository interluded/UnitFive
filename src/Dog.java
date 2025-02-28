public class Dog extends Pet
{
    private int aggression;

    public Dog(String n, int a, char g, int aggr)
    {
        super(n, a, g);
        aggression = aggr;
    }

    public int getAggression(){return aggression;}

    public void setAggression(int a){aggression = a;}

    public void speak()
    {
        System.out.println("Woof!");
    }

    public String toString()
    {
        return super.toString() + "Aggression: " + aggression + "\n";
    }
}

