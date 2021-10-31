import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


/**

 * @author Steven Taylor & Gabe Webb
 */
public class GameMVC {
	/**
	 * main method starts the application
	 */
	public static void main(String[] args) {

			GameModel model = new GameModel();
			GameView view = new GameView(model);
			GameController controller = new GameController(model, view);
			view.registerListener(controller);
			view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			view.setSize(400, 300);
			view.setVisible(true);
		}


	}

