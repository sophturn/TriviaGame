import java.awt.*;
import javax.swing.JComponent;

public class boardComponent extends JComponent {

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Tile[][] board = new Tile[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == 0 || j == 0 || i == 5 || j == 5) {
					board[i][j] = new Tile("easy", "");
					board[i][j].draw(g2, i * 100, j * 100, 100, 100, "green");
				} else if (i == 1 || j == 1 || i == 4 || j == 4) {
					board[i][j] = new Tile("medium", "");
					board[i][j].draw(g2, i * 100, j * 100, 100, 100, "yellow");
				} else if (i == 2 || j == 2 || i == 3) {
					board[i][j] = new Tile("hard", "");
					board[i][j].draw(g2, i * 100, j * 100, 100, 100, "red");
				}
			}
		}
		Tile fin = new Tile("final", "final");
		fin.draw(g2, 251, 252, 100, 100, "pink");

	}

}
