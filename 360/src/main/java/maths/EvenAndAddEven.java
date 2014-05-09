package maths;

import java.util.List;

public class EvenAndAddEven {
	
	private static final EvenAndAddEven INSTANCE = new EvenAndAddEven();
	
	private EvenAndAddEven() {
	}
	
	
	/**
	 * static factory method
	 * @return
	 */
	public static EvenAndAddEven getInstance() {
		return INSTANCE;
	}

	public Boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;

		} else {
			return false;
		}

	}

	public int returnSumOfEven(List<Integer> integer) {

		int sum = 0;

		for (int num : integer) {
			if (isEven(num)) {
				sum += num;

			}
		}

		return sum;

	}

}
