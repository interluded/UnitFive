public class Cat extends Pet
{
    private int numWhiskers;

    public Cat(String n, int a, char g, int nw)
    {
        super(n, a, g);
        numWhiskers = nw;
    }

    public int getNumWhiskers(){return numWhiskers;}

    public void setNumWhiskers(int nw){numWhiskers = nw;}

    public String toString()
    {
        return super.toString() + "Num Whiskers: " + numWhiskers + "\n";
    }
}
