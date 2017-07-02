package study.sin;


/*
1������ ������ �־����� ��, �� �� ���� �Ÿ��� ª�� ���� ���� ����ϴ� �Լ��� �ۼ��Ͻÿ�. (�� ������ �迭�� ��� ���ĵǾ��ִٰ� �����Ѵ�.)

������� S={1, 3, 4, 8, 13, 17, 20} �� �־����ٸ�, ������� (3, 4)�� �� ���̴�.


*/
public class QuestionOneChaOne {
	public static void main(String[] args) {
		int[] numArray = {1,3,4,5,13,17,20};

		if (numArray.length == 1) {
			System.out.println("�ּ� 2���� ���� �Է��ϼ���.");
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
				System.out.println("����ó��");
			}
		}
		System.out.println(result);
	}
}
