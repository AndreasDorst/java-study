package stp.basic.moverobot;

public class Main {
    public static void moveRobot(Robot robot, int toX, int toY) {
        System.out.println("начало движения");
    }

    public static void main(String[] args){
        Robot robot = new Robot();
        moveRobot(robot, 3, 0);
    }
}
