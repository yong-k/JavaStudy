 /*===================
   ■■■ 배열 ■■■
=====================*/

// 배열의 복사

// Test099.java 파일과 비교~!!!

/*
※ 배열 변수의 복사에는 데이터 복사, 주소값 복사 두 가지 형태가 존재한다.
   주소값 복사 → 얕은 복사 → 원본을 수정하면 복사본에 영향을 미치게 되는 복사 방법
   							   (배열 뿐 아니라 모든 참조형 데이터에 해당되는 복사 방법)
   데이터 복사 → 깊은 복사 → 실제 요소로 들어있는 값에 대한 복사로
   							   원본을 수정해도 복사본에 영향을 미치지 않는 복사 방법
*/

// 주소값 복사

public class Test098_얕은복사
{
	public static void main(String[] args)
	{
		int[] nums = { 10, 20, 30, 40, 50 };	//-- 배열 원본
		int[] copys;							//-- 복사본으로 만들 배열

		int temp;								//-- 데이터 저장 임시 변수

		// check~!!!
		copys = nums;							//-- 복사 ~ !
		//-- 복사 발생 지점 확인

		temp = nums[0];							// temp = 10;
		
		nums[0] = 1000;							//-- 1000 20 30 40 50
		//-- 이미 복사해놓은 다음에, 원본 배열 수정
		//	 copys 배열 건드리지 않음
	
		// copys 배열의 전체 요소 출력			//-- 1000 20 30 40 50
		for (int i = 0; i < copys.length; i++)
			System.out.print(copys[i] + " ");
		System.out.println();

		// *** << 참초 타입 객체에 모두 해당되는 내용 >>> ***
		// 둘이 서로 다른 메모리 공간에 같은 주소값을 저장하고 있다.
		// 그 주소값을 따라가면 값이 있음
		// 둘이 주소값이 같으므로, 값을 바꾸면 둘 다 바뀜

		// temp 값도 바껴있는지 확인! 
		System.out.println("temp : " + temp);	// 10
		// 안 바꼈음
		// temp는 참조 타입이 아니라 <값 타입> !!
		// temp 주소 따라가면 10 값이 담겨있음
		// nums[0]의 주소가 담겨있었던 게 아님
	}
}

// 실행 결과
/*

*/