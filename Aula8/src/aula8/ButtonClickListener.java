/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Turma A
 */
public class ButtonClickListener implements ActionListener{
    private JFrameSwing frame;

    public ButtonClickListener(JFrameSwing frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       frame.getjLabelTop(); //To change body of generated methods, choose Tools | Templates.
    }

   
    

    
}
