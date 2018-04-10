package entity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Cart {
	private HashMap<Items, Integer> goods;
	private Double totalPrice;
	public Cart() {
		// TODO Auto-generated constructor stub
		goods = new HashMap<>();
		totalPrice = 0.0;
	}
	/**
	 * @return the goods
	 */
	public HashMap<Items, Integer> getGoods() {
		return goods;
	}
	/**
	 * @param goods the goods to set
	 */
	public void setGoods(HashMap<Items, Integer> goods) {
		this.goods = goods;
	}
	/**
	 * @return the totalPrice
	 */
	public Double getTotalPrice() {
		return calTotalPrice();
	}
	public boolean addGoodsInCart(Items items, int num){
		if (goods.containsKey(items)) {
			num += goods.get(items);
		}
		goods.put(items, num);
		return true;
	}
	public boolean removeGoodsFromCart(Items items){
		goods.remove(items);
		return true;
	}
	public double calTotalPrice(){
		double sum = 0.0;
		Set<Items> itemSet = goods.keySet();
		Iterator<Items> iterator = itemSet.iterator();
		while (iterator.hasNext()) {
			Items items = iterator.next();
			sum += goods.get(items)*items.getPrice();
		}
		return sum;
	}

}
