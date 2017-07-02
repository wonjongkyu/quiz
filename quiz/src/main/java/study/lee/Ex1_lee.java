package study.lee;

public class Ex1_lee {
	public static void main(String[] args){ 
		System.out.println("ex1");
		/*
		 * 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
		 * 8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
		 * (※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 함)
		 */
		

		int input = 8;
		int max =  10000;
		
		double sum=0;
		String a = ""+max;
		int c = a.length()-1;
	    
		// 10보다 작은 경우
	    if(max >= input && max < 10 ) {
	    	sum = 1; 
	    }else{
	    	//한자리수가 아니면 첫번째 자리 수가 input 값인지 확인
	    	if(a.substring(0, 1).equals(input+"")) sum+=1;
	    }
	    
	    //첩번째 자리수를 제외한 input 의 갯수
		for(int i=1;i<=c && max >= 10;i++){		
			      // 10의 (자릿수-1) 승 + (자리수-1)*9* 10의 (자리수 -2)승
			sum += Math.pow(10, (i-1)) + (i-1)*(9*(Math.pow(10, (i-2))));			 
		} 
		 
		
		System.out.println((int)sum); 
		
		 
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		
		for(int i=10000;i<=99999 ;i ++){			 
			if ((i / 10000)%10 == 8) {
			//	System.out.println(i);
				count1++;
			} 
			 
		}
		
		for(int i=10000;i<=99999 ;i ++){			 
			if ((i / 1000)%10 == 8) {
				System.out.println("::"+i);
				count2++;
			} 
			 
		}
		for(int i=10000;i<=99999 ;i ++){	
			if ((i / 100) % 10 == 8) {
			//	System.out.println(i);
				count3++;
			}
			 
		}
		for(int i=10000;i<=99999 ;i ++){	
			if ((i / 10) % 10 == 8) {
			//	System.out.println(i);
				count4++;
			}
			 
		}
		
		for(int i=10000;i<=99999 ;i ++){	
			if (i % 10 == 8) {
			//	System.out.println(i);
				count5++;
			}
			 
		}
		System.out.println("--------------------------");
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4);
		System.out.println(count5);
		// 1000 
		count1=0;
		count2=0;
		count3=0;
		count4=0;
		
		for(int i=1000;i<=9999 ;i ++){			 
			if (i / 1000 == 8) {
			//	System.out.println(i);
				count1++;
			} 
			 
		}
		for(int i=1000;i<=9999 ;i ++){
			if ((i / 100) % 10 == 8) {
			//	System.out.println(i);
				count2++;
			}
			 
		}
		for(int i=1000;i<=9999 ;i ++){
			if ((i / 10) % 10 == 8) {
			//	System.out.println(i);
				count3++;
			}
			 
		}
		
		for(int i=1000;i<=9999 ;i ++){
			if (i % 10 == 8) {
			//	System.out.println(i);
				count4++;
			}
			 
		}
		System.out.println("--------------------------");
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4);
		// 1000 
		
		
		count1=0;
		count2=0;
		count3=0;
		count4=0;
		
		for(int i=100;i<=999 ;i ++){			 
			if (i / 100 == 8) {
			//	System.out.println(i);
				count1++;
			} 
			 
		}
		for(int i=100;i<=999 ;i ++){
			if ((i / 10) % 10 == 8) {
			//	System.out.println(i);
				count2++;
			}
			 
		}
		
		for(int i=100;i<=999 ;i ++){
			if (i % 10 == 8) {
			//	System.out.println(i);
				count3++;
			}
			 
		} 
		System.out.println("--------------------------");
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4);
		
		
		count1=0;
		count2=0;
		count3=0;
		count4=0;
		
		 
		for(int i=10;i<=99 ;i ++){
			if ((i / 10) % 10 == 8) {
			//	System.out.println(i);
				count1++;
			}
			 
		}
		
		for(int i=10;i<=99 ;i ++){
			if (i % 10 == 8) {
			//	System.out.println(i);
				count2++;
			}
			 
		} 
		System.out.println("--------------------------");
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4);
		
		
		count1=0;
		count2=0;
		count3=0;
		count4=0;
		
		 
		for(int i=1;i<=9 ;i ++){
			if (i % 10 == 8) {
			//	System.out.println(i);
				count1++;
			}
			 
		}
		
		 
		System.out.println("--------------------------");
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4); 
		
		
	} 
 
}
		
