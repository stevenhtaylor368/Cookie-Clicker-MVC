import java.awt.*;

/**
 * 
 * @author Steven Taylor & Gabe Webb
 */
public class GameModel {

	private int cookies = 0;
	private int clicker = 1;
	private int clickerPrice = 20;
	private int houseCost = 25;
	private int workshopCost = 125;
	private int factoryCost = 200;

	public int getCookies() {
		return this.cookies;
	}

	public void setCookies(int cookies) {
		this.cookies = cookies;
	}

	public int getClicker() {
		return clicker;
	}

	public void setClicker(int clicker) {
		this.clicker = clicker;
	}

	public int getClickerPrice() {
		return clickerPrice;
	}

	public void setClickerPrice(int clickerPrice) {
		this.clickerPrice = clickerPrice;
	}

	public int getHouseCost() {
		return houseCost;
	}

	public void setHouseCost(int houseCost) {
		this.houseCost = houseCost;
	}

	public int getWorkshopCost() {
		return workshopCost;
	}

	public void setWorkshopCost(int workshopCost) {
		this.workshopCost = workshopCost;
	}

	public int getFactoryCost() {
		return factoryCost;
	}

	public void setFactoryCost(int factoryCost) {
		this.factoryCost = factoryCost;
	}


}