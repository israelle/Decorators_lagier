import javax.swing.JButton;

public class MarioTheme implements IThemeFactory {
	  @Override
	    public String getName() {
	        return "Mario";
	    }

	    public JButton createButton(String text) {
	        return new MarioThemeButton(text);
	    }

}
