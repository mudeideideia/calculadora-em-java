import javax.swing.JButton;
import java.awt.Color;

import java.awt.event.ActionListener;

public class MyButton {

    private String text = "X";
    private JButton btn; 
    private int xpos;
    private int ypos;
    private static int width = 50;
    private static int height = 50;
    // private ActionListener eActionListener;

    public MyButton(int xpos, int ypos, String text) {
        this.xpos = xpos;
        this.ypos = ypos;
        this.text = text;
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

    public static void setHeightt(int h) {
        height = h;
    }
    public void setText(String text) {
        this.text = text;
    }
    
    public void setEActionListener(ActionListener actionListener) {
        btn.addActionListener(actionListener);
    }
}