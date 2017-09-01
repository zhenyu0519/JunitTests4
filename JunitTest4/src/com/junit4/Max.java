//find max number in an array
package com.junit4;

public class Max {
	public int getMax(int[] array) throws Exception {
		if (array == null || array.length == 0) {
			throw new Exception("Array can not be null or empty");
		}
		int result = array[0];
		for (int i = 1; i < array.length; i++) {
			if (result < array[i]) {
				result = array[i];
			}
		}
		return result;
	}
}
