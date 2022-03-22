import java.util.*;
import javax.swing.*;

public class TriviaGame {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	ArrayList<Question> easyQuestions; //0-9 Number, 10-19 Translation, 20-29 Multiple Choice, 30-39 Conjugation
	ArrayList<Question> mediumQuestions; //0-9 Number, 10-19 Translation, 20-29 Multiple Choice, 30-39 Conjugation
	ArrayList<Question> hardQuestions; //0-9 Number, 10-19 Translation, 20-29 Multiple Choice, 30-39 Conjugation
	ArrayList<Question> finalQuestions;
	Tile[][] board = new Tile[6][6];

	public static void main(String[] args) {
		//JFrame
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.setTitle("Spanish Trivia Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}
	
	public void setQuestions() {}
	
	public void drawBoard() {
		for(int i=0; i<6; i++) {
			for(int j=0;j<6;j++) {
				board[i][j] = new Tile("", "");
			}
		} //- this may not work
	}

}
