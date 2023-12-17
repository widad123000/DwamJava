package tp4;

public class TestRectangle {
    public static void main(String[] args){

        // create a Rectangle
        Point p = new Point(0,1);
        Point q = new Point(2,0);
        Rectangle rectangle = new Rectangle(p, q);

        rectangle.afficher();
        System.out.println("the Area of the Rectangle is : "+ rectangle.surface());
        // zoom on the rectangle
        rectangle.zoom(5, 4);
        rectangle.afficher();
        System.out.println("the Area of the Rectangle is : "+ rectangle.surface());
    }
}
