import java.awt.event.*;
import java.util.Random;

public class NumButton implements ActionListener {
	static Random rand = new Random();
	String lvl;

	public void actionPerformed(ActionEvent event) {
		lvl = Question.getLevel();
		System.out.println(lvl);
		TriviaGame.quesNum = questionReturn();
		String tesst = TriviaGame.easyQuestions.get(TriviaGame.quesNum).display();
		System.out.print(tesst);
	}

	public static int questionReturn() {
		int questionNumber = rand.nextInt(10);
		return questionNumber;
	}

}
