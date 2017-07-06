package study.won.webserver.part2.Calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Question
 * 
 * - 쉼표(,) 또는 콜론(;)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환한다.
 * - 앞의 기본 구분자 (쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다.
 *   커스텀 구분자는 문자열 앞부분의 "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
 *   예를 들어 "//;\n1;2;3" 과 같이 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
 *   문자열 계산기에 음수를 전달하는 경우 RuntimeException으로 예외 처리해야 한다.
 *   
 *   해결 방법
 *   1. 숫자 합 계산하는 기능
 *   2. 기본 연산자 / 커스텀 연산자 체크하는 기능
 *   3. 문자열 -> 숫자로 변환하는 기능
 *   4. 문자열 자르는 함수 split
 *   5. 예외처리
 */
public class StringCalculator {
	
	public int add(String text) {
		int result = 0;
		// Validation 체크
		if(isNull(text)){
			return result;
		}
		
		String[] valid_array = validator(text);
		if(valid_array == null){
			return convertInt(text);
		}
		
		for(int i=0; i<valid_array.length; i++){
			result += isNegative(valid_array[i]);
		}
			
		return result;
	}
	
	// INT to String convert
	public int convertInt(String text){
		return Integer.parseInt(text);
	}
	
	// 빈 값 체크하는 함수
	public boolean isNull(String text){
		return (text.isEmpty() || text == null);
	}
	
	public String[] validator(String text){
		String[] tokens = null;
		Pattern pat = Pattern.compile(Constants.CUSTOM_DELIMITER); 
		Matcher mat = pat.matcher(text);
		
		if(mat.find()){
			String split_delimiter = mat.group(1);
			tokens = mat.group(2).split(split_delimiter);
		}else {
			tokens = text.split(",|;");
		}
		
		return tokens;
	}
	
	/* 참고 */
	public int isNegative(String text){
		int number = Integer.parseInt(text);
		if(number < 0){
			throw new RuntimeException();
		}
		return number;
	}
	 
}
