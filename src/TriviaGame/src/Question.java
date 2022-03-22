
public abstract class Question {
	boolean correct = false;
	String answer;
	String question;
	public Question() {}
	
	public void display() {
		//display the question (String question)
	}
	
	public void setAnswer() {}
	
	public boolean checkAnswer() {
		return correct;
	}
	
	public String getAnswer() {
		return answer;
	}

}
