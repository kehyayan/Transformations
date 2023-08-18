import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

public class fourthFrame extends JFrame implements ActionListener {

    JButton solutionsButton;
    JTextArea textArea;

    {

        // includes guiding questions for user to answer
        textArea = new JTextArea("Use the sliders on the main page to become familiar with the Transformations concept. \nAnswer the questions below to verify your understanding. \n \nAfter you answer the questions on a separate piece of paper, click the button at the bottom of the page to check your answers. \n \n1. What impact does the a-value have on the graph? \n2. What happens when the a-value is negative? \n3. What impact does the k-value have on the graph? \n4. What impact does the d-value have on the graph? \n5. What impact does the c-value have on the graph? \n6. When is the graph vertically shifted up? \n7. When is the graph vertically shifted down? \n8. When is the graph horizontally shifted right? \n9. When is the graph horizontally shifted left? \n10. How does changing the c-value have an impact on the range of the function? \n11. Does changing the d-value have an impact on the domain of the function? Why is this? \n12. How are the 'd' and 'c' values related to the vertex of the parabola? \n13. State the transformations for f(x) = -4(x-3)^2 +5");


        textArea.setFont(new Font("Serif", Font.PLAIN, 14));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);

        // adds a 'Solutions of Understanding Questions' button
        solutionsButton = new JButton("Solutions of Understanding Questions");
        solutionsButton.addActionListener(this);

        add(textArea, BorderLayout.NORTH);
        add(solutionsButton, BorderLayout.SOUTH);


    }


    public void actionPerformed(ActionEvent event) {

        // when the user clicks on the button, it will open a new JFrame
        if (event.getActionCommand().equals(("Solutions of Understanding Questions"))) {
            // this will display the content of the answersFrame class in the JFrame
            answersFrame frame1 = new answersFrame();
            frame1.setTitle("Solutions of Understanding Questions");
            frame1.setSize(900,700);
            frame1.setVisible(true);
            frame1.pack();

        }
    }
}
