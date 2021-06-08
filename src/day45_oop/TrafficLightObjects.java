package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {

        // create traffic light object
        TrafficLight trafficLight = new TrafficLight();

        // trafficLight.color = "red"; NOT THIS WAY
        // we will assign/update the value of color
        trafficLight.changeColor("red");
        // assign variable using the method. preferred way, since we can control or check valid values before assigning

        trafficLight.changeColor("green");

    }
}
