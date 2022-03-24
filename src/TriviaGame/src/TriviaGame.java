import java.util.*;
import javax.swing.*;
import java.io.*;

public class TriviaGame {
	Scanner in = new Scanner(System.in);
	Random rand = new Random();
	ArrayList<Question> easyQuestions; //0-9 Number, 10-19 Translation, 20-29 Multiple Choice, 30-39 Conjugation
	ArrayList<Question> mediumQuestions; //0-9 Number, 10-19 Translation, 20-29 Multiple Choice, 30-39 Conjugation
	ArrayList<Question> hardQuestions; //0-9 Number, 10-19 Translation, 20-29 Multiple Choice, 30-39 Conjugation
	ArrayList<Question> finalQuestions;

	public static void main(String[] args) throws FileNotFoundException{
		/* Lines 1-40 hold easy questions
		 * Lines 41-80 hold medium questions
		 * Lines 81-120 hold hard questions
		 * Lines 121-130 hold final questions*/
		File questions = new File("questions.txt");
		Scanner sc = new Scanner(questions); //Why?
		System.out.print(sc.next());
		while(sc.hasNextLine()) {
			for(int i=1; i<40;i++) {
				//easyQuestions<i> = sc.nextLine();
			}
			for(int i=40; i<80;i++) {
				//mediumQuestions<i> = sc.nextLine();
			}
			for(int i=80; i<120;i++) {
				//hardQuestions<i> = sc.nextLine();
			} for(int i=120; i<130;i++) {
				//easyQuestions<i> = sc.nextLine();
			}
		}
		sc.close();
		//JFrame
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.setTitle("Spanish Trivia Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Board
		Tile[][] board = new Tile[6][6];
		for(int i=0; i<6; i++) {
			for(int j=0;j<6;j++) {
				board[i][j] = new Tile("", "");
			}
		} //this may not work
		
		frame.setVisible(true);
	}	

}
