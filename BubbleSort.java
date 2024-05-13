package algorithm;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
	static String[] alpha1 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", 
			"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", 
			"w", "x", "y", "z"};
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> alphabet = new ArrayList<String>();
		for(int i=0; i < 26; i++) {
			alphabet.add(i, alpha1[i]);
		}
		//System.out.println(alphabet);
		int n = input.nextInt();
		String[] inputtext = new String[n];
		for(int h=0; h < n; h++) {
			inputtext[h] = input.next();
		}
		bubbleSort(inputtext);
		System.out.println();
	}
	public static void bubbleSort(String[] array){

		for(int i=0; i<array.length -1; i++) {
			for (String k: array) {
			for(int j=0; j<array.length-i-1; j++) {
				if (array[j] != alpha1[j]) {//In ascending order
					// To make it in descending order we make > to <.
					String temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
