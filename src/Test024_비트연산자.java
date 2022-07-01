/*====================================
   ■■■ 연산자 (Operator) ■■■
======================================*/

// 비트 단위 연산자 => 다른 연산자에 비해 처리 속도 굉장히 빠름
	//				=> 그 안에서도 비트시프트 연산이 빠름
	// 경력자와 초심자 많이 차이 나는 부분
	

public class Test024_비트연산자
{
	public static void main(String[] args)
	{
		int a = 10, b = -10;

		System.out.printf("~a : %d\n", ~a);
		System.out.printf("~b : %d\n", ~b);
	}
}

// 실행 결과
/*
~a : -11
~b : 9
계속하려면 아무 키나 누르십시오 . . .
*/

/* << 위에 결과 왜 그렇게 나오는지 확인해보는 과정 >>

a = 10 -> 00001010	(앞에 00000000 3묶음 더 있지만, 계속 반복해야하므로 설명상 생략)
	         ↓ ~a
		  11110101 => -11
		 ==> -11 맞는지 체크 위해 반전시켜서 + 1 한 걸 11110101과 더해서 0 나오는지 확인
		  00001010 + 1 => 00001011
		  				+ 11110101
						-----------
						  00000000

b = -10		=> 바로 -10 비트 파악못하니 10부터 생각해서, 반전시켜서 1 더함
10: 00001010
		↓
	11110101	(반전)
	+	   1
	---------
	11110110 => -10
		↓ ~b
	00001001 => 9
	==> 8*1 + 1*1 = 9 맞음
*/