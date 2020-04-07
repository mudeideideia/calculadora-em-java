import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
public class NumbersButtonPainel{

    JPanel panel;
    MyButton myButton;

    public NumbersButtonPainel() {
        this.panel = new JPanel();
        this.panel.setLayout(null);
        this.panel.setBackground(new ColorUIResource(25, 25, 25));
        this.panel.setBounds(15, 150, 250, 280);

        MyButton.setWidthh(50);
        MyButton.setHeightt(50);
		myButton  = new MyButton(100, 100, "o");
		myButton.setEActionListener(new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("evento");
            }
        });

        this.panel.add(myButton.getButton());

        String[] simblesString = {"1", "2", "+"};
		for (int i = 0; i < simblesString.length; i++) {
			myButton = new MyButton(
                15 + 50*i, 15,
                simblesString[i]);
			this.panel.add(myButton.getButton());
		}
    }

    public JPanel getPanel() {
        return panel;
    }
}