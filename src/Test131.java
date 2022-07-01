 /*=======================================
   ■■■ 자바의 주요(중요) 클래스 ■■■
=========================================*/

// Object 클래스

class NewCar
{
	private int velocity;		//-- 자동차의 속도
	private int wheelNum;		//-- 자동차의 바퀴 개수
	private String carName;		//-- 자동차의 이름

	NewCar(int speed, String name, int wheel)
	{
		velocity = speed;
		carName  = name;
		wheelNum = wheel;
	}
}

public class Test131
{
	public static void main(String[] args)
	{
		NewCar nCar1 = new NewCar(80, "아반떼", 4);
		NewCar nCar2 = new NewCar(150, "그랜저", 4);

		// equals()
		System.out.println("1-1 : " + nCar1.equals(nCar2));		// 1-1 : false
		System.out.println("1-2 : " + (nCar1 == nCar2));		// 1-2 : false
		
		NewCar nCar3 = nCar1;	// 객체 복사 → 얕은 의미 복사(참조형)
								// → 주소값 복사

		System.out.println("2-1 : " + nCar1.equals(nCar3));		// 2-1 : true
		System.out.println("2-2 : " + (nCar1 == nCar3));		// 2-2 : true

		// toString()
		System.out.println("3-1 : " + nCar1.toString());	// 3-1 : NewCar@15db9742
		System.out.println("3-2 : " + nCar2.toString());	// 3-2 : NewCar@6d06d69c
		System.out.println("3-3 : " + nCar3.toString());	// 3-3 : NewCar@15db9742

		// hashCode() => Object 클래스의 메소드
		System.out.println("4-1 : " + nCar1.hashCode());	// 4-1 : 366712642
		System.out.println("4-2 : " + nCar2.hashCode());	// 4-2 : 1829164700
		System.out.println("4-3 : " + nCar3.hashCode());	// 4-3 : 366712642
		//-- 『hashCode()』 의 결과값을 16진수 형태로 바꾸게 되면
		//   『toString()』 메소드가 반환한 결과값 확인 가능

		// getClass() => 생성된 객체의 기반 설계도가 무엇인지 알려줌
		System.out.println("5-1 : " + nCar1.getClass());	// 5-1 : class NewCar
		System.out.println("5-2 : " + nCar2.getClass());	// 5-2 : class NewCar
		System.out.println("5-3 : " + nCar3.getClass());	// 5-3 : class NewCar
		//-- 생성된 객체를 통해 해당 객체의 기반 설계도를 확인할 수 있는 기능을 가진 메소드

		// clone()		//-- 객체 복사
	
		// finalize()	//-- 객체 직렬화 (자바 마지막시간에 배울 거임)

		// 기타 나머지 메소드는 스레드 처리와 관련이 있다.
	}
}

// 실행 결과
/*
1-1 : false
1-2 : false
2-1 : true
2-2 : true
3-1 : NewCar@15db9742
3-2 : NewCar@6d06d69c
3-3 : NewCar@15db9742
4-1 : 366712642
4-2 : 1829164700
4-3 : 366712642
5-1 : class NewCar
5-2 : class NewCar
5-3 : class NewCar
계속하려면 아무 키나 누르십시오 . . .
*/