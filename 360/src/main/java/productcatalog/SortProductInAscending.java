package productcatalog;

import java.util.Set;
import java.util.TreeSet;

import maths.EvenAndAddEven;

public class SortProductInAscending {
	
	public Set<ProductDetails> sortProducts(Set<ProductDetails> products) {

		Set<ProductDetails> set = new TreeSet<ProductDetails>();
		set.addAll(products);
		
		EvenAndAddEven even = EvenAndAddEven.getInstance();
		even.isEven(32);

		return set;
	}

}
