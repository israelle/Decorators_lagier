import javax.swing.*;
import java.awt.*;



/**
 * Classe Main
 * @author israelle lagier
 *
 */
public class Main {

    private static void resetLookAndFeel() {
        try {
            // Set System L&F
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }
    }

/**
 * programme principal
 * @param args
 */
    public static void main(String[] args) {
        resetLookAndFeel();
        final ThemeCatalog themes = new ThemeCatalog();

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //On crée une nouvelle instance de notre JDialog
                JDialog dialog = new JDialog();
                dialog.setSize(500, 400);//On lui donne une taille
                dialog.setTitle("Première fenêtre"); //On lui donne un titre
                dialog.setVisible(true);//On la rend visible

                JPanel pan = new JPanel();
                pan.setLayout(new FlowLayout());

                dialog.add(pan);

                JComboBox themeSelector = new JComboBox(themes);
                
                //creation des boutons
                JButton size = new ButtonSizeDecorator(new JButton("size"));
                JButton alert = new ButtonAlerteDecorator(new JButton("alert"));
                JButton upperCase = new ButtonUpperCaseDecorator(new JButton("upper"));
                themeSelector.setRenderer(new ThemeCellRenderer());
                IThemeFactory theme = new MarioTheme();
            
                //ajout des buttons dans le panel
                pan.add(size);
                pan.add(alert);
                pan.add(upperCase);
                pan.add(themeSelector);
                pan.add(theme.createButton("hello !"));
            
                

            }
        });
    }
}


class ThemeCellRenderer extends JLabel implements ListCellRenderer<Object> {
    public ThemeCellRenderer() {
        setOpaque(true);
    }

    public Component getListCellRendererComponent(JList<?> list,
                                                  Object theme,
                                                  int index,
                                                  boolean isSelected,
                                                  boolean cellHasFocus) {
        setText(((IThemeFactory) theme).getName());
        return this;
    }




    public JButton createButton(String text) {
        return new StarWarsThemeButton(text);
    }
}




