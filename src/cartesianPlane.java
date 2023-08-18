/* This program teaches the user the concept of transformations that can be applied to a quadratic graph.
   By inputting values through sliders, the program will respond to user input and transform the graph
   by using the transformation notation y = af(k(x-d))^2 + c. This program will also include multiple
   other features such as guiding questions, explaining transformations, and information for the user
   on how to use the program.
 */

import javax.swing.*;

public class cartesianPlane {

    public static void main (String args[]){

        // this takes everything in QuadTransform class (which extends JFrame) and opens a JFrame with the components added to QuadTransform
        QuadTransform myQuadGraph = new QuadTransform();
        // sets the JFrame visible
        myQuadGraph.setVisible(true);
        // blocks the user to resize the program. Use this program as its default size for best results.
        myQuadGraph.setResizable(true);
        // sets the size of the JFrame
        myQuadGraph.setSize(685, 510); // 658 457
        //sets a title to the frame
        myQuadGraph.setTitle("Quadratic Transformations");
        //allows the JFrame to close when the user clicks on the exit button
        myQuadGraph.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}
