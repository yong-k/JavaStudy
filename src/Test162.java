 /*========================================================
   ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
==========================================================*/

import java.util.Vector;
import java.util.Collections;

public class Test162
{
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors
		= { "검정", "노랑", "초록", "파랑", "빨강", "연두"};

	public static void main(String[] args)
	{
		// 벡터 자료구조 생성
		Vector<String> v = new Vector<String>();

		// 벡터 자료구조 v 에 colors 배열 데이터를 요소로 추가
		for (String color : colors)
			v.add(color);

		System.out.println("첫 번째 요소 : " + v.firstElement());
		System.out.println("두 번째 요소 : " + v.get(1));
		System.out.println("마지막  요소 : " + v.lastElement());
		System.out.println("요소의  개수 : " + v.size());
		//--==>
		/*
		첫 번째 요소 : 검정
		두 번째 요소 : 노랑
		마지막  요소 : 연두
		요소의  개수 : 6
		*/

		// ○ 첫 번째 요소를 "하양"으로 변.경. → set()
		v.set(0, "하양");
		System.out.println("첫 번째 요소 : " + v.firstElement());
		System.out.println("두 번째 요소 : " + v.get(1));
		System.out.println("요소의  개수 : " + v.size());
		//--==> 
		/*
		첫 번째 요소 : 하양
		두 번째 요소 : 노랑
		요소의  개수 : 6
		*/


		// ○ 첫 번째 요소에 "주황" 추.가. → insertElementAt()
		v.insertElementAt("주황", 0);

		
		// ○ 전체 출력
		System.out.print("전체 출력 : ");
		for(String str : v)
			System.out.print(str + " ");
		System.out.println();
		//--==> 전체 출력 : 하양 노랑 초록 파랑 빨강 연두


		// ○ 오름차순 정렬 (ㄱㄴㄷ 순, 사전식배열)
		Collections.sort(v);

		// ○ 오름차순 정렬 후 전체 출력
		System.out.print("오름차순 정렬 후 전체 출력 : ");
		for(String str : v)
			System.out.print(str + " ");
		System.out.println();
		//--==> 오름차순 정렬 후 전체 출력 : 노랑 빨강 연두 초록 파랑 하양


		// ○ 벡터의 요소를 검색
		// Collections.binarySearch();
		// 검색 기능 수행 ==> 인덱스를 반환함
		// *** 단, 오름차순 정렬이 수행되어 있는 자료에 대해서만 사용이 가능하다. *** check~!!!
		// 검색 결과가 존재하지 않을 경우 음수를 반환한다.

		int idxBlue = Collections.binarySearch(v, "파랑");
		System.out.printf("파랑 : %d 번째 인덱스에 위치하고 있다.\n", idxBlue);
		//--==> 파랑 : 4 번째 인덱스에 위치하고 있다.

		// "주황 추가 후, 출력 내용 변경
		/*
		48, 49 line 에서 "주황" 추가하게 되면, 출력내용도 바뀜
		전체 출력 : 주황 하양 노랑 초록 파랑 빨강 연두
		오름차순 정렬 후 전체 출력 : 노랑 빨강 연두 주황 초록 파랑 하양
		파랑 : 5 번째 인덱스에 위치하고 있다.
		*/
		System.out.println();

		int idxNavi = Collections.binarySearch(v, "남색");
		System.out.printf("남색 : %d 번째 인덱스에 위치하고 있다.\n", idxNavi);
		//--==> 남색 : -1 번째 인덱스에 위치하고 있다.
		// -1 이라고 나온다는 건 → '검색 결과 없음' 의미

		System.out.println();

		// ○ 내림차순 정렬 → 내림차순 수행하는 메소드 별도로 없음
		// 그럼 내림차순 어떻게 해?
		// 2번째 파라미터 값으로, Collections 가 가지고 있는 reverseOrder() 메소드 사용
		Collections.sort(v, Collections.reverseOrder());

		// ○ 내림차순 정렬 후 전체 출력
		System.out.print("내림차순 정렬 후 전체 출력 : ");
		for(String str : v)
			System.out.print(str + " ");
		System.out.println();
		//--==> 내림차순 정렬 후 전체 출력 : 하양 파랑 초록 주황 연두 빨강 노랑

		// ※ 내림차순 정렬 후 검색 테스트
		// *** 오름차순 정렬이 수행되어 있는 자료에 대해서만 검색 가능하다. *** 
		idxBlue = Collections.binarySearch(v, "파랑");
		System.out.printf("파랑 : %d 번째 인덱스에 위치하고 있다.\n", idxBlue);
		//--==> 파랑 : -8 번째 인덱스에 위치하고 있다.
		// 음수 반환 → 검색 결과 없음 !!
		// 파랑 정말 저 안에 없어? NO
		// 그럼 정말 저 안에서 파랑 못찾는거야? No . 방법 있음

		// Collections.binarySearch() 의
		// 3번째 파라미터 값으로, Collections.reverseOrder() 넣어주면 검색 가능 !
		idxBlue = Collections.binarySearch(v, "파랑", Collections.reverseOrder());
		System.out.printf("파랑 : %d 번째 인덱스에 위치하고 있다.\n", idxBlue);
		System.out.println();
		//--==> 파랑 : 1 번째 인덱스에 위치하고 있다.
	}
}

// 실행 결과
/*

*/