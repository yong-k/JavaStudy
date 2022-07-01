 /*================================
   ■■■ 클래스와 인스턴스 ■■■
==================================*/

// 정보 은닉과 접근 제어 지시자(접근지정자, 접근제한자, ...)

import java.util.Scanner;

class CircleTest2
{

	// 멤버 변수, 인스턴스 변수, 전역 변수
	//int num;

	//    ↓

	// 정보 은닉(Information Hiding)
	// 『private』이라는 접근제어지시자의 선언은
	// 클래스 내부에서만 접근 및 참조가 가능하게 하겠다는 의미
	// int 형 전역 변수 → 자동 0으로 초기화 지원
	private int num;

	// getter / setter 구성
/*
	int getNum()
	{
		return num;
	}

	void setNum(int num)
	{
		this.num = num;
	}
*/
	// private 빼면 getter, setter 없이 더 편하고 짧은거 아니야?
	// 근데 왜 써?
	// => private 없으면 num은 외부에 무방비상태
	//	  그 변수에 사용자가 무슨 짓을 하던 막을 방법 없음
	//    private으로 놔두고 메소드를 통해 처리하게 되면,
	//    그 안에 우리가 조건문도 구성해서, 예를들어, 
	//			   =>  0보다 작은 수 들어오면 num 값 세팅하지마! 할 수도 있음
	//    상황에 따라서 가져다 쓰는 건 못하지만, 세팅만 되게 하거나
	//                  가져다 쓰는 건 가능하나, 세팅은 불가하게도 할 수 있음

	// =====> 코드를 줄이는 것보다 이게 더 중요하다고 판단함  
	
	// 나중에 getter/setter 자세히 볼거임

	// 변수 private 해놓으면, 이 메소드에 접근하지 않으면 값 지정할 수 있는 방법 없음
	// input() 메소드 통해서만 값 지정 가능
	void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("반지름 입력 : ");
		num = sc.nextInt();
	}

	double calArea()
	{
		return num * num * 3.141592;
	}

	void write(double area)
	{
		System.out.println("반지름 : " + num);
		System.out.println("넓이   : " + area);
	}
}

public class Test100_정보은닉private
{
	public static void main(String[] args)
	{
		CircleTest2 ob1 = new CircleTest2();

		//ob1.num = 10;
		//System.out.println("원의 반지름 : " + ob1.num);
		// num이 private 변수라 값 대입, 값 확인 불가 → 에러남
		// 접근자체가 불가함

		// getter, setter 구성해놓으면, 위에 두 구문대신에
		//ob1.setNum(10);
		//System.out.println("원의 반지름 : " + ob1.getNum());

		ob1.input();
		
		double result = ob1.calArea();
		ob1.write(result);
	}
}

// 실행 결과
/*
반지름 입력 : 500
반지름 : 500
넓이   : 785398.0
계속하려면 아무 키나 누르십시오 . . .
*/