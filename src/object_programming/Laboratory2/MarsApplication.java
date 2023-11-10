package object_programming.Laboratory2;

public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        spirit.name = "Spirit";
        spirit.status = "eksploration";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttributes();

        System.out.println("\nMars robot increase speed to 5");
        spirit.speed = 5;
        spirit.showAttributes();


        System.out.println("\nTemperature is dropping to -90 degrees");
        spirit.temperature = -90;
        spirit.showAttributes();

        System.out.println("\nTemperature check system");
        spirit.checkTemperature();
        spirit.showAttributes();

        MarsRobot opportunity = new MarsRobot();
        opportunity.name = "Opportunity";
        opportunity.status = "Special mission";
        opportunity.speed = 4;
        opportunity.temperature = 40;
        opportunity.showAttributes();

        System.out.println("\nCheck status function");
        opportunity.checkStatus();

    }
}
