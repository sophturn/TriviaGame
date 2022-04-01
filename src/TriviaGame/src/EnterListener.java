import javax.swing.*;
import java.awt.event.*;

public class EnterListener implements KeyListener {

	public void keyPressed(KeyEvent event) {
		String key = KeyStroke.getKeyStrokeForEvent(event).toString();
		key = key.replace("pressed ", "");
		if(key.equals("ENTER")) {
			TriviaGame.board[][].checkAnswer();
		}
	}

	public void keyReleased(KeyEvent event) {}

	public void keyTyped(KeyEvent event) {}

}
