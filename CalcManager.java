import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcManager {

    private ActionListener numberListener;

    public CalcManager() {
        numberListener =  new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof MyButton ) {
                    System.out.println(((MyButton) e.getSource()).getText());
                } else {
                    System.out.println("Esse evento não veio de um botão.");
                }
                
            };
        };
    
    }
    public ActionListener getNumberListener() {
        return numberListener;
    }

}