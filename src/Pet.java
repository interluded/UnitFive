
public abstract class Pet
{

    private String name;
    private int age;
    private char gender;


    private static int numPets = 0;


    public Pet(String n, int a, char g)
    {
        name = n;
        age = a;
        gender = g;
        numPets++;
    }

    public Pet()
    {
        name = "unknown";
        age = 0;
        gender = 'F';
        numPets++;
    }

    public String getName(){return name;}
    public int getAge(){return age;}
    public char getGender(){return gender;}

    public static int getNumPets(){return numPets;}

    public void setName(String n    ){name = n;}
    public void setAge(int a){age = a;}
    public void setGender(char g){gender = g;}

    public abstract void speak();

    // toString
    public String toString()
    {
        return "Name:   " + name + "\n" +
                "Age:    " + age  + "\n" +
                "Gender: " + gender + "\n";
    }
}
