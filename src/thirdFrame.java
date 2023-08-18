import javax.swing.*;
import java.awt.*;
import javax.swing.JTextArea;

public class thirdFrame extends JFrame {

    //variable declaration
    JTextArea textArea;

    thirdFrame()
    {
        //explains transformations and how each value in the transformation notation has an impact
        textArea = new JTextArea("A function transformation takes the base function of a graph and translates it while taking values from the equation in the form f(x) = a(k(x-d))^2 + c. \n \n * In this program, you will see the a-value cause reflections and stretches to the graph. When the a-value is negative, the graph will become reflected in the x-axis. The a-value will cause vertical stretches by a factor of the absolute value of 'a'. This means that the resulted vertical stretch will be the same whether the a-value is positive or negative. The only difference is that the graph will be reflected in the x-axis when 'a' is a negative number. \n \n * The k-value will cause horizontal compression in this program. The graph becomes horizontally compressed by a factor of the absolute value of 'k'. When the k-value is negative, you will not notice a difference because it will be reflected in the y-axis. When the graph becomes reflected in the y-axis, the right side of the quadratic graph will replace the left side of the graph, and the left side will replace the right side of the graph, resulting in the exact same graph. This only happens for graphs that have an even number degree. \n \n * The d-value causes horizontal shifts to the graph. When 'd' has a positive value, then the graph has been shifted right by 'd' units. When 'd' has a negative value, the graph has been shifted left by 'd' units. \n \n * Finally, the c-value causes vertical translations to the graph. When 'c' has a positive value, the graph has been vertically shifted up 'c' units. When 'c' has a negative value, the graph has been shifted down by 'c' units. ");

        textArea.setFont(new Font("Serif", Font.PLAIN, 14));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);


        add(textArea, BorderLayout.NORTH);

    }

}



