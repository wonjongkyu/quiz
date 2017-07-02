package study.lee;

import java.util.concurrent.SynchronousQueue;

public class Ex2_lee {
	public static void main(String[] args){ 
		System.out.println("ex2");
		/*
		 * 1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. (단 점들의 배열은 모두 정렬되어있다고 가정한다.)
		 * 예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.
		 * 
		 */
		
		 int s[] = {1, 3, 5, 8, 13, 14, 17, 20}; 
		 for(int i:getShort(s)){
			System.out.print(i+" ");
		 }
		
	}
	
	public static int[] getShort(int[] s) {
		int result[] = new int[2];
		result[0] = s[0];
		result[1] = s[1];

		for (int i = 1; i < s.length - 1; i++) {
			if ((s[i + 1] - s[i]) < (result[1] - result[0])) {
				result[0] = s[i];
				result[1] = s[i + 1];
			}
		}
		return result;
	}
 
}
		
