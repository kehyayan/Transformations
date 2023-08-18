import javax.swing.*;
import java.awt.*;
import javax.swing.JTextArea;

public class answersFrame extends JFrame {

        // variable declaration
        JTextArea textArea;

        answersFrame() {

            // solutions of the guiding questions
            textArea = new JTextArea("You will find the solutions to the Understanding Questions below. \nKeep in mind that the transformation notation used in this program is:  y = af(k(x – d))^2 + c \n \n \n1. The a-value causes vertical stretches and compressions on a graph. In this program, you will only use the a-value to make the graph become vertically stretched. \n \n2. The graph becomes reflected when the a-value is negative. \n \n3. The k-value makes the graph become horizontally compressed/stretched. In this program, the k-value will only cause horizontal compressions. \n \n4. The d-value causes horizontal shifts. If 'd' is positive, the graph shifts right by 'd' units, if 'd' is negative, then the graph shifts left by 'd' units. \n \n5. The c-value causes vertical shifts to the graph. If the c-value is positive, the graph shifts up by 'c' units. If the c-value is negative, the graph shifts down by 'c' units. \n \n6. The graph is vertically shifted up when the c-value is positive. \n \n7. The graph is vertically shifted down when the c-value is negative. \n \n8. The graph is horizontally shifted right when the d-value is positive. \n \n9. The graph is horizontally shifted left when the d-value is negative. \n \n10. Changing the c-value has an impact on the range of the function because the c-value will determine the maximum or minimum y-value of the function. The function would have a maximum y-value if the a-value is negative, because it would be reflected in the x-axis (open downwards). The function would have a minimum y-value if the a-value is positive, because that would mean the graph would open upwards. \n \n11. No, changing the d-value does not have any impact on the domain of the function, this is because a parabola is a continuous graph, meaning that it takes on all x-values (unless there's a restriction). The x-values will go all the way to positive infinity and negative infinity. \n \n12. The vertex of the parabola will always be the 'd' and 'c' values. This is because horizontal and vertical shifts are the only way to choose the maximum or the minimum of the function. Vertex's (x , y) values are equal to (d , c).  \n \n13. i) Reflected in the x-axis. \n     ii) Vertically stretched by a factor of 4. \n    iii) Horizontally shifted right by 3 units. \n    iv) Vertically shifted up by 5 units. " );

            textArea.setFont(new Font("Serif", Font.PLAIN, 13));
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            textArea.setOpaque(false);
            textArea.setEditable(false);

            add(textArea, BorderLayout.NORTH);


        }

    }
