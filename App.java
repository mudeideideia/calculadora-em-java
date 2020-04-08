import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import java.awt.EventQueue;


public class App extends JFrame {

	private JPanel basePanel;
	private int width = 400;
	private int height = 500;

	private TextAreaPanel outPut;
	private NumbersButtonPainel numpanel;

	private CalcManager calc;
	

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
		calc = new CalcManager();
		outPut = new TextAreaPanel();
		numpanel =  new NumbersButtonPainel(calc.getNumberListener());
		
		
		basePanel =  new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1500, 300, width, height);


		basePanel.setBackground(Color.DARK_GRAY);
		basePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		basePanel.setLayout(null);
		
		
		
		add(basePanel);
		basePanel.add(outPut.getJTextArea());
		basePanel.add(numpanel);
		
	}

}