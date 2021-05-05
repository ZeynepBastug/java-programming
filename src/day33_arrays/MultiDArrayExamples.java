package day33_arrays;

public class MultiDArrayExamples {
    public static void main(String[] args) {
        String[][] users = new String[3][2];
        users[0][0] = "Teodora Tsyetanov";
        users[0][1] = "TeadoraPWD12";
        users[1][0] = "Anna Ziyayeva";
        users[1][1] = "AnnaAlmaty123";
        users[2][0] = "Pervin Altea";
        users[2][1] = "PervinVienna321";

        String[][] userData ={ {"Teodora Tsyetanov","TeadoraPWD12"},
                {"Anna Ziyayeva","AnnaAlmaty123"},
                {"Pervin Altea","PervinVienna321" }};

        System.out.println(userData[0][0]);
        System.out.println(userData[1][0]);
        System.out.println(userData[2][0]);

        System.out.println(userData[0][1]);
        System.out.println(userData[1][1]);
        System.out.println(userData[2][1]);
    }
}
