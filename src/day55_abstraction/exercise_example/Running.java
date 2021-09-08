package day55_abstraction.exercise_example;

public class Running extends Exercise{
    @Override
    public void perform(){
        System.out.println("Performing running in a trail or a on a mountain");
    }

    @Override
    public int getCaloriesCount(int minutes){
        return minutes*11;
    }
}
