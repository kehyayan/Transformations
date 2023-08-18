import java.awt.*;
import javax.swing.*;

public class myGraph extends JComponent {

    //variable declaration
    int numGridlinesX; // will be used to calculate the difference between the maximum x value and the minimum x value.
    int oneXunitPixel; // this will be assigned with the pixel value of 1 'x' value.
    int numGridlinesY; // will be used to calculate the difference between the maximum y value and the minimum y value.
    int oneYunitPixel; // this will be assigned with the pixel value of 1 'y' value.
    double a =1; // represents the a-value
    double k =1; // represents the k-value
    double d = 0; // represents the d-value
    double c = 0; // represents the c-value
    /* represents the default values of the variables in transformation notation.
       these values will never change because they will be used to graph the base
       quadratic function f(x)= x^2 */
    final double aBase = 1;
    final double kBase = 1;
    final double dBase = 0;
    final double cBase =0;

    public myGraph(int xMin, int xMax, int yMin, int yMax) {

        //assigns numGridlinesX the difference between xMax and xMin
        numGridlinesX = xMax - xMin;
        //assigns oneXunitPixel with 400 divided by numGridlinesX (this will be used to draw the x axis)
        oneXunitPixel = 400 / numGridlinesX; //400
        //assigns numGridlinesY the difference between yMax and yMin
        numGridlinesY = yMax - yMin;
        //assigns oneYunitPixel with 400 divided by numGridlinesY (this will be used to draw the y axis)
        oneYunitPixel = 400 / numGridlinesY; //400
    }

    @Override
    protected void paintComponent(Graphics g) {

        /* represent the blank space in the y-axis and x-axis (after the values exceed max and min, which is -5 and 5)
           paddingx and paddingy will also be used to draw the lines, the program will know where to draw the lines
           due to paddingx and paddingy. If the values for the paddingx and paddingy were not zero, then the for loop
           used below would have left blank space horizontally and vertically before drawing the grid.
         */
        int paddingx = 0;
        int paddingy = 0;

        // we need a Graphics2D class to draw lines. (must import java.awt.*)
        Graphics2D g2d = (Graphics2D) g;

        g2d.setBackground(Color.white);

        //gets the width and height of the JFrame, which was set in cartesianPlane class
        int width = super.getWidth();
        int height = super.getHeight();

        // clears the rectangle by filling it with the background color of the drawing surface, makes the background of the grid white.
        g2d.clearRect(1, 1, width -24, height); // 1 1

        //sets the thickness of the axes
        g2d.setStroke(new BasicStroke(3));
        //sets the color of the axes
        g2d.setColor(Color.gray);

        //draws the y-axis
        g2d.drawLine(paddingx + 200, paddingy, paddingx + 200, paddingy + 400); // 200 200 400
        //draws the x-axis
        g2d.drawLine(paddingx, paddingy + 200, paddingx + 400, paddingy + 200); // 200 400 200

        //draws the grid
        g2d.setStroke(new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, new float[]{10, 0}, 0));

       for (int i = 0; i <= numGridlinesX ; i++) {
            // draws the vertical lines in the grid
            g2d.drawLine(paddingx + i * oneXunitPixel, paddingy, paddingx + i * oneXunitPixel, paddingy + 400); // 400
        }

        for (int i = 0; i <= numGridlinesY ; i++) {
            // draws the horizontal lines in the grid
            g2d.drawLine(paddingx, paddingy + i * oneYunitPixel, paddingx + 400, paddingy + i * oneYunitPixel); //400
        }

        // calls the transformed and base graph functions
        curve(g);
        curveBase(g);


    }

     public void curve(Graphics g) {

        g.setColor(Color.red);

        /* Draws the transformed graph using a for loop. The curve is made by placing two dots VERY close to each other
           and then drawing a line between those two dots.
         */
        for (double x = -5; x <= 5; x = x + 0.0003) { // 0.0016
            /* the code lines below draw a base quadratic graph, however the a,k,d,c values will update because of
            sliders present in the application.
             */
            double y = a * (k*(x- d))*(k*(x-d)) + c;

            // declares and assigns xp and yp in order to place the graph in the origin (before being moved)
            int xp = (int) Math.round(201 + x * 40);  /* ORIGIN x: 201 40 */
            int yp = (int) Math.round(201 - y * 40); /* ORIGIN y: 201 40 */

            /* each y value is 40 pixels. each x value is 40 pixels. */
            g.fillOval(xp - 2, yp - 2, 4, 3);

        }
    }

    public void curveBase (Graphics g) {

        // this function draws the base graph by using the default (final) values of the variables in transformation notation
        g.setColor(Color.GRAY);

        for (double x = -3; x <= 3 ; x = x + 0.0018) { // 0.0014
            double y = aBase * (kBase * (x - dBase)) * (kBase * (x - dBase)) + cBase;
            int xp = (int) Math.round(201 + x * 40);  /* ORIGIN x: 201 40 */
            int yp = (int) Math.round(201 - y * 40);  /* ORIGIN y: 201 40 */
            g.fillRect(xp - 2, yp - 2, 2, 2);


        }
    }



    public void setakdc(double newa, double newk, double newd, double newc) {

        //updates the a,k,d,c values with the new values
        a = newa;
        k = newk;
        d = newd;
        c = newc;

        // draws the transformed graph in response to user input through sliders
        repaint();


    }

    

}