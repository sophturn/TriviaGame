import java.awt.event.*;
import java.util.Random;

public class NumButton implements ActionListener {
	static Random rand = new Random();
	String lvl;
	public void actionPerformed(ActionEvent event) {
		lvl = Question.getLevel();
		System.out.println(lvl);
		//Question.display();
		questionReturn();
	}

	public static int questionReturn() {
	int questionNumber = rand.nextInt(10);
	return questionNumber;
}
	
//	public void setLevel(String lv) {
//		level = lv;
//		if(level.equals("easy")) {}
//	}

}
