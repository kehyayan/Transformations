import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;


public class QuadTransform extends JFrame implements ActionListener {
    // variable declaration
    final JButton button1; // 'Need Help?' button
    final JButton button2; // 'Transformations' button
    final JButton button3; // 'Check Understanding' button
    final JLabel notation;
    // makes a variable on the myGraph class, which contains the graph and the grid.
    private static myGraph myGraph1;
    // makes a variable on the SliderPanels class, which contains all the sliders
    final SliderPanels mySliders = new SliderPanels();
    // 'gbc' specifies constraints for components that are laid out using GridBagLayout
    GridBagConstraints gbc = new GridBagConstraints();
    GridBagConstraints gbc1 = new GridBagConstraints();
    // 'grid' is assigned to a GridBagLayout, which is a flexible layout manager that aligns components horizontally and vertically
    GridBagLayout grid = new GridBagLayout();

    public QuadTransform() {
//sets the layout to a GridBagLayout which was assigned to 'grid' above.
        setLayout(grid);

        notation = new JLabel("<html>" + "y=" + "a(k(x-d))" + "<sup>2</sup>+" + "c" + "</html>");
        notation.setFont(new Font("Serif", Font.PLAIN, 20));
        gbc1.gridx = 0;
        gbc1.gridy = 200;
        gbc1.ipady = 3;
        add(notation, gbc1);
//adds a new button named 'Need Help?'
        button1 = new JButton("Need Help?");
// lets the button perform an action when the user clicks on it
        button1.addActionListener(this);
// aligns the button horizontally
        gbc.fill = GridBagConstraints.HORIZONTAL;
//gridx specifies the rows at the upper left of the component
        gbc.gridx = 0;
//gridy specifies the columns at the upper left of the component
        gbc.gridy = 0;
// weightx is used to determine how to distribute space among columns and among rows.
        gbc.weightx = 0.5;
//adds the button with the applied layout settings
        add(button1, gbc);
//adds a new button named 'Transformations'
        button2 = new JButton("Transformations");
        button2.addActionListener(this);
        gbc.fill = GridBagConstraints.HORIZONTAL;
// gridx value is 1, compared to gridx value of 'Need Help?' button, this means we expect this button to be the second button at the top
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        add(button2, gbc);
//adds a new button named 'Check Understanding'
        button3 = new JButton("Check Understanding");
        button3.addActionListener(this);
        gbc.fill = GridBagConstraints.HORIZONTAL;
// gridx value is now 2, meaning that this button will be the 3rd button at the top
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        add(button3, gbc);
//applies settings to the sliders panel
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
// the sliders are aligned at column 1
        gbc.gridy = 1;
        gbc.weightx = 0.5;
        add(mySliders, gbc);
// sets the min and max values for x and y values
        myGraph1 = new myGraph(-5, 5, -5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
//ipady specifies the internal padding, which is the amount of space to add to the minimum height of the component.
        gbc.ipady = 400; //410
// gbc.weightx = 0;
        gbc.gridwidth = 2;
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(myGraph1, gbc);
    }



    @Override
    public void actionPerformed(ActionEvent event) {
//The code lines below open a new JFrame when the user clicks on the button that equals to .getActionCommand
        if (event.getActionCommand().equals(("Need Help?"))) {
// the content in the secondFrame class will be displayed when the user clicks on the button
            secondFrame frame1 = new secondFrame();
            frame1.setVisible(true);
            frame1.setTitle("Help");
// sizes the frame so that all its contents are at or above their preferred sizes.
            frame1.pack();
            frame1.setSize(600, 380);
        }
        if (event.getActionCommand().equals(("Transformations"))) {
// the content in the thirdFrame class will be displayed when the user clicks on the button
            thirdFrame frame2 = new thirdFrame();
            frame2.setVisible(true);
            frame2.setTitle("What are Transformations?");
            frame2.pack();
            frame2.setSize(650, 500);
        }
        if (event.getActionCommand().equals(("Check Understanding"))) {
// the content in the fourthFrame class will be displayed when the user clicks on the button
            fourthFrame frame3 = new fourthFrame();
            frame3.setVisible(true);
            frame3.setTitle("Check Your Understanding");
            frame3.pack();
            frame3.setSize(685, 510);
        }
    }

    public static void updateVals(double a, double k, double d, double c) {
//This method will call the 'setakdc' method from the myGraph class, in order to update the graph and the values when the slider input is changed
        myGraph1.setakdc(a, k, d, c);
    }
}
