import java.awt.*;
import java.awt.event.*;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.*;

/**
 * 
 * @author Steven Taylor & Gabe Webb
 */
public class GameController implements ActionListener {
	private GameModel model;
	private JButton input;
	private GameView view;
	public GameController(GameModel model, GameView view) {
		// TODO Auto-generated constructor stub
		this.model = model;
		this.view = view;
	}


	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		String label = event.getActionCommand();
		// System.out.println(label);
		if (label.equals("Make Cookie")) {
			int old = model.getCookies();
			old += model.getClicker();
			model.setCookies(old);
			if (model.getCookies() >= 1000) {
				JOptionPane.showMessageDialog(GameView.shopPanel,"Congrats you win!");
			}

		} else if (label.equals("Buy House Cost: " + model.getHouseCost())) {
			if (model.getCookies() >= model.getHouseCost()) {
				// Subtract cost
				int old = model.getCookies();
				
				old -= model.getHouseCost();
				model.setCookies(old);
				// Upgrade clicker
				int oldClick = model.getClicker();
				oldClick += 1;
				model.setClicker(oldClick);
				int cost = model.getHouseCost() +10;
				model.setHouseCost(cost);
				JOptionPane.showMessageDialog(GameView.shopPanel,"House Upgrade Unlocked!");
			}
		} else if (label.equals("Workshop Cost: " + model.getWorkshopCost())) {
			if (model.getCookies() >= 125) {
				// Subtract cost
				int old = model.getCookies();
				old -= model.getWorkshopCost();
				model.setCookies(old);
				// Upgrade clicker
				int oldClick = model.getClicker();
				oldClick += 2;
				model.setClicker(oldClick);
				int cost = model.getWorkshopCost() *2 ;
				model.setWorkshopCost(cost);
				JOptionPane.showMessageDialog(GameView.shopPanel,"Workshop Upgrade Unlocked!");
			}
		} else if (label.equals("Factory - Cost: " + model.getFactoryCost())) {
			if (model.getCookies() >= 125) {
				// Subtract cost
				int old = model.getCookies();
				old -= model.getFactoryCost();
				model.setCookies(old);
				// Upgrade clicker
				int oldClick = model.getClicker();
				oldClick += 4;
				model.setClicker(oldClick);
				int cost = model.getFactoryCost() * 4;
				model.setFactoryCost(cost);
				JOptionPane.showMessageDialog(GameView.shopPanel,"Factory Upgrade Unlocked!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Error", "I couldn't bake the cookie", JOptionPane.ERROR_MESSAGE);
		}

		java.util.Timer actualizeProgress = new java.util.Timer();
		actualizeProgress.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				view.cookieLabel.setText("Cookies: " + model.getCookies());
				view.clickerLabel.setText("Clicker Level: " + model.getClicker());
				//new button updates

				view.houseButton.setText("Buy House Cost: " + model.getHouseCost());
				view.workshopButton.setText("Workshop Cost: " + model.getWorkshopCost());
				view.factoryButton.setText("Factory - Cost: " + model.getFactoryCost());

			}
		}, 0, 25);
	}
}