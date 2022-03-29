
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
	
	public void setAnswer(char answ) {
		corAns = answ;
	}
	
	public void Response(char res) {
		response = res;
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
