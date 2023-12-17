class Robot extends Point {
    int direction; // direction actuelle

    public Robot(double x,double y , int direction){
        this.x=x;
        this.y=y;
        this.direction=direction;
    }

    public void avancer() {
        switch (direction) {
            case 1: y++; break;
            case 2: x++; break;
            case 3: y--; break;
            case 4: x--; break;
            default: ;
        }
    }
    public String toString() {
        return super.toString()+" la direction est : "+direction;
    }
    void setDirection(int d){
        this.direction=d;
    }
};
