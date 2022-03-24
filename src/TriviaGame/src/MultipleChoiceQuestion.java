
public class MultipleChoiceQuestion extends Question{
	char response, corAns;
	String choice;
	public MultipleChoiceQuestion() {
	}
	
	public void addChoice(String ch) {
		choice = ch;
		question += "\n" +choice;
	}
	
	public void display() {
		//display question (super.display();)
		//display answer choices
	} //finish this one
	
	public void setAnswer(String answ) {
		corAns = answ.charAt(0);
		super.setAnswer(answ);
	}
	
	public void Response(String res) {
		response = res.charAt(1);
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
