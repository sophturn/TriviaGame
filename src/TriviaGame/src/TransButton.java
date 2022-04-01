import java.awt.event.*;
import java.util.Random;

public class TransButton implements ActionListener {
	Random rand = new Random();
	String lvl;
	public void actionPerformed(ActionEvent event) {
		lvl = Question.getLevel();
		questionReturn();
	}

	public int questionReturn() {
		int questionNumber = rand.nextInt(10, 20);
		return questionNumber;
	}
	
//	public void setLevel(String lv) {
//		level = lv;
//		if(level.equals("easy")) {}
//	}

}
