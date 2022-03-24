import java.awt.*;

public class Tile {
	String level, questionType;
	
	public Tile(String lv, String quesType) {
		level = lv;
		questionType = quesType;
	}
	
	public void draw(Graphics2D g2, int x1, int y1, int x2, int y2) {
		Rectangle square = new Rectangle(x1,y1,x2,y2);
		if(level.equals("easy")) {
			//Set color green
		}else if(level.equals("medium")) {
			//set color yellow
		}else if(level.equals("hard")) {
			//set color red
		}else if(level.equals("final")) {
			//Set color purple
			//remove boarder
		}
		g2.draw(square);
	}

}
