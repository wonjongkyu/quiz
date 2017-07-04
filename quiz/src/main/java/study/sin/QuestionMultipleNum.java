package study.sin;
public class QuestionMultipleNum {

	public static void main(String[] args) {
		int multipleNum = 3;
		int multipleNum2 = 5;
		int range = 1000;

		//System.out.println(getMultipleSum(multipleNum, multipleNum2, range));

	
		Calculate addCalculate = new MultipleAddCalculate();
		Calculate minusCalculate = new MultipleMinusCalculate();
		System.out.println(getMultipleSum2(multipleNum, multipleNum2, range, addCalculate, minusCalculate));
	
	}

	private static int getMultipleSum(int multipleNum, int multipleNum2, int range) {
		int result = 0;
		for (int i = 0; i < range; i++) {
			if (i % multipleNum == 0 || i % multipleNum2 == 0) {
				result += i;
			}
		}
		return result;
	}

	private static int getMultipleSum2(int multipleNum, int multipleNum2, int range
			,Calculate addCalculate ,Calculate minusCalculate) {
		int result = 0;

		result = getMultiple(multipleNum, range, result, addCalculate);
		result = getMultiple(multipleNum2, range, result, addCalculate);
		result = getMultiple(multipleNum * multipleNum2, range, result, minusCalculate);
		
		return result;
	}


	private static int getMultiple(int multipleNum, int range, int result, Calculate caculate) {
		int calculateRange = range/multipleNum;

		for (int i = 1; i <= calculateRange; i++) {
			result = caculate.calculate(result, multipleNum*i);
		}

		return result;
	}
}