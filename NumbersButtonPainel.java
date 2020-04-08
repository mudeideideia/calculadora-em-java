import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

import java.awt.event.ActionListener;

public class NumbersButtonPainel extends JPanel{

    MyButton myButton;

    public NumbersButtonPainel(ActionListener aE) {
        setLayout(null);
        setBackground(new ColorUIResource(25, 25, 25));
        setBounds(15, 150, 250, 280);

        MyButton.setWidthh(50);
        MyButton.setHeightt(50);
        MyButton.setEActionListener(aE);

		add(new MyButton(15 +   0,  15, "1"));
		add(new MyButton(15 +  50,  15, "2"));
		add(new MyButton(15 + 100,  15, "3"));
		add(new MyButton(15 +   0,  65, "4"));
		add(new MyButton(15 +  50,  65, "5"));
		add(new MyButton(15 + 100,  65, "6"));
		add(new MyButton(15 +   0, 115, "7"));
		add(new MyButton(15 +  50, 115, "8"));
		add(new MyButton(15 + 100, 115, "9"));
    }

}