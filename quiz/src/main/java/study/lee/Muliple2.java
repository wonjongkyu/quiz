package study.lee;

import java.util.Scanner;

public class Muliple2 {
	public static void main(String[] args){ 
		
		 int a = 3;
		 int b = 5;
		 int input = 0;
		 int sum = 0;		 
		 
		 //Scanner sc = new Scanner(System.in);
		 System.out.print("input the number : 15\n");
		 input = 1000;//Integer.parseInt(sc.nextLine());
		 
		 long statTime = System.nanoTime();
		 int count=0;
		 for(int i=a;i<input;i++){
			 if(i%a == 0 || i%b == 0){
				 sum+=i;				 
			 }
			 count++;
		 }
		 		  
		 long endTime = System.nanoTime();
		 
		 System.out.println("Sum : "+ sum);
		 System.out.println("Count : "+ count);
		 System.out.println("Time : "+ (endTime-statTime));
		 
		 
		 
	}
}
