package day18_conditional_practice_string_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        int winter = 4;

        // DRY Principle -> don't repeat yourself
        switch (winter) {
            case 12: case 1: case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
        }


    }
}
