//Encompasses both Translation and Conjugation questions.

public class Question {
	boolean correct = false;
	String answer, question, correctAnswer;
	public Question() {}
	
	public void display() {
		//display the question (String question)
	}
	
	public void setQuestion(String desc) {
		question = desc;
	}
	
	public void setAnswer(String answ) {
		correctAnswer = answ;
	}
	
	public void Response(String res) {
		answer = res;
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
