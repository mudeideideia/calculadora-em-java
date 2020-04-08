import java.awt.Font;
import java.awt.Insets;
import java.awt.ComponentOrientation;
import java.awt.Color;

import javax.swing.JTextArea;

public class TextAreaPanel {

    private JTextArea outPut;
	private int marginLeft =15;
	private int marginTop = 15;
	private int width = 400;
    
    public TextAreaPanel () {
        outPut = new JTextArea();
		outPut.setBounds(marginLeft, marginTop, width-2*marginLeft, 50);
		outPut.setColumns(35);
		outPut.setRows(2);
		outPut.setFont(new Font("Tahoma", Font.PLAIN, 18));
		outPut.setMargin(new Insets(5, 5, 5, 5));
		outPut.setCaretColor(Color.WHITE);
		outPut.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		outPut.setText("0\n0");
    }

    public JTextArea getJTextArea() {
        return outPut;
    }
}