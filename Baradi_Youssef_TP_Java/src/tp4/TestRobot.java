package tp4;

public class TestRobot {

    public static void main(String[] args) {

        Robot robot1 = new Robot();

        System.out.println("Coordonnées initiales du robot: " +robot1.toString());

        robot1.setDirection(2);
        robot1.avancer();

        System.out.println("Nouvelles coordonnées du robot : " +robot1.toString());
    }
}
