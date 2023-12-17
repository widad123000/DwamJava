class Robot extends Point {
    int direction;

    public Robot() {
        super(0, 0);
        direction = 3;
    }

    public Robot(int x, int y, int direction) {
        super(x, y);
        this.direction = direction;
    }

    public void avancer() {
        switch (direction) {
            case 1: y++; break; 
            case 2: x++; break; 
            case 3: y--; break; 
            case 4: x--; break;
            default: break;
        }
    }

    public void setDirection(int d) {
        if (d >= 1 && d <= 4) {
            direction = d;
        }
    }
    public String toString() {
        return "Robot [x=" + x + ", y=" + y + ", direction=" + direction + "]";
    }

    public static void main(String[] args) {
        Robot robot1 = new Robot();
        System.out.println("Position initiale du Robot : " + robot1.toString());

        robot1.avancer();
        System.out.println("Position après avancer() : " + robot1.toString());

        robot1.setDirection(2);
        System.out.println("Position après changement de direction : " + robot1.toString());
        Robot robot2 = new Robot(2, 3, 4);
        System.out.println("Position initiale du Robot2 : " + robot2.toString());
        public class TestPolymorphisme {
            public static void main(String[] args) {
                Robot r = new Robot(3, 4, 2);
                System.out.println(r.toString());
                Point p = r; 
                System.out.println(p.toString()); 
                        }
        }
    }
}
