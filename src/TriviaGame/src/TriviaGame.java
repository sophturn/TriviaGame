import java.util.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class TriviaGame {
	Scanner in = new Scanner(System.in);
	static Random rand = new Random();
	static int quesNum;
	static String asking, level, quesType, response, qTBA;
	static ArrayList<Question> easyQuestions = new ArrayList<Question>(40); // 0-9 Number, 10-19 Translation, 20-29 Multiple Choice, 30-39 Conjugation
	static ArrayList<Question> mediumQuestions = new ArrayList<Question>(40); // 0-9 Number, 10-19 Translation, 20-29 Multiple Choice, 30-39 Conjugation
	static ArrayList<Question> hardQuestions = new ArrayList<Question>(40); // 0-9 Number, 10-19 Translation, 20-29 Multiple Choice, 30-39 Conjugation
	static ArrayList<Question> finalQuestions = new ArrayList<Question>(10);
	static JTextField ques = new JTextField();

	public static void main(String[] args) throws FileNotFoundException {
		/* Lines 1-40 hold easy questions
		 * Lines 41-80 hold medium questions
		 * Lines 81-120 hold hard questions
		 * Lines 121-130 hold final questions*/
		File questions = new File("C:\\Users\\sophi\\OneDrive\\Desktop\\Programming\\TriviaGame\\src\\questions.txt");
		Scanner quesScan = new Scanner(questions);
		while (quesScan.hasNextLine()) {
			for (int i = 0; i < 40; i++) {
				if (i < 10) {
					Question qi = new NumberQuestion();
					easyQuestions.add(qi);
				} else if (i >= 10 && i < 20) {
					Question qi = new Question();
					easyQuestions.add(qi);
				} else if (i >= 20 && i < 30) {
					Question qi = new MultipleChoiceQuestion();
					easyQuestions.add(qi);
				} else if (i >= 30) {
					Question qi = new Question();
					easyQuestions.add(qi);
				}
				easyQuestions.get(i).setQuestion(quesScan.nextLine(), "easy");
			}
			for (int i = 0; i < 40; i++) {
				if (i < 10) {
					Question qi = new NumberQuestion();
					mediumQuestions.add(qi);
				} else if (i >= 10 && i < 20) {
					Question qi = new Question();
					mediumQuestions.add(qi);
				} else if (i >= 20 && i < 30) {
					Question qi = new MultipleChoiceQuestion();
					mediumQuestions.add(qi);
				} else if (i >= 30) {
					Question qi = new Question();
					mediumQuestions.add(qi);
				}
				mediumQuestions.get(i).setQuestion(quesScan.nextLine(), "medium");
			}
			for (int i = 0; i < 40; i++) {
				if (i < 10) {
					Question qi = new NumberQuestion();
					hardQuestions.add(qi);
				} else if (i >= 10 && i < 20) {
					Question qi = new Question();
					hardQuestions.add(qi);
				} else if (i >= 20 && i < 30) {
					Question qi = new MultipleChoiceQuestion();
					hardQuestions.add(qi);
				} else if (i >= 30) {
					Question qi = new Question();
					hardQuestions.add(qi);
				}
				hardQuestions.get(i).setQuestion(quesScan.nextLine(), "hard");
			}
			for (int i = 0; i < 10; i++) {
				Question qi = new Question();
				finalQuestions.add(qi);
				finalQuestions.get(i).setQuestion(quesScan.nextLine(), "final");
			}
		}
		quesScan.close();

		File answers = new File("C:\\Users\\sophi\\OneDrive\\Desktop\\Programming\\TriviaGame\\src\\answers.txt");
		Scanner ansScan = new Scanner(answers);
		while (ansScan.hasNextLine()) {
			for (int i = 0; i < 40; i++) {
				easyQuestions.get(i).setAnswer(ansScan.nextLine());
			}
			for (int i = 0; i < 40; i++) {
				mediumQuestions.get(i).setAnswer(ansScan.nextLine());
			}
			for (int i = 0; i < 40; i++) {
				hardQuestions.get(i).setAnswer(ansScan.nextLine());
			}
			for (int i = 0; i < 10; i++) {
				finalQuestions.get(i).setAnswer(ansScan.nextLine());
			}
		}
		ansScan.close();

		// JFrame
		JFrame frame = new JFrame();
		frame.setSize(615, 638);
		frame.setTitle("Spanish Trivia Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		// JPanel Instructions
		JPanel instructions = new JPanel();
		instructions.setBounds(0, 0, 600, 600);
		instructions.setLayout(new BorderLayout());
		JLabel instruct = new JLabel("INSTRUCTIONS:");
		instruct.setAlignmentX(500);
		instruct.setAlignmentY(200);
		JLabel instructWords = new JLabel(
				"Choose a type of question from the oustide green ring. Answer this question, then choose another one.");
		JLabel instructWCont = new JLabel("You will move in for correct answers and out for incorrect ones.");
		JLabel instructNum = new JLabel(
				"For Number Questions, type in the integer value with no punctuation (example: 698)");
		JLabel instructMC = new JLabel(
				"For Multiple Choice Questions, type in only the capitalized letter (example: C)");
		JLabel instructVerb = new JLabel(
				"For Verb Conjugation Questions, type in both the person and conjugated verb with no capitalization (example: yo creo)");
		JLabel instructTrans = new JLabel(
				"For Translation Questions, type in only the word with no capitalization (example: lago)");
		instructions.setBackground(Color.CYAN);
		instructions.add(instruct);
//		 instructions.add(instructWords, BorderLayout.CENTER);
//		 instructions.add(instructWCont, BorderLayout.SOUTH);
		//frame.add(instructions);
		
		//Question Field
		frame.add(ques, BorderLayout.NORTH);

		// JPanel Board
		JPanel base = new JPanel();
		base.setBounds(0, 0, 600, 600);
		base.setLayout(new GridLayout(6, 6));
		frame.add(base, BorderLayout.CENTER);
		EasyButtonListener easyListener = new EasyButtonListener();
		MediumButtonListener mediumListener = new MediumButtonListener();
		HardButtonListener hardListener = new HardButtonListener();
		JButton[][] board = new JButton[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == 0 || j == 0 || i == 5 || j == 5) {
					board[i][j] = new JButton();
					board[i][j].setBackground(Color.GREEN);
					board[i][j].addActionListener(easyListener);
					base.add(board[i][j]);
				} else if (i == 1 || j == 1 || i == 4 || j == 4) {
					board[i][j] = new JButton();
					board[i][j].setBackground(Color.YELLOW);
					board[i][j].addActionListener(mediumListener);
					base.add(board[i][j]);
				} else if (i == 2 || j == 2 || i == 3) {
					board[i][j] = new JButton();
					board[i][j].setBackground(Color.RED);
					board[i][j].addActionListener(hardListener);
					base.add(board[i][j]);
				}
			}
		}
		// Setting text for the Buttons
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

	}
	
	public static void setQuestion(int number, String l, String t) {
		if(l.equals("easy")) {
			qTBA = easyQuestions.get(number).display();
		} else if(l.equals("medium")) {
			qTBA = mediumQuestions.get(number).display();
		} else if (l.equals("hard")) {
			qTBA = hardQuestions.get(number).display();
		} else {
			qTBA = finalQuestions.get(number).display();
		}
		addQuestion(qTBA);
	}
	
	public static void addQuestion(String qA) {
		ques.setText("Question: "+qA);
	}
	

}
