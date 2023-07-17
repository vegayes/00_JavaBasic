package adu.kh.basic;

// (한 줄)주석 : 컴파일러가 해석하지 않는 부분, 주로 코드 설명 작성
/*
 * 범위 주석  
 */

// 컴파일러(Compiler) : 코드를 2진수(0,1)로 변환하는 번역기

// Java 코드 실행 순서 
// ==> 코드 작성 -> ctrl + f11 (Run 실행:: main 메소드 먼저 실행됨. ) *Tip  
// Run동작 :: 컴파일러가 2진수로 번역 -> JVM이 실행 됨. 

public class JavaTest {
	
	// class : 자바 코드가 작성되는 영역
	
	public static void main(String[] args) {

		// main method(메소드) : 자바 애플리케이션(프로그램)을 실행하기 위해서 반드시 필요한 메서드
		
		// *Tip) 복사 ::  복사 할 코드에 cursor두고 ctrl + alt + 방향키
		System.out.println("+");
		System.out.println("-");
		System.out.println("12345");
		
		System.out.println("-------------------------");
		
		//숫자 연산
		System.out.println("1+2"); 	// "" 안에 작성된 코드는 단순 문자열 인식 
		System.out.println(1+2);    // "" 안에 작성되지 않은 코드는 숫자, 변수로 인식
		System.out.println(50-23);
		System.out.println(12*3);
		System.out.println(12/3);
		
		
		
		//""(문자열) + 숫자 함께 작성 (이어쓰기)
		System.out.println("1 * 3 = "+ 1*3);
		System.out.println("90 + 60 + 23 = "+ 90 + 60 + 23); // 90 + 60 + 23 = 906023 이어쓰기 됨.
		System.out.println("90 + 60 + 23 = "+ (90 + 60 + 23));// 자바는 사칙연산을 우선순위 따름. 
															  // 우선 계산을 원하는 경우 () 괄호 사용. 
	
		// + 기호의 역할
		// -> 숫자 + 숫자  = 덧셈 연산 결과
		// -> 문자열 + 숫자 or 문자열 + 문자열 --> 이어쓰기

		
		/*
		 * workspace :: import project -> General -> Existing Projects into Workspace -> select :: Browse :: 주소  => 같은 공간에 있는 폴더만 가능! 
 			file -> open project file system -> directory -> 가져오기 
		 * 
		 */
		

		
		
		
		
		
		
	}

}


