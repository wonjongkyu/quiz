package study.lee;

import java.util.Iterator;
import java.util.Scanner;

public class Generator {
	public static void main(String[] args){
		 // d(91) -> 101  91은 제네레이터  
		 // d(100) ->101  100 은 제네레이터
		 // d(x)   -> 1
		 // 셀프 넘버 
		
		 /*1 -> 1+1 = 2
		 2 -> 2+2 = 4
		 3 -> 3+3 = 6
		 4    4+4  8
		 5     5+5   10
		 6  6+6 12
		 7  7+7  14
		 8        16
		 9            18
		 10 1+0+10  11
		 11 1+1+11 13
		 12 1+2+12 15
		 13 1+3+13  17
		 변경
		 또 변경
		 */
		
		
		 
		int max=5000;
		
	 	 int m[] = new int[max]; 
	 	 int result[] = new int[max];
	 	 
	 	//제네레이터보다 작은 셀프소스는 만들어 질수 없다.
		 for(int i=0;i<max-1;i++){
			 m[i] = i+1;
		 }
		
		 //셀프소스가 아닌 값들을 순서대로 받는다.
		for (int i = 0; i < m.length; i++) {
			result[i] = d(m[i]+"");
		}
		
		boolean chk=false;
		int sum=0;
		for(int a=1;a<max;a++){ 
			for(int t=0;t<result.length;t++){
				if( a == result[t] ){
					chk=false;
					break;
				} 
				chk=true;
			}
			if(chk){ sum+=a;
			System.out.println(a);
			}
		}
		
		System.out.println(sum);
		 
		  
				 
		 long statTime = System.nanoTime();
		 
		 
		 
		 
		 long endTime = System.nanoTime();
		  
		 System.out.println("Time : "+ (endTime-statTime));
		 
		 
		/* Integer a,b,c,d,result1,sum1=0;

	        boolean[] generated = new boolean[5000];

	        for(int generator=1; generator<5000;generator++){
	            a = generator/1000;
	            b = (generator/100)%10;
	            c = (generator/10)%10;
	            d = generator%10;

	            result1 = a+b+c+d+generator;

	            if((result1>=1)&&(result1<5000)){
	                generated[result1] = true;
	            }
	        }

	        for(int i=1; i<5000; i++){
	            if(generated[i]==false){
	                sum1 = sum1 + i;
	            }
	        }

	        System.out.println("Self-Number의 합계는 : " + sum1);*/

		 
	}
	
	static int d(String input){
		int sum=0;		 
		 int num[] = new int[input.length()];
		 for(int i=0;i<input.length();i++){ 
			 num[i] = Integer.parseInt(""+input.charAt(i));
		 }
		 		 
		 for(int i=0;i<num.length;i++){
			 sum+=num[i];
		 }		 
		  
		return sum+Integer.parseInt(input);
	}
}
