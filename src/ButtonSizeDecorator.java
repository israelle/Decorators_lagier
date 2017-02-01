import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * classe ButtonSizeDecorator
 * @author israelle lagier
 *
 */
public class ButtonSizeDecorator extends JButton {

	private JButton b;
	
	/**
	 * Constructeur
	 * @param b
	 */
	ButtonSizeDecorator(JButton b){
		super(b.getText());
		this.b=b;
		
		
		for (ActionListener a : b.getActionListeners())
		{
			
		}
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setSize(60,50);
				
			}
			
		});
		
	}
	
}
