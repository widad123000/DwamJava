package tp4;

public class Robot extends Point {
    int direction;

    public Robot(){
        super(0,0);
        direction = 3;
    }
    // constructor
    public Robot(int x, int y, int d){
        setX(x);
        setY(y);
        this.direction = d;
    }
    // Methods

    // avancer
    public void avancer(int direction){
        switch (direction) {
            case 1: // move up
                setY(getY()+ 1);
                break;
            case 2: // move right
                setX(getX()+1);
                break;
            case 3: // move down
                setX(getX()-1);
                break;
            case 4: // move left
                setX(getX()-1);
                break;
            default:
                System.out.println("Invalid direction!");
                break;
        }
    }
    // setDirection 
    public void setDirection(int d){
        this.direction = d;
    }

    // override toString()
    @Override
    public String toString(){
        return "D: "+this.direction+" | ("+getX()+", "+getY()+")";
    }
}
