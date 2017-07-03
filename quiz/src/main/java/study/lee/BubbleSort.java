package study.lee;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  jdk1.8
 *  forEach 써보고 싶어서 ArrayList<Integer> 사용해봄
 */

public class BubbleSort {

	public static void main(String[] args) {

		BubbleSort.bubbleSorting();

		System.out.println("\n\ninput data:");
		Scanner sc = new Scanner(System.in);
		BubbleSort.bubbleSorting(Integer.parseInt(sc.nextLine()));
	}

	public static void bubbleSorting() {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(1);
		arr.add(4);
		arr.add(1);
		arr.add(5);
		arr.add(9);
		arr.add(2);
		arr.add(6);

		int size = arr.size();
		int loopCount = 0;
		int swapCount = 0;

		System.out.println("input data:");
		arr.forEach(n -> System.out.print(n + " "));

		for (int n = 0; n < size - 1; n++) {
			for (int m = 0; m < size - 1; m++) {
				// swap
				int temp = 0;
				if (arr.get(m) > arr.get(m + 1)) {
					temp = arr.get(m);
					arr.set(m, arr.get(m + 1));
					arr.set(m + 1, temp);
					swapCount++;
				}
				loopCount++;
			}
			size--;
		}

		printResult(loopCount, swapCount, arr);
	}

	public static void bubbleSorting(int size) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			arr.add(i, (int) (Math.random() * 100));
		}

		int loopCount = 0;
		int swapCount = 0;
		
		arr.forEach(n -> System.out.print(n + " "));

		for (int n = 0; n < size - 1; n++) {
			for (int m = 0; m < size - 1; m++) {
				// swap
				int temp = 0;
				if (arr.get(m) > arr.get(m + 1)) {
					temp = arr.get(m);
					arr.set(m, arr.get(m + 1));
					arr.set(m + 1, temp);
					swapCount++;
				}
				loopCount++;
			}
			size--;
		}

		printResult(loopCount, swapCount, arr);
	}

	public static void printResult(int loopCount, int swapCount, ArrayList<Integer> arr) {
		System.out.println("\nanswer:");
		System.out.print(loopCount + " " + swapCount + "\n=>");
		arr.forEach(n -> System.out.print(n + " "));
	}

}
