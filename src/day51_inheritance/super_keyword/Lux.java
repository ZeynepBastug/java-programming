package day51_inheritance.super_keyword;

public class Lux extends Lyft {

    @Override
    public double calculateRate(int miles){
        return super.calculateRate(miles) * 1.2;
    }
}
