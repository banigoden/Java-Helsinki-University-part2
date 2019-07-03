 package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame = new JFrame();
        frame.setPreferredSize(new Dimension (100, 200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }


    public JFrame getFrame() {
        return frame;
    }

    private void createComponents(Container container) {
     
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        JRadioButton noReason = new JRadioButton(" No Reason.");
        JRadioButton because = new JRadioButton(" Because it is fun!");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(noReason);
        buttonGroup.add(because);
        JButton button = new JButton("Done!");
        
        JCheckBox yes = new JCheckBox(" Yes!");
        JCheckBox no  = new JCheckBox(" NO!");
        buttonGroup.add(yes);
        buttonGroup.add(no);
        buttonGroup.add(button);
        
        container.add(new JLabel("Are you?"));
        container.add(yes);
        container.add(no);
        
        container.add(new JLabel("Why?"));
        container.add(noReason);
        container.add(because);
        container.add(button);
        
        
    }
}
