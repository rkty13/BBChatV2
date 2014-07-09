import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JEditorPane;



public class LoginScreen extends JFrame{
    private static final long serialVersionUID = 1L;
    
    
    public LoginScreen(){
    	
    	
    	final Container mainPanel = getContentPane();
    	
    	pack();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
    	setVisible(true);
    }
}
