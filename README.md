# Lesson 3: Drive the Robot

The robot starts at x=0, y=0, facing UP. Get it to x=7, y=3, facing UP.

| Method | What it does |
|---|---|
| `turnClockwise()` | Turns right: UP → RIGHT → DOWN → LEFT |
| `turnCounterClockwise()` | Turns left: UP → LEFT → DOWN → RIGHT |
| `driveForward()` | Moves one square the way the robot is facing. UP is y+1, RIGHT is x+1. |
| `printPosition()` | Prints where the robot is and which way it's facing |

1. In Android Studio, **File → Open** this folder.
2. Open `src/main/java/Robot.java`.
3. In `main`, add method calls to drive the robot to the target.
4. Press ▶ **Run** in the toolbar.
