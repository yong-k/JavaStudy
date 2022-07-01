/*===========================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
============================================*/

// if ~ else 문 실습
// 홀수, 짝수, 영

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;

		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		// 잘못된 코드
		// 조건문 구성하는 순서가 0인지를 제일 먼저 처리할 필요는 없지만
		// 적어도 짝수를 구별하는 것보다는 먼저 나와야함!!!
		/*
		if (num % 2 == 0)	// 0 도 여기에 걸려서 짝수로 나옴
			System.out.println(num + "→ 짝수");
		else if (num % 2 != 0)
			System.out.println(num + "→ 홀수");
		else
			System.out.println(num + "→ 영");
		*/

// 올바른 코드
/*		
		// 1) 홀수를 먼저 처리
		if (num % 2 != 0)	
			System.out.println(num + "→ 홀수");
		else if (num == 0)
			System.out.println(num + "→ 영");
		else
			System.out.println(num + "→ 짝수");
*/
/*
		// 2) 0을 가장 먼저 처리
		if (num == 0)	
			System.out.println(num + "→ 영");
		else if (num % 2 == 0)
			System.out.println(num + "→ 짝수");
		else
			System.out.println(num + "→ 홀수");
	}
*/
/*
		if (num == 0)	
			System.out.println(num + "→ 영");
		else if (num % 2 == 0)
			System.out.println(num + "→ 짝수");
		// ==> 여기서는 else 안 써도 오류 안 나는 이유
		// 왜냐하면, 출력 안 될게 없기 때문. 조건 외의 경우에 출력할게 없기 때문
*/

		String result;
		//해결방법2) 초기화 값 설정해두기
		//String result = "판정 불가"; 

		if (num == 0)
			result = "영";
		else if (num % 2 == 0)
			result = "짝수";
		else if (num % 2 != 0)
			result = "홀수";
		// => 여기까지만 하면 이거는 오류남
		// 왜냐하면, 조건문 결과로 result 에 어떤 값을 넣어서 결과적으로 출력해야함
		// 그런데 위에 3가지 경우에 안맞으면 어떡해?? 하고 에러남
		// int가 짝,홀,0 외에 없어서 모든 경우의 수로 조건 짰어도 에러남
		//위의 해결방법1 또는 아래의 방법2로 해결가능

		//해결방법2) else 문 지정
		else
			result = "판정 불가";
		
		
		System.out.println(num + " → " + result);
		
	}
}

/*
- 조건문을 구성할 때에는 항상 조건의 구성 순서에 유의해야 한다.
	ex) 짝수,홀수,0 구별할 때
		if로 0보다 짝수구별을 먼저 해버리면, 0도 짝수로 나오고 끝남

 - if~else 구문의 중첩 구문은
   반드시 else로 끝나야 하는 것이 아니다.
   다만, 출력해야 할 구문을 처리하는 과정에서 
   문제가 발생하지 않는 구문으로 작성해야 한다.

- 조건문 구성 과정에서 이외의 영역(else)을
  업무에 포함된 내용으로 처리하는 것은 바람직하지 않을 경우가 있다.
  불가능한 경우는 어쩔 수 없더라도
  가급적이면 업무에 포함되지 않는 내용을
  이외의 영역(else)에서 처리할 수 있도록 하자.
  	ex) 011 016 019 017
	if (휴대폰 앞자리가 011) {}
	else if (휴대폰 앞자리가 016) {}
	else if (휴대폰 앞자리가 019) {}
	else { 017 }
	==> 이런식으로 하지 말기!
	==> 나중에 010 등장하면 걔도 else로 같이 해결,,,됨,,,

	if (휴대폰 앞자리가 011) {}			//업무
	else if (휴대폰 앞자리가 016) {}	//업무
	else if (휴대폰 앞자리가 019) {}	//업무
	else if (휴대폰 앞자리가 017) {}	//업무
	else { "확인 필요" }				//업무이외
	==> 이런식으로 처리하는게 바람직

	ex2) 주민번호
	if (주민번호 7번째 자리가 1이면) 성별=남자
	else 여자
	==> 이렇게해버리면 지금은 3,4,5,6도 다 있는데 다 여자되어버림,,

	if (주민번호 7번째 자리가 1이면) 성별=남자			//업무
	else if (주민번호 7번째 자리가 2이면) 성별=여자		//업무
	else { "성별 확인 불가"; }							//업무이외
	==> 이런식으로 처리하는게 바람직
*/