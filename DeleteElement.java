package deleteElement;

import java.util.Arrays;

public class DeleteElement {
	
	static int[] array = {3, 7, 1, 9, 4};
	
	public static void main(String[] args) {
		deleteElement(array, 2);
	}
	private static void deleteElement(int[] array, int index) {
		int[] array1 = {3, 7, 1, 9, 4};
		index = 2; //This is index to be deleted.
		if(index <0 || index >= array1.length) {
			System.out.println("Invalid Index.");
		}
		else {
			int[] newArray = new int[array1.length - 1];
			for (int i1 = 0, j = 0; i1 < array1.length; i1++) {
			 if (i1 != index) {
			 newArray[j++] = array1[i1];
			 }
		   }
			System.out.println(Arrays.toString(newArray));
		}
	}
}
