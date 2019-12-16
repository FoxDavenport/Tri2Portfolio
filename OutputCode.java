package Util;

import javax.swing.JOptionPane;
import javax.swing.*;

/**
 * displays code returned by GetCodeV2
 *
 * @author Ethan Davies
 * @version 12/6
 */

public class OutputCode {
	/**
	 * codeOutput: displays code
	 * @param void 
	 * @return void
	 *
	 */
    public static void codeOutput(int Type) {
    	JFrame frame = new JFrame();//new JFrame to show all the code we need to
        String code = GetCodeV2.codeGetV2(Type);
        //JOptionPane.showMessageDialog(null, code, "Code", JOptionPane.INFORMATION_MESSAGE);    
        JTextArea textArea = new JTextArea(50, 50); //textarea to put code into
        textArea.setText(code);
        textArea.setEditable(false);
        
        // wrap a scrollpane around it
        JScrollPane scrollPane = new JScrollPane(textArea);//making the text area scrollable cause there's a lot of code
        
        // display them in a message dialog
        JOptionPane.showMessageDialog(frame, scrollPane); //now use the JOptionPane to show it all together
    }
}