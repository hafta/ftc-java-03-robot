public class Robot {

    enum Direction { UP, DOWN, LEFT, RIGHT }

    static final int TARGET_X = 71;
    static final int TARGET_Y = 33;
    static final Direction TARGET_DIRECTION = Direction.UP;

    int x;
    int y;
    Direction direction;

    Robot() {
        x = 0;
        y = 0;
        direction = Direction.UP;
    }

    void turnClockwise() {
        switch (direction) {
            case UP:    direction = Direction.RIGHT; break;
            case RIGHT: direction = Direction.DOWN;  break;
            case DOWN:  direction = Direction.LEFT;  break;
            case LEFT:  direction = Direction.UP;    break;
        }
        checkTarget();
    }

    void turnCounterClockwise() {
        switch (direction) {
            case UP:    direction = Direction.LEFT;  break;
            case LEFT:  direction = Direction.DOWN;  break;
            case DOWN:  direction = Direction.RIGHT; break;
            case RIGHT: direction = Direction.UP;    break;
        }
        checkTarget();
    }

    void driveForward() {
        switch (direction) {
            case UP:    y++; break;
            case DOWN:  y--; break;
            case LEFT:  x--; break;
            case RIGHT: x++; break;
        }
        checkTarget();
    }

    void printPosition() {
        System.out.println("x=" + x + ", y=" + y + ", facing " + direction);
    }

    private void checkTarget() {
        if (x == TARGET_X && y == TARGET_Y && direction == TARGET_DIRECTION) {
            printPosition();
            System.out.println("Target reached! Great job!");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.printPosition();

        // Add code here to get the robot to (71, 33) facing UP.
        // For example:
        robot.driveForward();
        robot.printPosition();

        System.out.println("Not at the target yet. Keep going!");
    }
}
