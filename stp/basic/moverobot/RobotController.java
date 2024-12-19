package stp.basic.moverobot;

public class RobotController {

    public static void moveRobot(Robot robot, int toX, int toY) {
        System.out.println("Start movement, position: " + robot.getX() + " " + robot.getY());
        int currentX = robot.getX();
        int currentY = robot.getY();

        while (currentX != toX) {
            if (currentX < toX && robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            } else if (currentX > toX && robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            } else {
                robot.stepForward();
                currentX = robot.getX();
            }
        }

        while (currentY != toY) {
            if (currentY < toY && robot.getDirection() != Direction.UP) {
                robot.turnRight();
            } else if (currentY > toY && robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            } else {
                robot.stepForward();
                currentY = robot.getY();
            }
        }
        System.out.println("End movement, coordinates: " + currentX + " " + currentY);
    }
}
