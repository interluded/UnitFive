import java.util.ArrayList;

public class VetClinic
{
    // Instance Variables
    private String name;
    private String manager;
    private ArrayList<Pet> animals;

    // Constructor
    public VetClinic(String n, String m, ArrayList<Pet> list)
    {
        name = n;
        manager = m;
        animals = list;
    }

    // Accessors
    public String getName(){return name;}
    public String getManager(){return manager;}
    public ArrayList<Pet> getAnimals(){return animals;}

    // Mutators
    public void setName(String n){name = n;}
    public void setManager(String m){manager = m;}
    public void setAnimals(ArrayList<Pet> list){animals = list;}

    // toString
    public String toString()
    {
        return "Name: " + name + "\n" +
                "Manager: " + manager + "\n" +
                "Animals: " + animals + "\n";
    }
}
