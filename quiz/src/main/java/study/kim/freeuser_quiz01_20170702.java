package study.kim;

import java.util.Scanner;

public class freeuser_quiz01_20170702 {

		/*
		 * 
		 * 
		 * 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?

			8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
 			(※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 함)


		 *
		 * */
		public static void main(String[] args) {
				
			 //System.out.println("범위값을  입력하시오.");
			 //Scanner sc = new Scanner(System.in);
			 
			 //String inputStr = sc.nextLine();
			 //sc.close();	
			 
			 
			
			 String inputStr = "10000";
			 int findIntData = 8;
			 int cycle = 0;
			 //inputStr.length();
			 if(inputStr.indexOf("1") == 0){
				cycle =  inputStr.length() - 1;				
				System.out.println("cycle : " + cycle);
			 }else{
				 cycle = inputStr.length();
			 }
			
			 
			 int tempSquarInt = cycle;
			 int squarInt = 1;
			 for(int i = 0; i < tempSquarInt-1; i++){
				 squarInt = squarInt * 10;
			 }
			 
			 System.out.println(cycle* squarInt);
			
			 /*
			  * 10000   =  4000 개   (      9999     size * 10 (size-1)
			  * 
			  * 100000  =                99999    5 * 10 (4)
			  * 
			  * */
			 
		
			 //System.out.println("indexOf(0) : "+inputStr.indexOf(0));
			 //System.out.println("indexOf(\"0\") : "+inputStr.indexOf("0"));
			 //System.out.println("indexOf(0, 2) : "+inputStr.indexOf(2, 0));
			 //System.out.println("lastIndexOf(0) : "+inputStr.lastIndexOf(5));
			 //System.out.println("charAt(0) : "+inputStr.charAt(0));
				  
		}
}
