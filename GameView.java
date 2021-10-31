
/**
 * @author Steven Taylor & Gabe Webb
 */
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameView extends JFrame {
	private GameModel model;
	static JPanel shopPanel;
	private JPanel shopOptions;
	private JPanel balPanel;

	private JTextField balField;

	private JList buyList;
	private JScrollPane upgradeScroll;

	private static final String[] upgrades = { "House", "Workshop", "Factory" };
	JLabel cookieLabel;
	JButton increaseCookiesButton;
	JButton button;
	JButton houseButton;
	JButton workshopButton;
	JButton factoryButton;

	JLabel clickerLabel;
	JButton increaseClickerButton;

	public GameView(GameModel model) {

		super("Cookie Cutter");
		// TODO Auto-generated constructor stub
		this.model = model;
		setLayout(new BorderLayout());

		setBackground(Color.CYAN);

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		cookieLabel = new JLabel("Cookies: " + model.getCookies());
		clickerLabel = new JLabel("Clicker Level: " + model.getClicker());
		button = new JButton("Make Cookie");
		houseButton = new JButton("Buy House Cost: " + model.getHouseCost());
		workshopButton = new JButton("Workshop Cost: " + model.getWorkshopCost());
		factoryButton = new JButton("Factory - Cost: " + model.getFactoryCost());
		shopPanel = new JPanel(new BorderLayout()); // Upgrades
		shopOptions = new JPanel(new GridLayout(3, 1));
		
		add(cookieLabel, BorderLayout.CENTER);
		add(clickerLabel, BorderLayout.NORTH);
		add(button, BorderLayout.SOUTH);

		// Upgrades list

		// Upgrades
		add(shopPanel, BorderLayout.EAST);
		shopPanel.add(shopOptions, BorderLayout.CENTER);
		if(model.getClicker() < 8) {
		shopOptions.add(houseButton);
		}
		shopOptions.add(workshopButton);
		shopOptions.add(factoryButton);

//		buyList = new JList(upgrades);
//		buyList.setVisibleRowCount(3);
//		buyList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		upgradeScroll = new JScrollPane(buyList);
//		listPanel.add(upgradeScroll, BorderLayout.CENTER);
//		listPanel.setSize(150, 150);
//		upgradeScroll.setSize(100, 100);


	} // end constructor

	public void registerListener(GameController controller) {
		// TODO Auto-generated method stub
		button.addActionListener(controller);
		
		houseButton.addActionListener(controller);
		workshopButton.addActionListener(controller);
		factoryButton.addActionListener(controller);
		
		// buyList.addListSelectionListener(controller);
		

	}
}
