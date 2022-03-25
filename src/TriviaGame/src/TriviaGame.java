import java.util.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;

public class TriviaGame {
	Scanner in = new Scanner(System.in);
	Random rand = new Random();
	ArrayList<Question> easyQuestions; // 0-9 Number, 10-19 Translation, 20-29 Multiple Choice, 30-39 Conjugation
	ArrayList<Question> mediumQuestions; // 0-9 Number, 10-19 Translation, 20-29 Multiple Choice, 30-39 Conjugation
	ArrayList<Question> hardQuestions; // 0-9 Number, 10-19 Translation, 20-29 Multiple Choice, 30-39 Conjugation
	ArrayList<Question> finalQuestions;

	public static void main(String[] args) throws FileNotFoundException {
//		/* Lines 1-40 hold easy questions
//		 * Lines 41-80 hold medium questions
//		 * Lines 81-120 hold hard questions
//		 * Lines 121-130 hold final questions*/
//		File questions = new File("questions.txt");
//		Scanner sc = new Scanner(questions); //Why?
//		System.out.print(sc.next());
//		while(sc.hasNextLine()) {
//			for(int i=1; i<40;i++) {
//				//easyQuestions<i> = sc.nextLine();
//			}
//			for(int i=40; i<80;i++) {
//				//mediumQuestions<i> = sc.nextLine();
//			}
//			for(int i=80; i<120;i++) {
//				//hardQuestions<i> = sc.nextLine();
//			} for(int i=120; i<130;i++) {
//				//easyQuestions<i> = sc.nextLine();
//			}
//		}
//		sc.close();

		// JFrame
		JFrame frame = new JFrame();
		frame.setSize(615, 638);
		frame.setTitle("Spanish Trivia Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JPanel Board
		JPanel base = new JPanel();
		base.setBounds(0, 0, 600, 600);
		base.setLayout(new GridLayout(6, 6));

		JButton[][] board = new JButton[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == 0 || j == 0 || i == 5 || j == 5) {
					board[i][j] = new JButton();
					board[i][j].setBackground(Color.GREEN);
					base.add(board[i][j]);
				} else if (i == 1 || j == 1 || i == 4 || j == 4) {
					board[i][j] = new JButton();
					board[i][j].setBackground(Color.YELLOW);
					base.add(board[i][j]);
				} else if (i == 2 || j == 2 || i == 3) {
					board[i][j] = new JButton();
					board[i][j].setBackground(Color.RED);
					base.add(board[i][j]);
				}
			}
		}

//		JPanel fin = new JPanel();
//		fin.setBounds(350, 350, 100, 100);
//		fin.setLayout(new GridLayout(1, 1));
//		JButton end = new JButton("FINAL");
//		end.setBounds(350, 350, 100, 100);
//		end.setBackground(Color.PINK);
//		fin.add(end);

		boardComponent component = new boardComponent();
		frame.add(base);
		frame.add(component);

		frame.setVisible(true);
	}

}
