 /*=================================
   ■■■ 클래스와 인스턴스 ■■■
===================================*/

/*
사용자로부터 임의의 정수를 입력받아
1부터 입력받은 수까지의 합을 연산하여
결과값을 출력하는 프로그램을 구현한다.

단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
또한, 입력 처리 과정에서 BufferedReader 의 ReadLine()을 사용하며,
입력 데이터가 1 보다 작거나 1000 보다 큰 경우
다시 입력받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다.

실행 예)
임의의 정수 입력 (1~1000) : 1050
임의의 정수 입력 (1~1000) : -45
임의의 정수 입력 (1~1000) : 100
>> 1 ~ 100 까지의 합 : 5050
계속하려면 아무 키나 누르세요...
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	int inputNum;

	// 입력 메소드 정의
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			inputNum = Integer.parseInt(br.readLine());
		}
		while (inputNum < 1 || inputNum > 1000);
	}
	
	// 연산 처리 메소드 정의
	int calSum()
	{
		int sum = 0;

		for (int i = 1; i <= inputNum; i++)
			sum += i;

		return sum;
	}

	// 출력 메소드 정의
	void print(int sum)
	{
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", inputNum, sum);
	}

}

public class Test074
{
	public static void main(String[] args) throws IOException
	{
		// Hap 인스턴스 생성
		Hap hap = new Hap();

		// 생성한 인스턴스를 통해 입력 메소드 호출 → input()
		// ----------------------
		//		참조변수 활용
		hap.input();

		// 생성한 인스턴스를 통해 연산 처리 메소드 호출 
		int sum = hap.calSum();

		// 생성한 인스턴스를 통해 출력 메소드 호출
		hap.print(sum);
			// int sum 안쓰고 2그냥 바로 아래처럼 해도 됨
		//hap.print(hap.calSum());
	}
}

// 실행 결과
/*
임의의 정수 입력(1~1000) : 10500
임의의 정수 입력(1~1000) : -10500
임의의 정수 입력(1~1000) : 456456
임의의 정수 입력(1~1000) : 100
>> 1 ~ 100 까지의 합 : 5050
계속하려면 아무 키나 누르십시오 . . .
*/