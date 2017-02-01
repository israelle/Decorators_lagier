import javax.swing.JButton;

public class StarWarsTheme implements IThemeFactory {

	@Override
    public String getName() {
        return "Star Wars";
    }

    public JButton createButton(String text) {
        return new StarWarsThemeButton(text);
    }

}
