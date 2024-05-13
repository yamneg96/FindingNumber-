package MergeSort;

import java.util.Scanner;

public class MergeSort {

	static int array[];
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the size of the array: ");
		int a = input.nextInt();
		array = new int[a];
		for (int i=0; i < a; i++) {
			array[i] = input.nextInt();
		}
		MergeSort(array);
		
		for(int j : array) {
			System.out.print(j +" ");
		}
	}

		private static void MergeSort(int[] array) {
			
			int length = array.length;
			if(length<=1) return;// base case for our recursive function.
			
			int mid = length/2;
			int[] leftArray = new int[mid];
			int[] rightArray = new int[length  - mid];
			// Now Copying the elements from the original
			// array to the new one.
			int i = 0;// for our Left array
			int j = 0;// for our right array
			
			for (;i<length; i++) {
				if (i<mid) {
					leftArray[i] = array[i];
				}
				else {
					rightArray[j] = array[i];
					j++;
				}
			}
			//To make it recursive we call it(itself) again
			//for the left and right array.
			MergeSort(leftArray);
			MergeSort(rightArray);
			Merge(leftArray, rightArray, array);// to put the elements back together.
		}
		
		private static void Merge(int[] leftArray, int[] rightArray, int[] array) {
			// setting the size for the 2 new arrays.
			int leftsize = array.length/2;
			int rightsize = array.length - leftsize;
			int i=0, L=0, R=0;// Indices.
			
			// Check the conditions for the merging.
			while(L < leftsize && R < rightsize) {
				if (leftArray[L] < rightArray[R]) {
					array[i] = leftArray[L];
					i++;
					L++;
				}
				else {
					array[i] = rightArray[R];
					i++;
					R++;
				}
			}
			// Since there will be one element left(w/h isn't compared)
			// We write another condition for it.
			while(L<leftsize) {
				array[i] = leftArray[L];
				i++;
				L++;
			}
			while(R<rightsize) {
				array[i] = rightArray[R];
				i++;
				R++;
			}
		}
	}
