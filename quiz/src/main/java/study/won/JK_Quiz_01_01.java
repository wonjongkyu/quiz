package study.won;

import java.util.Scanner;

/**
 	<Quiz 1>
 	10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다. 
 	3 6 9 12 15 18 21 // 5 10 15
	1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
	
	<풀이>
  	1.자연수 두개 입력 받기
  	2.총합 계산
  	=> 작은 수의 배수의 합
     	큰 수/작은 수의 나머지가 0은 제외
  	종료하기 전까지 1,2 수행
*/

public class JK_Quiz_01_01 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	Run(scan);
    }
    
    public static void Run(Scanner s){
    	int input_val = 0;	// 입력 값 (미만의 자연수)
    	int Sum = 0;		// 총합
    	
    	int iVal = 3;		// 3의 배수
    	int iVal2 = 5;		// 5의 배수
    	int maxLoop = 0;	
    	
    	String input = s.nextLine();
    	if(!input.isEmpty()){
			String[] valList = input.split(" ");
			if(valList.length == 1){
				input_val = Integer.parseInt(valList[0]) -1;	// 미만
			}
		}
    	maxLoop = input_val/3;
    	for(int i=1; i<=maxLoop; i++){
    		Sum += iVal*i;
    	}
    	
    	maxLoop = input_val/5;
    	for(int j=1; j<=maxLoop; j++){
    		if( iVal2*j % iVal != 0){
    			Sum += iVal2*j;
    		}
    	}
    	System.out.println("Result : " + Sum);
    }
}
