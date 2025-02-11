import java.util.ArrayList;

public class ArrayListOfPets {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();

        // Populate the list with 20 Pet objects
        for (int i = 0; i < 20; i++) {
            String name = "Pet" + (i + 1);
            int age = (int) (Math.random() * 16); // Random age between 0 and 15
            char gender = (Math.random() > 0.5) ? 'M' : 'F';
            pets.add(new Pet(name, age, gender));
        }

        // Print all pets
        for (Pet pet : pets) {
            System.out.println(pet);
        }

        // Print the total number of pets created
        System.out.println("Total number of pets: " + Pet.getNumPets());
        System.out.println(avgAge(pets));


    }
    public static double avgAge(ArrayList<Pet> list){
        double age = 0;
        for(Pet pet : list){
            age += pet.getAge();
        }
        return list.isEmpty() ? 0 : age / list.size();
    }
}
