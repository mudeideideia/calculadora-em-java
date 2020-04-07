import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import java.awt.ComponentOrientation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;


public class App extends JFrame {

	private JPanel basePanel;
	private int width = 400;
	private int height = 500;

	private int marginLeft =15;
	private int marginTop = 15;

	private JTextArea outPut;

	private JButton btn;
	
	private NumbersButtonPainel numpanel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public App() {
		basePanel =  new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1500, 300, width, height);


		basePanel.setBackground(Color.DARK_GRAY);
		basePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		basePanel.setLayout(null);

		add(basePanel);

		outPut = new JTextArea();
		outPut.setBounds(marginLeft, marginTop, width-2*marginLeft, 50);
		outPut.setColumns(35);
		outPut.setRows(2);
		outPut.setFont(new Font("Tahoma", Font.PLAIN, 18));
		outPut.setMargin(new Insets(5, 5, 5, 5));
		outPut.setCaretColor(Color.WHITE);
		outPut.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		outPut.setText("0\n0");
		basePanel.add(outPut);

		numpanel =  new NumbersButtonPainel();

		basePanel.add(numpanel.getPanel());



		// String[] simblesString = {"1", "2", "+"};
		// for (int i = 0; i < simblesString.length; i++) {
		// 	btn = new JButton();
		// 	btn.setText(simblesString[i]);
		// 	btn.setBounds(15 + 50*i, 200, 50, 50);
		// 	btn.setForeground(Color.ORANGE);
		// 	btn.setBackground(Color.WHITE);
		// 	basePanel.add(btn);
		// }
		
	}



}