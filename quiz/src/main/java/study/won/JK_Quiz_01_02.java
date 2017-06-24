package study.won;

import java.util.HashMap;

/**
 	<Quiz 2>
 	어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의하자.
	
	예를 들어
	d(91) = 9 + 1 + 91 = 101
	
	이 때, n을 d(n)의 제네레이터(generator)라고 한다. 위의 예에서 91은 101의 제네레이터이다.
	어떤 숫자들은 하나 이상의 제네레이터를 가지고 있는데, 101의 제네레이터는 91 뿐 아니라 100도 있다. 그런데 반대로, 제네레이터가 없는 숫자들도 있으며, 이런 숫자를 인도의 수학자 Kaprekar가 셀프 넘버(self-number)라 이름 붙였다. 예를 들어 1,3,5,7,9,20,31 은 셀프 넘버 들이다.
	1 이상이고 5000 보다 작은 모든 셀프 넘버들의 합을 구하라.

	<풀이>
  	1. 1 이상 5000 미만에 대한 제네레이터 수행
  	2. HashMap 에 결과 저장
  	3. 1~5000
  	=> 작은 수의 배수의 합
     	큰 수/작은 수의 나머지가 0은 제외
  	종료하기 전까지 1,2 수행
  	
  	=> 속도 비교 http://nnoco.tistory.com/73
*/

public class JK_Quiz_01_02 
{
    public static void main( String[] args )
    {
    	int minVal = 1;
    	int maxVal = 5000;
    	int result_val = 0;
    	int Generator_result = 0;
    	HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
    	
    	// 1,2 단계
    	for(int i=minVal; i<=maxVal; i++){
    		result_val = Generator(i);
    		hMap.put( result_val, result_val);
    	}
    	
    	for(int i=minVal; i<maxVal; i++){
    		if(hMap.get(i) == null){
    			Generator_result += i;
    		}
    	}
    	
    	System.out.println("Generator Result :" + Generator_result);
    }
    
    public static int Generator(int i){
    	int rVal = 0;
    	// ex: 1234 . 1,2,3,4 1234 추출
    	// 각 자릿수로 나누고 나머지를 구하면 해당 자릿수를 구할 수 있다.
    	rVal += i/1000;			// 1000의 자리
    	rVal += (i/100)%10;		// 100의 자리
    	rVal += (i/10)%10;		// 10의 자리
    	rVal += i%10;			// 1의 자리
    	rVal += i;				// 본인
    	    	
    	// System.out.println(i +":::" + rVal);
    	return rVal;
    }
    
}
