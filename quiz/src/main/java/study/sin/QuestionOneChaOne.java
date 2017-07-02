package study.sin;


/*
1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. (단 점들의 배열은 모두 정렬되어있다고 가정한다.)

예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.


*/
public class QuestionOneChaOne {
	public static void main(String[] args) {
		int[] numArray = {1,3,4,5,13,17,20};

		if (numArray.length == 1) {
			System.out.println("최소 2개의 점을 입력하세요.");
			return;
		}

		int min = numArray[1] - numArray[0];
		int temp = 0;
		String result = "";
		for (int i = 0; i < numArray.length; i++) {
			try {
				temp = (numArray[i+1] - numArray[i]);
				if (min > temp) {
					min = temp;
					result = "(" + numArray[i] + "," + numArray[i+1] + ")";
				}
			} catch (ArrayIndexOutOfBoundsException ae) {
				System.out.println("예외처리");
			}
		}
		System.out.println(result);
	}
}
