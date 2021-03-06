import java.awt.event.*;
import java.util.Random;

public class HardButtonListener implements ActionListener {
	String lvl, quesType;
	public void actionPerformed(ActionEvent event) {
		lvl = "hard";
		Random rand = new Random();
		quesType = event.getActionCommand();
		int number = rand.nextInt(10);
		if(quesType.equals("Translation")) {
			number+=10;
		} else if(quesType.equals("Choice")) {
			number+=20;
		} else if(quesType.equals("Verb")) {
			number+=30;
		}
		TriviaGame.setQuestion(number, lvl, quesType);
	}

}
