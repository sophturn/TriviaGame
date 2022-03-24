
public abstract class Question {
	boolean correct = false;
	String answer, question, correctAnswer;
	public Question() {}
	
	public void display() {
		//display the question (String question)
	}
	
	public void setAnswer(String answ) {
		correctAnswer = answ;
	}
	
	public boolean checkAnswer() {
		if(answer.equals(correctAnswer)) {
			correct = true;
		} else {
			correct = false;
		}
		return correct;
	}
	
}
