import java.awt.*;
import javax.swing.*;

public class Tile {
	String level, questionType, color;

	public Tile(String lv, String quesType) {
		level = lv;
		questionType = quesType;
	}

	public void draw(Graphics2D g2, int x1, int y1, int x2, int y2, String cr) {
		color = cr;
		Rectangle square = new Rectangle(x1, y1, x2, y2);
		if (color.equals("green")) {
			g2.setColor(Color.GREEN);
		} else if (color.equals("yellow")) {
			g2.setColor(Color.YELLOW);
		} else if (color.equals("red")) {
			g2.setColor(Color.RED);
		} else if (color.equals("pink")) {
			g2.setColor(Color.PINK);
		}
		g2.fill(square);
		g2.setColor(Color.BLACK);
		g2.draw(square);
	}
	
	public void setQType(String qT) {
		questionType = qT;
	}

}
