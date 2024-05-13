package Findingnum;

import java.util.Scanner;

public class Findingnum {
	static int array[];
	static int count;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the size of the array: ");
		int a = input.nextInt();
		array = new int[a];
		for (int i=0; i < a; i++) {
			array[i] = input.nextInt();
		}
		System.out.print("Please Enter the number to be searched: ");
		int b = input.nextInt();
		find(b);
	}
	private static void find(int b) {
		count=0;
		for(int i=0; i < array.length; i++) {
			if(array[i] == b) {
				count++;
			}
		}
		System.out.println("The number " + b + " is found " + count + " times.");
	}
}
