package study.won;
/*
 * 	<Quiz 3>
  	1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
	8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
 	(※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 함)
 	ex) 8  
 		10단위 80 ~ 89
 		100단위 180 ~ 189
 	
 	<풀이>
 	- 숫자가 왔을때 해당 숫자에 8이 몇개 있는지 체크하는 함수 필요함
 	- for문을 다 돌지, 최소한만 돌게 할지 정해야 함 
 	1) 1 ~ 10000 다 돌기 
 	2) 8부터 10단위로 증가하면서 10의 자리가 8인 경우 1의 자리를 0~9까지 돌면서 체크 (선택)
 	
 	int를 int로도 쓰고 String으로도 비교하고 싶은데..
 */
public class JK_Quiz_02_01 {
	private final static int max_val = 10001;	
	private final static int number = 8;
	private final static int plus_number = 10;	// 증가하는 수
	
	public static void main(String[] args) {
		
		int result = 0;
		
		/*for(int i=0; i<max_val; i++){
			result += Generator(i);
		}*/
		
		for(int i=number; i<max_val; i=i+plus_number){
			result += Check_Tensplace(i);
		}
		
		System.out.println("Result:" + result);
	}
	
	public static int Check_Tensplace(int j){
		int final_result = 0;
		boolean check_Tens = false;
		String str;
		if( Generator(j) > 0){	// 10의 자리 8 체크
			str = j+"";
			if(str.endsWith(number+"")){
				for(int i=0; i<10; i++){
					str = str.substring(0, str.length()-1) + i;
					final_result += Generator(Integer.parseInt(str));
				}
				check_Tens = true;
			}
		}
		
		if(check_Tens == false){
			final_result = Generator(j);
		}
		
		return final_result;
	}
	
	/*
	 * 자리수에 8이 몇개인지 세는 함수
	 */
	public static int Generator(int i){
    	int result = 0;
    	
    	if(i/1000 == number) 		++result;		// 1000의 자리
    	if((i/100)%10 == number) 	++result;		// 100의 자리
    	if((i/10)%10 == number) 	++result;		// 10의 자리
    	if(i%10 == number)		 	++result;		// 1의 자리
    	
    	return result;
    }
	
}
