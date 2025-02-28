public class Pet {
    private String name;
    private int age;
    private char gender;
    private static int numPets = 0;

    public Pet() {
        this.name = "Unknown";
        this.age = 0;
        this.gender = 'X';
        numPets++;
    }

    public Pet(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        numPets++;
    }

    // Accessor methods (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public static int getNumPets(){return numPets;}
    // Mutator methods (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // toString method to provide a string representation of the Pet object
    public String toString() {
        return "Pet[name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
}
