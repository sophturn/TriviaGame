import java.util.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

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
		frame.setVisible(true);
		
		// JPanel Board
		JPanel base = new JPanel();
		base.setBounds(0, 0, 600, 600);
		base.setLayout(new GridLayout(6, 6));
		frame.add(base);
		ButtonClickListener listener = new ButtonClickListener();
		JButton[][] board = new JButton[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == 0 || j == 0 || i == 5 || j == 5) {
					board[i][j] = new JButton();
					board[i][j].setBackground(Color.GREEN);
					board[i][j].addActionListener(listener);
					base.add(board[i][j]);
				} else if (i == 1 || j == 1 || i == 4 || j == 4) {
					board[i][j] = new JButton();
					board[i][j].setBackground(Color.YELLOW);
					board[i][j].addActionListener(listener);
					base.add(board[i][j]);
				} else if (i == 2 || j == 2 || i == 3) {
					board[i][j] = new JButton();
					board[i][j].setBackground(Color.RED);
					board[i][j].addActionListener(listener);
					base.add(board[i][j]);
				}
			}
		}
		//Setting text for the Buttons
		board[0][0].setText("Translate");
		board[4][0].setText("Translate");
		board[0][4].setText("Translate");
		board[5][3].setText("Translate");
		board[3][5].setText("Translate");
		board[3][1].setText("Translate");
		board[1][3].setText("Translate");
		board[4][4].setText("Translate");
		board[2][2].setText("Translate");
		board[1][0].setText("Number");
		board[5][0].setText("Number");
		board[0][3].setText("Number");
		board[5][4].setText("Number");
		board[2][5].setText("Number");
		board[3][2].setText("Number");
		board[2][1].setText("Number");
		board[1][0].setText("Number");
		board[1][4].setText("Number");
		board[4][3].setText("Number");
		board[2][0].setText("Verb");
		board[2][4].setText("Verb");
		board[3][3].setText("Verb");
		board[1][1].setText("Verb");
		board[4][2].setText("Verb");
		board[5][1].setText("Verb");
		board[5][5].setText("Verb");
		board[1][5].setText("Verb");
		board[0][2].setText("Verb");
		board[2][3].setText("Choice");
		board[0][1].setText("Choice");
		board[0][5].setText("Choice");
		board[3][0].setText("Choice");
		board[3][4].setText("Choice");
		board[1][2].setText("Choice");
		board[4][1].setText("Choice");
		board[4][5].setText("Choice");
		board[5][2].setText("Choice");

//		JPanel fin = new JPanel();
//		fin.setBounds(350, 350, 100, 100);
//		fin.setLayout(new GridLayout(1, 1));
//		JButton end = new JButton("FINAL");
//		end.setBounds(350, 350, 100, 100);
//		end.setBackground(Color.PINK);
//		fin.add(end);

//		boardComponent component = new boardComponent();
//		frame.add(component);
		
		
	}

}
