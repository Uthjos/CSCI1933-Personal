import java.util.Scanner;
import java.awt.*;
public class Application {
    public Canvas drawing = new Canvas(1600,1600);

    public void triFractal(int n, double h, double w, double posX, double posY) {
        Triangle myTriangle = new Triangle(posX,posY,w,h);
        if (n ==1) {
            drawing.drawShape(myTriangle);
        }
        else {
            drawing.drawShape(myTriangle);

            //move to bottom left;
            triFractal(n-1,.5*h,.5*w, myTriangle.getXPos() -.25 * myTriangle.getWidth(), myTriangle.getYPos() - .5 * myTriangle.getHeight());

            //move to bottom right
            triFractal(n-1,.5*h,.5*w, myTriangle.getXPos() + myTriangle.getWidth() -.25 * myTriangle.getWidth(), myTriangle.getYPos() - .5 * myTriangle.getHeight());
            //move to top middle
            triFractal(n-1,.5*h,.5*w, myTriangle.getXPos() - .5*myTriangle.getWidth(), myTriangle.getYPos() - myTriangle.getHeight());

        }
    }

    public void recFractal(int n, double l, double posX, double posY) {
        Rectangle myRectangle = new Rectangle(posX,posY,l,l);
        if (n ==1) {
            drawing.drawShape(myRectangle);
        }
        else {
            drawing.drawShape(myRectangle);
            //move to bottom left;
            recFractal(n-1,.5 * l,myRectangle.getXPos() - .5 * l, myRectangle.getYPos() + l);
            //move to bottom right
            recFractal(n-1,.5 * l, myRectangle.getXPos() + l,myRectangle.getYPos() - .5 * l);
            //move to top right
            recFractal(n-1, .5 * l,myRectangle.getXPos() + l, myRectangle.getYPos() + myRectangle.getHeight());
            //move to top left
            recFractal(n-1,.5 * l, myRectangle.getXPos() - .5 * l, myRectangle.getYPos() - .5 * l);

        }

    }
    public static void main(String[] args) {
        Application fract = new Application();
        //ask user for input
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the shape you would like to draw (Circle, Triangle, Rectangle):");
        //String shapeRequest = sc.next();

        //System.out.println("Enter the color you would like your shapes to be");
        //String shapeColor = sc.next();
        //test print
        //System.out.println(shapeRequest + " " + iterRequest);
        //draw number of patterns user asked for

        fract.triFractal(7,400,400,800,800);
        //fract.recFractal(7,100,400,400);
        //compute total area of drawn patterns.
    }
}
