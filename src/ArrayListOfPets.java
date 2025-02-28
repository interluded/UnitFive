import java.util.ArrayList;

public class ArrayListOfPets {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            String name = "Pet" + (i + 1);
            int age = (int) (Math.random() * 16);
            char gender = (Math.random() > 0.5) ? 'M' : 'F';
            pets.add(new Pet(name, age, gender));
        }

        for (Pet pet : pets) {
            System.out.println(pet);
        }

        System.out.println("Total number of pets: " + Pet.getNumPets());
        System.out.println(avgAge(pets));


    }
    public static void swap(ArrayList<Pet> list, int x, int y)
    {
        Pet temp = list.get(x);
        list.set(x, list.get(y));
        list.set(y, temp);
    }


    public static void bubbleSort(ArrayList<Pet> list)
    {
        for (int i = 1; i < list.size(); i++)
        {
            for (int j = 0; j < list.size() - i; j++)
            {
                if (list.get(j).getAge() > list.get(j + 1).getAge())
                {
                    swap(list, j, j + 1);
                }
            }
        }
    }


    public static double avgAge(ArrayList<Pet> list)
    {
        int total = 0;

        for (Pet p : list)
            total += p.getAge();

        return (double)total / list.size();
    }

    public static void removeOldPets(ArrayList<Pet> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).getAge() > 10)
            {
                list.remove(i);
                i--;
            }
        }
    }
}
