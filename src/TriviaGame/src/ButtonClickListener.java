import java.awt.event.*;
import java.util.Random;

public class ButtonClickListener implements ActionListener {
	String lvl;
	public void actionPerformed(ActionEvent event) {
		lvl = Question.getLevel();
		System.out.println(lvl);
		Question.display();
		
	}

//	public int questionReturn(int numb) {
//		int questionNumber = numb;
//		return questionNumber;
//	}
	
//	public void setLevel(String lv) {
//		level = lv;
//		if(level.equals("easy")) {}
//	}

}
