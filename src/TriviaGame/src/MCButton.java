import java.awt.event.*;
import java.util.Random;

public class MCButton implements ActionListener {
	String lvl;
	Random rand = new Random();
	public void actionPerformed(ActionEvent event) {
		lvl = Question.getLevel();
		System.out.println(lvl);
		Question.display();
		questionReturn();
	}

	public int questionReturn() {
		int questionNumber = rand.nextInt(20, 30);
		return questionNumber;
	}
	
//	public void setLevel(String lv) {
//		level = lv;
//		if(level.equals("easy")) {}
//	}

}
