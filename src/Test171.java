 /*========================================================
   ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
==========================================================*/

// Set → HashSet, TreeSet
//	- 순서 없음
//	- 중복을 허용하지 않는 구조(기본)

/*
○ TreeSet<E> 클래스

   java.util.TreeSet<E> 클래스는
   Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
   데이터를 추가하면 데이터들이 자동으로 오름차순 정렬이 된다.
*/ 

// VO	→ Value Object
// DTO	→ Data Transfer Object
// DAO	→ Data Access Object

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class GradeVO
{
	// 주요 속성 구성
	private String hak;			//-- 학번
	private String name;		//-- 이름
	private int kor, eng, mat;	//-- 국어, 영어, 수학 점수

	// 생성자(사용자 정의 생성자 → 5개의 매개변수를 가진 생성자)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	// 생성자(사용자 정의 생성자 → 매개변수 없는 생성자)
	//-- 매개변수가 존재하는 생성자를 사용자 정의 생성자로 구성하였기 때문에
	//   default 생성자가 자동으로 삽입되지 않을 것을 우려하여
	//   추가로 정의한 생성자
	GradeVO()
	{}

	// getter / setter 구성
	public String getHak()
	{
		return hak;
	}

	public void setHak(String hak)
	{
		this.hak = hak;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getKor()
	{
		return kor;
	}

	public void setKor(int kor)
	{
		this.kor = kor;
	}

	public int getEng()
	{
		return eng;
	}

	public void setEng(int eng)
	{
		this.eng = eng;
	}

	public int getMat()
	{
		return mat;
	}

	public void setMat(int mat)
	{
		this.mat = mat;
	}

	// 추가 메소드 정의(총점 산출)
	public int getTot()
	{
		return kor + eng + mat;
	}
}

class MyComparator<T> implements Comparator<T>
{
	// 비교 메소드 재정의
	@Override
	public int compare(T o1, T o2)
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		// 학번 기준 (오름차순)
		//return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		// 산술연산 수행했는데 s1 에서 s2 뺐는데
		// 음수 나옴 → s2 더 크다, s1 더 작다.

		// 학번 기준 (내림차순)
		//return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());
		// 산술연산 수행했는데 s2 에서 s1 꺼 뺐는데
		// 음수 나옴 → s1 더 크다, s2 더 작다.

		// 총점 기준 (오름차순)
		//return s1.getTot() - s2.getTot();

		// 총점 기준 (내림차순)
		//return s2.getTot() - s1.getTot();

		// 이름 기준 (오름차순)
		//return s1.getName().compareTo(s2.getName());

		// 이름 기준 내림차순
		return s2.getName().compareTo(s1.getName());
		
	}
}

public class Test171
{
	public static void main(String[] args)
	{
		// TreeSet 자료구조 인스턴스 생성
		TreeSet<String> set = new TreeSet<String>();

		// TreeSet 자료구조 set 에 요소 추가 → add();
		set.add("슬램덩크");
		set.add("하울의움직이는성");
		set.add("하이큐");
		set.add("토이스토리");
		set.add("알라딘");
		set.add("코코");
		set.add("심슨");
		set.add("스파이더맨");
		set.add("짱구는못말려");
		set.add("포켓몬스터");
		set.add("원피스");

		// Iterator 를 활용한 set 요소 전체 출력
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println();
		//--==> 스파이더맨 슬램덩크 심슨 알라딘 원피스 짱구는못말려 코코 
		//		토이스토리 포켓몬스터 하울의움직이는성 하이큐
		// → ㄱㄴㄷ 순으로 오름차순 정렬되어 있음

		System.out.println();

		// TreeSet 자료구조 인스턴스 생성
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		// 얘는 기본적으로 기본 lang package에서 
		// Comparator 하도록 구성되어있기 때문에 다시 정의
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());
		// 기본 lang package가 아니라, 우리가 재정의한 MyComparator 사용하여 비교

		set2.add(new GradeVO("2201123", "김민성", 90, 80, 70));
		set2.add(new GradeVO("2201124", "박현지", 91, 81, 71));
		set2.add(new GradeVO("2201125", "이윤태", 98, 79, 77));
		set2.add(new GradeVO("2201141", "정은정", 96, 86, 76));
		set2.add(new GradeVO("2201135", "김상기", 99, 82, 72));

		// Iterator 를 활용한 set 요소 전체 출력
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while (it.hasNext())
			System.out.print(it2.next() + " ");
		System.out.println();
		//--==> 에러 발생 (런타임 에러)
		//		Exception in thread "main" java.lang.ClassCastException:  
		//		GradeVO cannot be cast to java.lang.Comparable
		*/

		// 자료구조 안에 데이터의 값이 직접적으로 들어있을 때는 정렬되어 나오는데,
		// 자료구조 안에 객체를 채워넣으면, 실행도중 런타임 에러 발생함
		// 에러내용 읽어보면 → 뭔가 비교를 할 수 없는 상황임
		// 정렬할 때, 비교하고 자리바꾸고의 반복인데,
		// 객체와 객체끼리 비교가 안되는 상황이라 위와 같이 에러 발생함
		// → 그럼 비교할 수 있는 내용에 대해 별도로 정의해서
		//    객체들 사이에서도 비교 가능하게 해줘야 함
		// → 새로운 클래스 생성 → class MyComparator

		// Comparator 메소드 재정의해서, 정렬기준 정해줌!
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
			System.out.print(it2.next() + " ");
		System.out.println();
		//--==> GradeVO@15db9742 GradeVO@6d06d69c 
		//      GradeVO@7852e922 GradeVO@4e25154f GradeVO@70dea4e
		*/
	
		// 객체 속성에 접근해서 속성 얻어내기
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n", vo.getHak(), vo.getName(), 
				vo.getKor(), vo.getEng(), vo.getMat(), vo.getTot());
		}
		System.out.println();
		//--==> 학번기준 오름차순 정렬
		/*
		2201123     김민성   90   80   70    240
		2201124     박현지   91   81   71    243
		2201125     이윤태   98   79   77    254
		2201135     김상기   99   82   72    253
		2201141     정은정   96   86   76    258
		*/	

		//--==> 학번기준 내림차순 정렬
		/*
		2201141     정은정   96   86   76    258
		2201135     김상기   99   82   72    253
		2201125     이윤태   98   79   77    254
		2201124     박현지   91   81   71    243
		2201123     김민성   90   80   70    240
		*/
		
		//--==> 총점기준 오름차순 정렬
		/*
		2201123     김민성   90   80   70    240
		2201124     박현지   91   81   71    243
		2201135     김상기   99   82   72    253
		2201125     이윤태   98   79   77    254
		2201141     정은정   96   86   76    258
		*/

		//--==> 총점기준 내림차순 정렬
		/*
		2201141     정은정   96   86   76    258
		2201125     이윤태   98   79   77    254
		2201135     김상기   99   82   72    253
		2201124     박현지   91   81   71    243
		2201123     김민성   90   80   70    240
		*/

		//--==> 이름기준 오름차순 정렬
		/*
		2201123     김민성   90   80   70    240
		2201135     김상기   99   82   72    253
		2201124     박현지   91   81   71    243
		2201125     이윤태   98   79   77    254
		2201141     정은정   96   86   76    258
		*/

		//--==> 이름기준 내림차순 정렬
		/*
		2201141     정은정   96   86   76    258
		2201125     이윤태   98   79   77    254
		2201124     박현지   91   81   71    243
		2201135     김상기   99   82   72    253
		2201123     김민성   90   80   70    240
		*/
	}
}

// 실행 결과
/*

*/