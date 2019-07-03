/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Deni
 */
public class ActionEventListener implements ActionListener {
    private JTextField  textA;
    private JLabel destination;

    ActionEventListener(JTextField textAreaLeft, JLabel label) {
        
        textA = textAreaLeft;
        destination = label;
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        destination.setText(textA.getText());
        textA.setText("");
    }
    
}
