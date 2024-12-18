package stp.basic.moverobot;

public class Robot {
    int x = 0;
    int y = 0;
    Direction direction = Direction.UP;

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        System.out.println("поворот против часовой стрелки");
        direction = direction.turnLeft();
    }

    public void turnRight() {
        System.out.println("поворот по часовой стрелке");
        direction = direction.turnRight();
    }

    public void stepForward() {
        System.out.println("движение");
        switch (direction) {
            case UP: y++; System.out.println("вверх"); break;
            case DOWN: y--; System.out.println("вниз"); break;
            case LEFT: x--; System.out.println("влево"); break;
            case RIGHT: x++; System.out.println("вправо"); break;
        }
    }
}