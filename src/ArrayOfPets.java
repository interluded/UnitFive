public class ArrayOfPets {
    public static void main(String[] args) {
        Pet[] pets = new Pet[20];
        double totalAge = 0;

        for (int i = 0; i < pets.length; i++) {
            String name = "pet" + (i + 1);
            int age = (int) (Math.random() * 16);
            char gender = (Math.random() > 0.5) ? 'M' : 'F';
            pets[i] = new Pet(name, age, gender);
            totalAge += age;
        }

        for (Pet pet : pets) {
            System.out.println(pet);
        }

        double averageAge = totalAge / pets.length;
        System.out.println("Average age of the pets: " + averageAge);


    }
}
