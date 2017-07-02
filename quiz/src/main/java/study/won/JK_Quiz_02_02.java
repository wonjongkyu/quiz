package study.won;
/*
 * 	<Quiz 4>
  	1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. (단 점들의 배열은 모두 정렬되어있다고 가정한다.)
	예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.

 	<풀이> 
 	단순히 배열 index i+1 - i의 차이를 저장하고 있다가 1이 나오면 끝 아니면 다 돈다.
 */
public class JK_Quiz_02_02 {
	private static int max_idx = 0;
	private static int array_size = 0;
	private static int distance = 0;	
	
	public static void main(String[] args) {
		
		int[] int_array = {1,3,4,8,13,17,20};
		array_size = int_array.length -1;
		distance = int_array[array_size] - int_array[0];	// 초기값 설정 (최대값-최소값)
		
		for(int i=0; i<array_size; i++){
			Check_distance(int_array[i+1], int_array[i], i);
			if(distance == 1){
				break;
			}
		}
		System.out.println("Result: [" + int_array[max_idx] + "," + int_array[max_idx+1] + "]");
	}
	
	public static void Check_distance(int num1, int num2, int array_idx){	// array_idx, array_idx+1
		if(num1-num2 < distance){
			distance = num1-num2;
			max_idx = array_idx;
		}
	}
	
}
