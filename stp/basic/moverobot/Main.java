package stp.basic.moverobot;

public class Main {

    public static void main(String[] args){
        Robot robot = new Robot(5, 5, Direction.UP);
        RobotController.moveRobot(robot, 10, 10);
    }
}
