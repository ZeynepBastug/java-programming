package day53_inheritance.tesla;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla", "Model Y", 48_190.0, 2021, 326);
        ec1.drive(50);
        System.out.println(ec1.toString());

        if(ec1.getPrice() > 10000){
            System.out.println(ec1.getMake() + " - " + ec1.getModel() + " is out of my budget");
        } else {
            System.out.println("purchasing " + ec1.toString());
        }

        System.out.println(ElectricCar.getCount());
        ElectricCar ec2 = new ElectricCar("Tesla", "Cybertruck", 59990, 2022, 300);
        System.out.println(ec2.toString());
        System.out.println("Count = " + ec2.getCount());
        System.out.println("Count = " + ElectricCar.getCount());

        Roadster roadster = new Roadster("Roadster", 200000, 2022, 620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.getCount());

        ModelX modelX = new ModelX("ModelX", 89_990.0, 2021, 360);
        System.out.println(modelX.toString());
        modelX.drive(10);
        System.out.println("Having lunch...");


    }

}
