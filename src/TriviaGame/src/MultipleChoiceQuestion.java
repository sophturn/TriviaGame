
public class MultipleChoiceQuestion extends Question{
	char response, corAns;
	String choice;
	public MultipleChoiceQuestion() {
	}
	
	public void addChoice(String ch) {
		choice = ch;
		question += "\n" +choice;
	}
	
	public String display(String ques) {
		//display question (super.display();)
		//display answer choices
		question = ques;
		return question;
	} //finish this one
	
	public void setAnswer(String answ) {
		corAns = answ.charAt(0);
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
