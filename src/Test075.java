 /*=================================
   ■■■ 클래스와 인스턴스 ■■■
===================================*/

/*
사용자로부터 임의의 두 정수와 연산자를 입력받아
해당 연산을 수행하는 프로그램을 구현한다.
단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.
 - Scanner 사용

실행 예)
임의의 두 정수 입력(공백으로 구분) : 10 5
임의의 연산자 입력 [ +  -  *  / ]  : +
>> 10 + 5 = 15
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// 주요 변수 선언
	int num1, num2;
	String op;
	//char op;

	// 메소드 정의(기능 : 입력)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백으로 구분) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.print("임의의 연산자 입력 [ +  -  *  / ]  : ");
		op = sc.next();
		//op = (char)System.in.read();
	}

	// 메소드 정의(기능 : 연산)
	int cal()
	{
		int result = 0;
/*
		if (op == '+')
			result = num1 + num2; 
		else if (op == '-')
			result = num1 - num2;
		else if (op == '*')
			result = num1 * num2;
		else if (op == '/')
			result = num1 / num2;
		else
			System.out.println("연산자[ +  -  *  / ] 입력 오류");
*/
// 현재는 Scanner로 문자열 == 비교 할 줄 모르므로,
// Scanner 사용 시 switch로 op 비교함
		switch (op)
		{
		case "+" : 
			result = num1 + num2; 
			break;
		case "-" :
			result = num1 - num2; 
			break;
		case "*" :
			result = num1 * num2; 
			break;
		case "/" :
			result = num1 / num2; 
			break;
		/*
		default:
			System.out.println("연산자[ +  -  *  / ] 입력 오류"); 
			break;		
		==> 이 처리 여기서 하는 거 바람직하지 않음
		==> int type을 반환하는 메소드이기 때문
		    default 구문 혼자 String type 반환하는 거 바람직하지 X
		==> 차라리 오류일 때, 이 연산에서 나오지 않을 값인
		                      -9999999 를 반환하는게 더 나음
		*/
		}
		
		return result;
	}

	// 메소드 정의(기능 : 출력)
	void print(int result)
	{
		System.out.printf(">> %d %s %d = %d\n", num1, op, num2, result);
	}
}

public class Test075
{
	public static void main(String[] args) throws IOException
	{
		Calculate cal = new Calculate();
		cal.input();
		int result = cal.cal();
		cal.print(result);
	}
}

// 실행 결과
/*
임의의 두 정수 입력(공백으로 구분) : 10 2
임의의 연산자 입력 [ +  -  *  / ]  : +
>> 10 + 2 = 12
계속하려면 아무 키나 누르십시오 . . .

임의의 두 정수 입력(공백으로 구분) : 10 2
임의의 연산자 입력 [ +  -  *  / ]  : /
>> 10 / 2 = 5
계속하려면 아무 키나 누르십시오 . . .
*/