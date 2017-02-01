import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * 
 * @author israelle lagier
 *
 */
public class ButtonUpperCaseDecorator extends JButton {

	private JButton button;
	
	/**
	 * Constructeur 
	 * @param b 
	 */
	ButtonUpperCaseDecorator (JButton b)
	{
	super(b.getText());
		button = b;
		for (ActionListener a : button.getActionListeners())
		{
			
		}
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setText(getText().toUpperCase());
				
			}
			
		});
	}
	

	
	

}
