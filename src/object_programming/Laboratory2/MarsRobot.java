package object_programming.Laboratory2;

public class MarsRobot {
    String status;
    int speed;
    float temperature;
    String name;

    public void checkTemperature() {
        if (temperature < -80) {
            System.out.println("Alert: Critical temperature!");
            status = "Return to home";
            speed = 5;
        }
    }

    public void showAttributes() {
        System.out.println("\nStatus: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }

    public void checkStatus() {
        System.out.println("\nStatus of " + name + " robot is: " + status);

    }
}
