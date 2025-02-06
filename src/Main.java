public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("pet1", 3, 'M');
        Pet pet2 = new Pet("pet2", 5, 'F');
        Pet pet3 = new Pet("pet3", 2, 'M');

        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);
        System.out.println(Pet.getNumPets());
    }
}
