import java.awt.Color;
import javax.swing.JLabel;

public class confLabel extends JLabel {
    confLabel(String text) {
        super(text);
        setForeground(Color.WHITE);
        setFont(getFont().deriveFont(17.0f));
    }

    void actualizar(String text) {
        setText(text);
    }
}
