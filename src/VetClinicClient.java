import java.util.ArrayList;

public class VetClinicClient
{
    public static void main(String[] args)
    {
        ArrayList<Pet> pets1 = new ArrayList<Pet>();
        pets1.add(new Pet("", 5, 'F'));
        pets1.add(new Pet("", 7, 'M'));
        pets1.add(new Pet("", 41, 'M'));
        pets1.add(new Pet("", 6, 'M'));

        VetClinic v1 = new VetClinic("Toronto Vet Clinic", "MrR", pets1);

        ArrayList<Pet> pets2 = new ArrayList<Pet>();
        pets2.add(new Pet("", 6, 'M'));
        pets2.add(new Pet("", 12, 'M'));
        pets2.add(new Pet("", 7, 'F'));

        VetClinic v2 = new VetClinic("King City Vet Clinic", "MrV", pets2);

        ArrayList<Pet> pets3 = new ArrayList<Pet>();
        pets3.add(new Pet("", 15, 'M'));
        pets3.add(new Pet("", 15, 'M'));
        pets3.add(new Pet("", 15, 'M'));
        pets3.add(new Pet("", 15, 'M'));
        pets3.add(new Pet("", 50, 'M'));

        VetClinic v3 = new VetClinic("Barrie Vet Clinic", "MrA", pets3);

        ArrayList<Pet> pets4 = new ArrayList<Pet>();
        pets4.add(new Pet("", 8, 'F'));
        pets4.add(new Pet("", 5, 'F'));
        pets4.add(new Pet("", 2, 'F'));
        pets4.add(new Pet("", 6, 'F'));
        pets4.add(new Pet("", 11, 'M'));
        pets4.add(new Pet("", 9, 'M'));

        VetClinic v4 = new VetClinic("Richmond Hill Vet Clinic", "Dr.H", pets4);

        VetClinic[] clinics = {v1, v2, v3, v4};

        System.out.println(countFemales(clinics));
    }

    public static int countFemales(VetClinic[] clinics)
    {
        int total = 0;

        for(int i = 0; i < clinics.length; i++)
        {
            ArrayList<Pet> list = clinics[i].getAnimals();

            for(int j = 0; j < list.size(); j++)
            {
                if(list.get(j).getGender() == 'F')
                {
                    total++;
                }
            }
        }
        return total;
    }
}
