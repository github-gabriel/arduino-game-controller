import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    private int x = 0, y = 0;
    private String button = "";
    private final static int BUTTON_WIDTH = 100, BUTTON_HEIGHT = 100;

    public Panel(){
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.fillRoundRect(700, this.getHeight() / 2 - 50, BUTTON_WIDTH,BUTTON_HEIGHT,BUTTON_WIDTH,BUTTON_HEIGHT);
        g.fillRoundRect(900, this.getHeight() / 2 - 50, BUTTON_WIDTH,BUTTON_HEIGHT,BUTTON_WIDTH,BUTTON_HEIGHT);
        g.fillRoundRect(800, this.getHeight() / 2 - 150, BUTTON_WIDTH,BUTTON_HEIGHT,BUTTON_WIDTH,BUTTON_HEIGHT);
        g.fillRoundRect(800, this.getHeight() / 2 + 50, BUTTON_WIDTH,BUTTON_HEIGHT,BUTTON_WIDTH,BUTTON_HEIGHT);
        g.fillRoundRect(this.getWidth() / 2 - 100, this.getHeight() / 2 + 200, 75,75,75,75);
        g.fillRoundRect(this.getWidth() / 2 + 100, this.getHeight() / 2 + 200, 75,75,75,75);
        g.fillRoundRect(this.x / 2, (-this.y + this.getHeight()) / 2 + 115,100,100,100,100);

        if(button.equals("K")){
            g.setColor(Color.RED);
            g.fillRoundRect(this.x / 2, (-this.y + this.getHeight()) / 2 + 115,100,100,100,100);
        }else{
            g.setColor(Color.DARK_GRAY);
            g.fillRoundRect(this.x / 2, (-this.y + this.getHeight()) / 2 + 115,100,100,100,100);
        }
        switch (button){
            case "D":
                g.setColor(Color.RED);
                g.fillRoundRect(700, this.getHeight() / 2 - 50, BUTTON_WIDTH,BUTTON_HEIGHT,BUTTON_WIDTH,BUTTON_HEIGHT);
                break;
            case "B":
                g.setColor(Color.RED);
                g.fillRoundRect(900, this.getHeight() / 2 - 50, BUTTON_WIDTH,BUTTON_HEIGHT,BUTTON_WIDTH,BUTTON_HEIGHT);
                break;
            case "A":
                g.setColor(Color.RED);
                g.fillRoundRect(800, this.getHeight() / 2 - 150, BUTTON_WIDTH,BUTTON_HEIGHT,BUTTON_WIDTH,BUTTON_HEIGHT);
                break;
            case "C":
                g.setColor(Color.RED);
                g.fillRoundRect(800, this.getHeight() / 2 + 50, BUTTON_WIDTH,BUTTON_HEIGHT,BUTTON_WIDTH,BUTTON_HEIGHT);;
                break;
            case "E":
                g.setColor(Color.RED);
                g.fillRoundRect(this.getWidth() / 2 + 100, this.getHeight() / 2 + 200, 75,75,75,75);
                break;
            case "F":
                g.setColor(Color.RED);
                g.fillRoundRect(this.getWidth() / 2 - 100, this.getHeight() / 2 + 200, 75,75,75,75);
                break;
            default:
                g.setColor(Color.DARK_GRAY);
        }
    }

    public void update(int x, int y, String button){
        this.x = x;
        this.y = y;
        this.button = button;
    }

}
