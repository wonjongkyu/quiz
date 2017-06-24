package study.won;

public class JK_ETC_01 {
	
	public JK_ETC_01() {
		// TODO Auto-generated constructor stub
	}
	  
	public JK_ETC_01(Object o) {
		System.out.println("Object");
	}
	  
/*	public JK_ETC_01(String s) {
		System.out.println("String");
	}*/
	
	////////////////////
	public JK_ETC_01(Number s) {
		System.out.println("Number");
	}
	
	public JK_ETC_01(Integer s) {
		System.out.println("Integer");
	}
	
	  
	public static void main(String[] args) {
		JK_ETC_01 j = new JK_ETC_01(null);
	}

}
