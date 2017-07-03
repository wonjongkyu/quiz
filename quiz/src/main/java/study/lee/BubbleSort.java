package study.lee;

import java.util.Scanner;

public class BubbleSort { 
	 
	
	public static void main(String[] args){
		
		BubbleSort.bubbleSorting();
		
		System.out.println("\n\ninput data:");		
		Scanner sc = new Scanner(System.in);		
		BubbleSort.bubbleSorting(Integer.parseInt(sc.nextLine()));
	}
	
	public static void bubbleSorting(){
		
		int[] arr = {3,1,4,1,5,9,2,6};
		int size =  arr.length;
		int loopCount=0;
		int swapCount=0;
		
		System.out.println("input data:");
		for(int n:arr){
			System.out.print(n+" ");
		}
		
		for(int n=0;n<size-1;n++){
			for(int m=0;m<size-1;m++){
				//swap
				int temp=0;
				if(arr[m] > arr[m+1]){
					temp = arr[m];
					arr[m] = arr[m+1];
					arr[m+1] = temp;
					swapCount++;
				}
				loopCount++;
			}
			size--;
		}
		
		printResult(loopCount,swapCount,arr);
	}
	
	public static void bubbleSorting(int size){
		
		int[] arr = new int[size];
		for(int i=0;i<size-1;i++){
			arr[i] = (int)(Math.random()*100);
		}
		int loopCount=0;
		int swapCount=0;
		
		for(int n:arr){
			System.out.print(n+" ");
		}
		for(int n=0;n<size;n++){
			for(int m=0;m<size-1;m++){
				//swap
				int temp=0;
				if(arr[m] > arr[m+1]){
					temp = arr[m];
					arr[m] = arr[m+1];
					arr[m+1] = temp; 
					swapCount++;
				}
				loopCount++;
			}
			size--;
		}
		
		printResult(loopCount,swapCount,arr);
	}
	
	public static void printResult(int loopCount,int swapCount, int[] arr){
		System.out.println("\nanswer:");
		System.out.print(loopCount+ " "+swapCount+"\n=>");
		for(int n:arr){
			System.out.print(n+" ");
		}
	}
	
	
 
}
		
