package day51_inheritance;

public class Contractor extends Employee{

    @Override // 1) Let's everyone know that you are overriding this method.
              // 2) Ensure that this method is being overriding. if not, it shows ERROR.
    public double calculateSalary(double hourlyRate) {
        return 50 * 40 * hourlyRate;
    }


}
