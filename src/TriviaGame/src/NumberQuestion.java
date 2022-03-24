
public class NumberQuestion extends Question{
	int response;
	int corAns;
	
	public NumberQuestion() {}
	
	public void setAnswer(String answ) {
		corAns = Integer.parseInt(answ);
	}
	
	public void Response(String res) {
		response = Integer.parseInt(res);
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
