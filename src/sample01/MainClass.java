package sample01;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("헬로우 자바");
		
		// 한줄 주석문 -> 컴파일이 되지 않는다
		
		/* 
		 * 범위 주석문
		 * Html 	<!-- -->
		 * JSP		<%-- --%>
		 * mySQL 	--
		 * python	# 	""" 주석문 """
		 */
		
		System.out.println("Hello World");
		
		// 기능: escape sequence
		//		\n: 개행
		// 		\t: tab
		//		\b: backspace
		//		\": " 출력되게 하기
		
		System.out.println(1234);
		
		System.out.println("Hello" + " World");
		
		System.out.printf ("%s \n", "Hello"); // Hello == 문자열(String) %s == String, 자동개행 x
						// 표현 자료형		값
	}

}
