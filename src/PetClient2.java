public class PetClient2
{
    public static void main(String[] args)
    {
        Pet[] pets = new Pet[5];
        pets[0] = new Cat("Abe", 5, 'M', 3);
        pets[1] = new Cat("Kitty", 7, 'F', 8);
        pets[2] = new Dog("Ralph", 10, 'M', 2);
        pets[3] = new Dog("Lassie", 15, 'F', 1);
        pets[4] = new Dog("Cujo", 17, 'M', 10);

        printArray(pets);

        allSpeak(pets);
    }

    public static void printArray(Pet[] arr)
    {
        for (Pet p : arr)
            System.out.println(p);

        System.out.println();
    }

    public static void allSpeak(Pet[] arr)
    {
        for (Pet p : arr)
            p.speak();
    }
}
