package stp.basic.moverobot;

public class Robot {
    int x, y;
    Direction direction;


    // Constructor
    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

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
        System.out.println("turn counter clockwise");
        direction = direction.turnLeft();
    }

    public void turnRight() {
        System.out.println("turn clockwise");
        direction = direction.turnRight();
    }

    public void stepForward() {
        switch (direction) {
            case UP: y++; System.out.println("up"); break;
            case DOWN: y--; System.out.println("down"); break;
            case LEFT: x--; System.out.println("left"); break;
            case RIGHT: x++; System.out.println("right"); break;
        }
    }
}