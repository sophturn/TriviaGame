
public class NumberQuestion extends Question{
	int response;
	
	public NumberQuestion(String desc, int ans) {
		question = desc;
		response = ans;
	}
	
	public String getAnswer() {
		answer = Integer.toString(response);
		return answer;
	}

}
