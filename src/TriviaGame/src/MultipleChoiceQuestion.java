
public class MultipleChoiceQuestion extends Question{
	char response, corAns;
	String choice;
	public MultipleChoiceQuestion(String desc, char ans, char cAns) {
		question = desc;
		response = ans;
		corAns = cAns;
	}
	
	public void addChoice(String ch) {
		choice = ch;
		question += "\n" +choice;
	}
	
	public void display() {} //finish this one
	
	public void setAnswer(String answ) {
		response = answ.charAt(0);
		super.setAnswer(answ);
	}
	
	public boolean checkAnswer() {
		if(corAns == response) {
			correct = true;
		} else {
			correct = false;
		} 
		return correct;
	}

}
