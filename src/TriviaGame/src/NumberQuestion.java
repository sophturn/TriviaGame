
public class NumberQuestion extends Question{
	int response;
	int corAns;
	
	public NumberQuestion(String desc, int ans) {
//		question = desc;
//		response = ans;
	}
	
	public void setAnswer(String answ) {
		response = Integer.parseInt(answ);
		super.setAnswer(answ);
	}
	
	public boolean checkAnswer() {
		if(response == corAns) {
			correct = true;
		} else {
			correct = false;
		}
		return correct;
	}

}
