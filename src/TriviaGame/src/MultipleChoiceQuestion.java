
public class MultipleChoiceQuestion extends Question{
	char response;
	String choice;
	public MultipleChoiceQuestion(String desc, char ans) {
		question = desc;
		response = ans;
	}
	
	public void addChoice(String ch) {
		choice = ch;
		question += "\n" +choice;
	}
	
	public void display() {} //finish this one
	
	public String getAnswer() {
		Character.toString(response);
		return answer;
	}

}
