public class Robot extends Point {
    int direction;

    public Robot() {
    super();
        direction = 3;
    }

    public void avancer() {

        switch (direction) {
            case 1:
                setX(getY() + 1);
                break;
            case 2:
                setX(getX() + 1);
                break;
            case 3:
                setX(getY() - 1);
                break;
            case 4:
                setX(getX() - 1);
                break;
        }
    }
    public String toString() {
        return "(" + getX() + "," + getY() + ")  et de dorection "+ direction ;
    }
}
