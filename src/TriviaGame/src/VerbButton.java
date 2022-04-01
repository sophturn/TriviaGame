import java.awt.event.*;
import java.util.Random;

public class VerbButton implements ActionListener {
	Random rand = new Random();
	String lvl;

	public void actionPerformed(ActionEvent event) {
		lvl = Question.getLevel();
		System.out.println(lvl);
		Question.display();
		questionReturn();
	}

	public int questionReturn() {
		int questionNumber = rand.nextInt(30, 40);
		return questionNumber;
	}

//	public void setLevel(String lv) {
//		level = lv;
//		if(level.equals("easy")) {}
//	}

}
