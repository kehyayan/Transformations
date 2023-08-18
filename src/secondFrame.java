import javax.swing.*;
import java.awt.*;
import javax.swing.JTextArea;

public class secondFrame extends JFrame {

    //variable declaration
    JSlider slider = new JSlider(JSlider.HORIZONTAL,-5,5,0);
    JTextArea textArea;

    secondFrame()
    {


        textArea = new JTextArea("This application aims to help you grasp the various transformations applicable to quadratic graphs. By utilizing the sliders located below, you can actively modify the a, k, d, and c values, leading to noticeable shifts in the graph's position and shape. \n \nThe transformation equation used in this application reads as  y=a(k(x−d))^2 +c.\n \nThe gray quadratic graph serves as the base representation of quadratic functions. In contrast, the red quadratic graph illustrates how the base graph undergoes transformations through the utilization of the y=a(k(x−d))^2 +c equation. Change the slider values to observe the changes in the red quadratic graph. Once you feel confident about your understanding of these transformations, you can assess your knowledge by clicking the 'Check Understanding' button, which will prompt you with some questions. \n\nFurthermore, if you require further clarification in understanding quadratic transformations, simply click the 'Transformations' button on the intro page. This will provide an explanation of how each variable within the equation influences the graph's behavior.");

        //sets size/font of textArea
        textArea.setFont(new Font("Serif", Font.PLAIN, 14));
        // the lines will be wrapped if they are too long to fit within the allocated width
        textArea.setLineWrap(true);
        // indicates if word boundaries should be used for line wrapping
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false); // does not make the background opaque/white
        textArea.setEditable(false); // does not allow the user to edit the text

        slider.setMajorTickSpacing(5);
        slider.setMinorTickSpacing(1);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);


        add(textArea, BorderLayout.NORTH);

    }
}
