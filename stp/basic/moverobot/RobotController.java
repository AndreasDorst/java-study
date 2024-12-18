package stp.basic.moverobot;

public class RobotController {

    public static void moveRobot(Robot robot, int toX, int toY) {
        System.out.println("начало движения");
        int currentX = robot.getX();
        int currentY = robot.getY();

        // 1. Повернем робота так, чтобы он смотрел в нужную сторону
        // работаем с осью X
        while (currentX != toX) {
            if (currentX < toX && robot.getDirection() != Direction.RIGHT) {
                robot.turnRight(); // Поворачиваем вправо
            } else if (currentX > toX && robot.getDirection() != Direction.LEFT) {
                robot.turnLeft(); // Поворачиваем налево
            }
            robot.stepForward(); // Делаем шаг вперед
            currentX = robot.getX(); // Обновляем текущую координату X
        }

        // 2. Работаем с осью Y
        while (currentY != toY) {
            if (currentY < toY && robot.getDirection() != Direction.UP) {
                robot.turnRight(); // Поворачиваем вверх
            } else if (currentY > toY && robot.getDirection() != Direction.DOWN) {
                robot.turnLeft(); // Поворачиваем вниз
            }
            robot.stepForward(); // Делаем шаг вперед
            currentY = robot.getY(); // Обновляем текущую координату Y
        }
        System.out.println("координаты: " + currentX + " " + currentY);
    }
}
