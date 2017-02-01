import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ButtonAlerteDecorator extends JButton{
	private IButton button;
	
	public ButtonAlerteDecorator(JButton b)
	{
		super(b.getText());
		
		for (ActionListener a : b.getActionListeners())
		{
			
		}
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Stub de la méthode généré automatiquement
				message(getText());
			}
			
		});
	}

	
	




	/**
	 * methode affichant une pop-up avec le message écrit à l'interieur
	 * @param s
	 */
	public void message (String s)
	{
		JOptionPane.showMessageDialog(null, s);
	}




	
	

}
