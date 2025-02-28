public class Dalmatian extends Dog
{
    private int numSpots;

    public Dalmatian(String n, int a, char g, int aggr, int numS)
    {
        super(n, a, g, aggr);
        numSpots = numS;
    }

    public Dalmatian()
    {
        super();
        numSpots = 0;
    }

    public int getNumSpots()
    {
        return numSpots;
    }

    public void setNumSpots(int numS)
    {
        numSpots = numS;
    }


    public String toString()
    {
        return super.toString() + "\nNum Spots: " + numSpots;
    }
}
