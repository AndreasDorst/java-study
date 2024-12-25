package stp.basic.moverobot;

public enum Direction {
    UP, RIGHT, DOWN, LEFT;

    public Direction turnLeft() {
        return values()[(ordinal() + 3) % 4];
    }

    public Direction turnRight() {
        return values()[(ordinal() + 1) % 4];
    }
}
