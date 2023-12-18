import java.util.Scanner;
public class Main {
    public static String getFootShape() {
        String footShapeType = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                footShapeType = "Ellipse";
                break;
            case 2:
                footShapeType = "Rectangle";
                break;
        }
        return footShapeType;
    }
    
    public static void main(String[] args) {
        String footShapeType = getFootShape();
        Foot foot  = null;
        FootShape app = null;
        switch(footShapeType) {
            case "Ellipse":
                foot = new Ellipse();
                app = new FootShape(foot);
                System.out.println(app.drawAsEllipse());     
                break;
            case "Rectangle":
                foot = new Rectangle();
                app = new FootShape(foot);
                System.out.println(app.drawAsRectangle());     
                break;
        }   
    }
}
