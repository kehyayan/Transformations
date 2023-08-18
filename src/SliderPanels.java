import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderPanels extends JPanel {


    public JPanel controls, quadpanel; // the 2 JPanels will include JSliders and JLabels
    public JSlider aslider, kslider, dslider, cslider; // the JSliders will let the user input values for a,k,d,c through sliders
    public JLabel alabel, klabel, dlabel, clabel; // these JLabels will show what value the slide is at



    public SliderPanels() {

        //sets the max and  min values for the sliders, also it sets the default value for the slider, which is 1
        aslider = new JSlider(JSlider.HORIZONTAL, -5, 5, 1);
        //sets major tick spaces every 5 value (-5 to 0, 0 to 5)
        aslider.setMajorTickSpacing(5);
        // sets the minor tick spaces every 1 value
        aslider.setMinorTickSpacing(1);
        // Painting of tick marks is controlled by setPaintTicks.
        aslider.setPaintTicks(true);
        // Painting of labels is controlled by setPaintLabels
        aslider.setPaintLabels(true);
        //sets a 'LEFT_AlIGNMENT' to the slider
        aslider.setAlignmentX(Component.LEFT_ALIGNMENT);

        kslider = new JSlider(JSlider.HORIZONTAL, -5, 5, 1);
        kslider.setMajorTickSpacing(5);
        kslider.setMinorTickSpacing(1);
        kslider.setPaintTicks(true);
        kslider.setPaintLabels(true);
        kslider.setAlignmentX(Component.LEFT_ALIGNMENT);

        // sets the max and min values of the slider, but makes the default value 0 as opposed to aslider and kslider
        dslider = new JSlider(JSlider.HORIZONTAL, -5, 5, 0);
        dslider.setMajorTickSpacing(5);
        dslider.setMinorTickSpacing(1);
        dslider.setPaintTicks(true);
        dslider.setPaintLabels(true);
        dslider.setAlignmentX(Component.LEFT_ALIGNMENT);

        cslider = new JSlider(JSlider.HORIZONTAL, -5, 5, 0);
        cslider.setMajorTickSpacing(5);
        cslider.setMinorTickSpacing(1);
        cslider.setPaintTicks(true);
        cslider.setPaintLabels(true);
        cslider.setAlignmentX(Component.LEFT_ALIGNMENT);

        // adds a ChangeListener so that the sliders perform an action when they are changed
        SliderListener listener = new SliderListener();
        aslider.addChangeListener(listener);
        kslider.addChangeListener(listener);
        dslider.addChangeListener(listener);
        cslider.addChangeListener(listener);

        //sets a JLabel to show the user what each variable (a,k,d,c) is currently at
        alabel = new JLabel("a: 1.0");
        //sets a LEFT_ALIGNMENT to the JLabel
        alabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        klabel = new JLabel("k: 1.0");
        klabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        dlabel = new JLabel("d: 0.0");
        dlabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        clabel = new JLabel("c: 0.0");
        clabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        controls = new JPanel();

        //makes a new layout using BoxLayout and assigns it to the 'controls' JPanel
        BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
        controls.setLayout(layout);

        // the controls JPanel adds all the JSliders and JLabels
        controls.add(alabel);
        controls.add(aslider);
        // creates an invisible component that's always the specified size
        controls.add(Box.createRigidArea(new Dimension(0, 20)));

        controls.add(klabel);
        controls.add(kslider);
        controls.add(Box.createRigidArea(new Dimension(0, 20)));

        controls.add(dlabel);
        controls.add(dslider);
        controls.add(Box.createRigidArea(new Dimension(0, 20)));

        controls.add(clabel);
        controls.add(cslider);
        controls.add(Box.createRigidArea(new Dimension(0, 20)));

        quadpanel = new JPanel();
        quadpanel.setSize(new Dimension(800, 800));

        // adds both JPanels to the frame
        add(controls);
        add(quadpanel);


    }

    class SliderListener implements ChangeListener {
        private double a, k, d, c;

        public void stateChanged(ChangeEvent event) {

            // gets the values from the sliders
            a = aslider.getValue();
            k = kslider.getValue();
            d = dslider.getValue();
            c = cslider.getValue();

            //calls the updateVals method in QuadTransform class in order to update the a,k,d,c values in the JLabels when they are changed
            QuadTransform.updateVals(a,k,d,c);

            // updates the JLabels of the variables when they are changed
            alabel.setText("a: " + a);
            klabel.setText("k: " + k);
            dlabel.setText("d: " + d);
            clabel.setText("c: " + c);


        }
    }
}