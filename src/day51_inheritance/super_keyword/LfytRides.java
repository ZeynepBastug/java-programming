package day51_inheritance.super_keyword;

public class LfytRides {
    public static void main(String[] args) {
        Lyft lyftRide = new Lyft();
        LyftXL lyftXLRide = new LyftXL();
        Lux luxRide = new Lux();

        System.out.println("Lyft ride for 5 miles = $" + lyftRide.calculateRate(5));
        System.out.println("LyftXL ride for 5 miles = $" + lyftXLRide.calculateRate(5));
        System.out.println("Lyft Lux ride for 5 miles = $" + luxRide.calculateRate(5));
    }
}
