package study.kim;

public class freeuser_quiz02_20170702 {

	   /*
	    * 
	    * 	1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. (단 점들의 배열은 모두 정렬되어있다고 가정한다.)

			예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.

	    * 
	    *  
	    * */
		public static void main(String[] args) {
			
			//int[] testInt = {1, 3, 5, 8, 13, 17, 20 , 22 , 26 , 30 , 33};
			int[] testInt = {1, 7, 11, 55, 77, 90, 101 , 233 , 234 , 266 , 288};
				
			
			int i = 0;
			int j = 0;
			
			int sInt = 0;
			int eInt = 0;
			int frontInt = 0;
			int resultInt = 9999999;
			for(int idx=0; idx < testInt.length-1; idx ++){
				//sInt = testInt[idx];
				
				if(resultInt > testInt[idx+1] - testInt[idx]){					
					//System.out.println(testInt[idx+1] - testInt[idx]);
					resultInt = testInt[idx+1] - testInt[idx];
					sInt = testInt[idx];
					eInt = testInt[idx+1];
					
					//System.out.println(idx);
					//System.out.println(resultInt);
				}
				//resultInt = testInt[idx+1] - testInt[idx];
				//frontInt = resultInt;
				//frontInt = 0;
				//if(resultInt > )
				//System.out.println(resultInt);
			 }
			System.out.println("가장거리가 짧은 값: "+ resultInt );
			System.out.println("결과값은 ("+sInt+","+eInt+")");
		}
}
