package edu.ait.model;

public class CalculateOrderTotal {
	
	// Declare double variables to store price of each menu item. Declare quantity (qty) for each item.
	public double price_chicken_burger = 4.5;
	public double qty_chicken_burger = 0;
	public double price_quarter_pounder = 4.5;
	public double qty_quarter_pounder = 0;
	public double price_half_pounder = 6.5;
	public double qty_half_pounder = 6.5;
	public double price_snack_box = 5.5;
	public double qty_snack_box = 0;
	public double price_chicken_goujons = 4.5;
	public double qty_chicken_goujons = 0;
	public double price_chicken_nuggets = 4.5;
	public double qtychicken_nuggets = 0;
	public double price_regular_chips = 3.5;
	public double qty_regular_chips = 0;
	public double price_curry_chips = 4.5;
	public double qty_curry_chips = 0;
	public double price_taco_chips = 4.5;
	public double qty_taco_chips = 0;
	public double price_can_coke = 1.5;
	public double qty_can_coke = 0;
	public double price_can_orange = 1.5;
	public double qty_can_orange = 0;
	public double price_bottle_coke = 2.0;
	public double qty_bottle_coke = 0;
	public double price_bottle_water = 2.0;
	public double qty_bottle_water = 2.0;
	public double item_delivery_charge = 5;
	public double total = 0;
	
	
	// Create getters for each menu item (plus one for delivery) Methods return menu item prices. 
	public double getItem_price_chicken_burger() {
		return price_chicken_burger;
	}
	public double getItem_price_quarter_pounder() {
		return price_quarter_pounder;
	}
	public double getItem_price_half_pounder() {
		return price_half_pounder;
	}
	public double getItem_price_snack_box() {
		return price_snack_box;
	}
	public double getItem_price_chicken_goujons() {
		return price_chicken_goujons;
	}
	public double getItem_price_chicken_nuggets() {
		return price_chicken_nuggets;
	}
	public double getItem_price_regular_chips() {
		return price_regular_chips;
	}
	public double getItem_price_curry_chips() {
		return price_curry_chips;
	}
	public double getItem_price_taco_chips() {
		return price_taco_chips;
	}
	public double getQty_chicken_burger() {
		return qty_chicken_burger;
	}
	public void setQty_chicken_burger(double qty_chicken_burger) {
		this.qty_chicken_burger = qty_chicken_burger;
	}
	public double getQty_quarter_pounder() {
		return qty_quarter_pounder;
	}
	public void setQty_quarter_pounder(double qty_quarter_pounder) {
		this.qty_quarter_pounder = qty_quarter_pounder;
	}
	public double getQty_half_pounder() {
		return qty_half_pounder;
	}
	public void setQty_half_pounder(double qty_half_pounder) {
		this.qty_half_pounder = qty_half_pounder;
	}
	public double getQty_snack_box() {
		return qty_snack_box;
	}
	public void setQty_snack_box(double qty_snack_box) {
		this.qty_snack_box = qty_snack_box;
	}
	public double getQty_chicken_goujons() {
		return qty_chicken_goujons;
	}
	public void setQty_chicken_goujons(double qty_chicken_goujons) {
		this.qty_chicken_goujons = qty_chicken_goujons;
	}
	public double getQtychicken_nuggets() {
		return qtychicken_nuggets;
	}
	public void setQtychicken_nuggets(double qtychicken_nuggets) {
		this.qtychicken_nuggets = qtychicken_nuggets;
	}
	public double getQty_regular_chips() {
		return qty_regular_chips;
	}
	public void setQty_regular_chips(double qty_regular_chips) {
		this.qty_regular_chips = qty_regular_chips;
	}
	public double getQty_curry_chips() {
		return qty_curry_chips;
	}
	public void setQty_curry_chips(double qty_curry_chips) {
		this.qty_curry_chips = qty_curry_chips;
	}
	public double getQty_taco_chips() {
		return qty_taco_chips;
	}
	public void setQty_taco_chips(double qty_taco_chips) {
		this.qty_taco_chips = qty_taco_chips;
	}
	public double getQty_can_coke() {
		return qty_can_coke;
	}
	public void setQty_can_coke(double qty_can_coke) {
		this.qty_can_coke = qty_can_coke;
	}
	public double getQty_can_orange() {
		return qty_can_orange;
	}
	public void setQty_can_orange(double qty_can_orange) {
		this.qty_can_orange = qty_can_orange;
	}
	public double getQty_bottle_coke() {
		return qty_bottle_coke;
	}
	public void setQty_bottle_coke(double qty_bottle_coke) {
		this.qty_bottle_coke = qty_bottle_coke;
	}
	public double getQty_bottle_water() {
		return qty_bottle_water;
	}
	public void setQty_bottle_water(double qty_bottle_water) {
		this.qty_bottle_water = qty_bottle_water;
	}
	public double getItem_price_can_coke() {
		return price_can_coke;
	}
	public double getItem_price_can_orange() {
		return price_can_orange;
	}
	public double getItem_price_bottle_coke() {
		return price_bottle_coke;
	}
	public double getItem_price_bottle_water() {
		return price_bottle_water;
	}
	public double getItem_price_delivery_charge() {
		return item_delivery_charge;
	}
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double totalCharge) {
		
		this.total = total + this.getItem_price_delivery_charge() + totalCharge;

		
	}
	
	
	
	
}
