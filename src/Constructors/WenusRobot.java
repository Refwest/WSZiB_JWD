package Constructors;

import object_programming.Laboratory2.MarsRobot;

public class WenusRobot {
    String status;
    int speed;
    int power;

    WenusRobot(String status, int speed, int power) {
        this.status = status;
        this.speed = speed;
        this.power = power;
    }

    public static void main(String[] args) {
        WenusRobot marsRobot1 = new WenusRobot("exploration", 10, 78);
        WenusRobot marsRobot2 = new WenusRobot("exploration", 46, 122);

        System.out.println(marsRobot1.status);
        System.out.println(marsRobot2.status);
    }
}

