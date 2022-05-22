import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private Panel panel;
    public Window(String title, int width, int height, Panel panel){
        super.setTitle(title);
        super.setPreferredSize(new Dimension(width, height));
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.panel = panel;
        super.add(this.panel);
        super.pack();
        super.setVisible(true);
        super.setLocationRelativeTo(null);
    }

    public Panel getPanel() {
        return panel;
    }
}
