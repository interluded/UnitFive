import java.util.ArrayList;

public class RemovingFromArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 30; i++){
            list.add((int) (100 * Math.random() + 1));
        }
        removeEvens(list);
        System.out.println(list);

        ArrayList<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
        System.out.println(months);
        removeLessThan(months,6);
        System.out.println(months);

    }
    public static void removeEvens(ArrayList<Integer> list){
        for(int i = 0;i<list.size();i++)
            if(list.get(i) < 5){
                list.remove(i);
                i--;
        }
    }
    public static void removeLessThan(ArrayList<String> list, int key){
        for(int i = 0;i<list.size();i++){
            if(list.get(i).length() < key){
                list.remove(i);
                i--;
            }
        }
    }
}
