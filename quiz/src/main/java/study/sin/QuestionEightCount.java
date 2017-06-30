package study.sin;


/*
1���� 10,000���� 8�̶�� ���ڰ� �� ��� �����°�?

8�� ���ԵǾ� �ִ� ������ ������ ī���� �ϴ� ���� �ƴ϶� 8�̶�� ���ڸ� ��� ī���� �ؾ� �Ѵ�.
 (�� ������� 8808�� 3, 8888�� 4�� ī���� �ؾ� ��)
1~ 1000
8
18 28 38 48 58 68 78 88 98 -> 9
108 118 128 138 148 158 168 178 188 198 ->10
208 ........................... 298 ->10
...
908 ........................... 998 ->10

---------------8-------------
10/10 =1
8
100/10 =10
8 18 28 38 48 58 68 78 88 98 
1000/10 =1000
8 18 28 38 48 58 68 78 88 98 
---------------80-------------
100/100 =1
80
1000/10 =10
80 180 280 380 480 580 680 780 880 980  


*/
public class QuestionEightCount {
	public static void main(String[] args) {
		String rangeStr = "100";

		if (rangeStr.length() == 1) {
			System.out.println(0);
			return;
		}

		int range = Integer.parseInt(rangeStr);

		int eightCount = 0;
//
		for (int jarisu = 1; jarisu < rangeStr.length(); jarisu++) {
			eightCount += range/(getTenDivisor(jarisu));
		}
		System.out.println(eightCount);
	}

	private static int getTenDivisor(int jarisu) {
		int divisor = 10;
		for (int i = 1; i < jarisu; i++) {
			divisor = divisor * divisor;
		}
		return divisor;
	}
}
