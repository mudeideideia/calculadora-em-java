import javax.swing.JButton;
import java.awt.Color;

import java.awt.event.ActionListener;

public class MyButton extends JButton {

    private String text = "X";
    private JButton btn; 
    private int xpos = 100;
    private int ypos = 300;
    private static int width = 50;
    private static int height = 50;
    // private ActionListener eActionListener;

    public MyButton() {
        this.btn = new JButton();
        btn.setText(this.text);
        btn.setBounds(this.xpos, this.ypos, MyButton.getWidthh(), MyButton.getHeightt());
        btn.setForeground(Color.RED);
        btn.setBackground(Color.WHITE);
    }

    public JButton getButton() {
        return btn;
    }
    
    public String getText() {
        return text;
    }

    public static int getWidthh() {
        return width;
    }

    public static int getHeightt() {
        return height;
    }

    public static void setWidthh(int w) {
        width = w;
    }
    public void setText(String text) {
        this.text = text;
    }
    
    public void setEActionListener(ActionListener actionListener) {
        btn.addActionListener(actionListener);
    }
}