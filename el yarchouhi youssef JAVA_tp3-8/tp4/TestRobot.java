package tp4;

public class TestRobot {
    public static void main(String[] agrs){
        Robot robot = new Robot();
        System.out.println("Initial coordinates: " + robot.toString()); // Print initial coordinates

        robot.avancer(1); // Move up the robot 
        System.out.println("Coordinates after moving up: " + robot.toString()); // Print coordinates after moving

        robot.avancer(2); // Move right the robot 
        System.out.println("Coordinates after moving right: " + robot.toString()); // Print coordinates after moving

        Robot r = new Robot();
        Point p = new Point(6, 7);
        System.out.println(p.toString());
        p = r;
        System.out.println(p.toString());

    }
}
