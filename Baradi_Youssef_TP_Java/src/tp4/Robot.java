package tp4;

import tp3.Point;

public class Robot extends Point {

    int direction;

    public Robot(){

        super(0,0);
        direction = 3;
    }
    public Robot(int x, int y, int direction) {
        super(x, y);
        if (direction >= 1 && direction <= 4) {
            this.direction = direction;
        } else {
            System.out.println("Direction invalide.");
            this.direction = 3;
        }
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        if (direction >= 1 && direction <= 4) {
            this.direction = direction;
        } else {
            System.out.println("Direction invalide.");
        }
    }

    public void avancer() {
        switch (direction) {
            case 1: y++;
                break;
            case 2: x++;
                break;
            case 3: y--;
                break;
            case 4: x--;
                break;
            default:
                System.out.println("Direction invalide.");
        }
    }

    @Override
    public String toString() {
        return "Robot : (" + x + ", " + y + "), Direction=" + direction;
    }
}
