package study.won;

public class JK_ETC_02 {
	
	// �옄諛붾뒗 湲곕낯�쟻�쑝濡� call by value
	// http://multifrontgarden.tistory.com/87
	
	public JK_ETC_02() {
		// TODO Auto-generated constructor stub
	}
	  
	public static void main(String[] args) {
		int test = 10;
		System.out.println("test :" + test);
		add(--test); //9
		//--test;
		System.out.println("test2 :" + test);
		//test++;
		min(test--);//
		System.out.println("test3 :" + test);
	}
	
	public static void add(int test){
		System.out.println("add before:" + test);
		++test;
		System.out.println("add after:" + test);
	}
	
	public static void min(int test){
		System.out.println("min before:" + test);
		System.out.println(test--);
		System.out.println(--test);
	}
}
