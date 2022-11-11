package day01;

import java.util.Scanner;

// 자바의 소스코드는 클래스가 기본 구성 단위이다
// 자바에서 클래스를 제외한 나머지 요소는 모두 첫글자를 소문자로 시작한다
// (변수, 함수, 접근제한자, 패키지, 프로젝트...)
// 단, 클래스의 static final 멤버는 모든 글자를 대문자로 작성하며 _로 단어를 구분한다.
// 변수 및 함수의 이름에는 소문자, _ 로 시작할 수 있다. (숫자는 첫번째 글자가 될 수 없다)

/*
 * 	dao.selectAll() : 객체의 메서드를 호출
 *  DAO.getInstance() : 클래스의 정적 메서드를 호출
 */

public class Ex01 {
	public static void main(String[] args) throws Exception {
		
		Runtime rt = Runtime.getRuntime();
//		Runtime rt = new Runtime();
		rt.exec("mspaint");
		
		// 자료형 (data type)
		/*
		 * 1. primitive type (단순 자료형, 원시 자료형)
		 * 		소문자로 시작하며 총 8개의 기초적인 자료형이 있다
		 * 		복잡한 데이터가 아니므로, 변수에 데이터를 직접 저장한다
		 * 
		 * 	☆	boolean 	1바이트 	논리값			true, false
		 * 		byte 		1바이트	정수(8비트)		-128 ~ +127
		 * 		short		2바이트	정수(16비트)		-32768 ~ +32767	
		 * 		char		2바이트	정수(글자)		0 ~ 65535	
		 * 	☆	int 		4바이트	정수(32비트)		약-21억 ~ 약+21억
		 * 		long		8바이트	정수(64비트)		-922조 ~ +922조
		 * 		float 		4바이트	실수
		 * 	☆	double		8바이트	실수
		 * 		
		 * 2. Reference Type (참조 자료형)
		 * 
		 * - Array Type : 배열
		 * - Class Type : 클래스, 인터페이스 등...
		 * 
		 */
		
		// 단일 데이터를  메모리에 저장하고 싶다 -> 크기에 맞는 변수
		// 같은 자료형의 데이터를 여러개 묶어서 저장하고 싶다 -> 배열
		
		// 서로 다른 자료형의 데이터를 묶어서 저장하려면 새로운 자료형을 정의해야 한다
		
		// 구조체 in C언어			변수만 묶어서 자료형을 만든다
		// 클래스 in Java(C++)	변수와 함수를 묶어서 자료형을 만든다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("itbank라고 입력하세요 : ");
		String str1 = sc.nextLine();
		
		String str2 = "itbank";
		String str3 = new String("itbank");
		String str4 = "itbank";
		
		System.out.println(str1 == str2); // 대상을 가르키는 레퍼런스 타입
		System.out.println(str1 == str3); 
		System.out.println(str2 == str3);
		System.out.println(str2 == str4);
		
		sc.close();
		
		
		
	}

}
