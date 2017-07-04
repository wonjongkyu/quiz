package study.sin;
import java.util.ArrayList;

/*
	� �ڿ��� n�� ���� ��, d(n)�� n�� �� �ڸ��� ���ڵ�� n �ڽ��� ���� ���ڶ�� ��������.
	���� ��� d(91) = 9 + 1 + 91 = 101
	�� ��, n�� d(n)�� ���׷�����(generator)��� �Ѵ�. ���� ������ 91�� 101�� ���׷������̴�.
	� ���ڵ��� �ϳ� �̻��� ���׷����͸� ������ �ִµ�, 
	101�� ���׷����ʹ� 91 �� �ƴ϶� 100�� �ִ�. �׷��� �ݴ��, ���׷����Ͱ� ���� ���ڵ鵵 ������, 
	�̷� ���ڸ� �ε��� ������ Kaprekar�� ���� �ѹ�(self-number)�� �̸� �ٿ���. ���� ��� 1,3,5,7,9,20,31 �� ���� �ѹ� ���̴�.
	1 �̻��̰� 5000 ���� ���� ��� ���� �ѹ����� ���� ���϶�.
*/
public class QuestionSelfNum {
	private static ArrayList<Integer> generatorList;

	private static int ragne = 5000;
	
	public static void main(String[] args) {
		makeGenerator();

		int selfNumSum = 0;
		for (int i = 0; i < ragne; i++)
			if (!hasGenerator(i)) {
				System.out.print(i+",");
				selfNumSum += i;
			}
		System.out.println();
		System.out.println(selfNumSum);
	}

	private static boolean hasGenerator(int num) {
		return generatorList.contains(num);
	}

	private static void makeGenerator() {
		generatorList = new ArrayList<Integer>();
		for (int i = 0; i < ragne; i++) {
			String num = String.valueOf(i);
			int generator = 0;
			for (int n = 0; n < num.length(); n++) {
				generator += Integer.parseInt(num.substring(n, n + 1));
			}
			generatorList.add(generator + i);
		}
	}
}