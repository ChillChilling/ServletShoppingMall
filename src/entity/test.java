package entity;

import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;

public class test {
	public static void main(String[] args) {
		Items i1 = new Items(1,"ÎÖÌØÀºÇòĞ¬","ÎÂÖİ",200,500,"001.jpg");
		Items i2 = new Items(2,"ÀîÄşÀºÇòĞ¬","¹ãÖİ",300,500,"002.jpg");
		Items i3 = new Items(1,"ÎÖÌØÀºÇòĞ¬","ÎÂÖİ",200,500,"001.jpg");
		Cart cart = new Cart();
		cart.addGoodsInCart(i1, 1);
		cart.addGoodsInCart(i2, 2);
		cart.addGoodsInCart(i1, 3);
		System.out.println("TotalPrice:"+cart.getTotalPrice());

		
		Set<Entry<Items, Integer>> iSet = cart.getGoods().entrySet();
		Iterator<Entry<Items, Integer>> iterator = iSet.iterator();
		while (iterator.hasNext()) {
			Entry<Items, Integer> itemEntry = iterator.next();
			System.out.println(itemEntry.getKey());
			
		}
	}
}
