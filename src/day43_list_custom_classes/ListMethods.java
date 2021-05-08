package day43_list_custom_classes;

import java.util.*;

public class ListMethods {
    public static void main(String[] args) {

        System.out.println(getDays());
        getDays().get(0);  // it allows me to treat as List because method gives me the list
        System.out.println("getDays().size() = " + getDays().size());

        List <String> dayNames = getDays();
        System.out.println("Day names are " + dayNames);
        dayNames.removeIf(day -> day.length() == 6);
        System.out.println("Day names after removeIf = " + dayNames);



        System.out.println(getRandomList());

        System.out.println(getRandomMurodil(10));
    }


    public static List<String> getDays(){
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        // List <String> days = new ArrayList<>();
        // days.addAll("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");

        return days;
    }

    public static List<Integer> getRandomList(){

        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        List<Integer> list = new ArrayList(num);
        for (int i = 0; i < num; i++ ) {
            list.add(i, random.nextInt(101));
        }

        return list;
    }

    public static List<Integer> getRandomMurodil (int size){
        Random random = new Random();
        List<Integer> nums = new ArrayList<>();
        for(int i = 1; i<= size; i++){
            nums.add(random.nextInt(101));
        }
        return nums;
    }

}
