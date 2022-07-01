 /*========================================================
   ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
==========================================================*/
/*
Test 165 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.

실행 예)
	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 1

	1번째 요소 입력 : 박현수				 (←사용자가 입력)
	1번째 요소 입력 성공~!!!
	요소 입력 계속하시겠습니까? (Y/N) : y	 (대소문자 구분 X)

	2번째 요소 입력 : 오이삭				 (←사용자가 입력)
	2번째 요소 입력 성공~!!!
	요소 입력 계속하시겠습니까? (Y/N) : N

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 2

	[벡터 전체 출력]
		박현수
		오이삭
	벡터 전체 출력 완료~!!!

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 3

	검색할 요소 입력 : 오이삭				 (←사용자가 입력)

	[검색 결과 출력]
	항목이 존재합니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 3

	검색할 요소 입력 : 임소민

	[검색 결과 출력]
	항목이 존재하지 않습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 4

	삭제할 요소 입력 : 홍은혜

	[삭제 결과 출력]
	항목이 존재하지 않아 삭제할 수 없습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 4

	삭제할 요소 입력 : 박현수

	[삭제 결과 출력]
	박현수 항목이 삭제되었습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 5

	변경할 요소 입력 : 김민성

	[변경 결과 출력]
	변경할 대상이 존재하지 않습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 5

	변경할 요소 입력 : 오이삭
	수정할 내용 입력 : 정은정

	[변경 결과 출력]
	변경이 완료되었습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 2

	[벡터 전체 출력]
		정은정
	벡터 전체 출력 완료~!!!
	
	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 6
	
	프로그램 종료
	계속하려면 아무 키나 누르세요...
*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Menus	// → 완성
{
	public static final int E_ADD  = 1;		//-- 요소 추가
	public static final int E_DISP = 2;		//-- 요소 출력 
	public static final int E_FIND = 3;		//-- 요소 검색
	public static final int E_DEL  = 4;		//-- 요소 삭제
	public static final int E_CHA  = 5;		//-- 요소 변경
	public static final int E_EXIT = 6;		//-- 종료
}

public class Test165
{
	// 주요 속성 구성 → 완성
	private static final Vector<Object> vt;		//-- 자료 적재 시 활용(자료구조)
	private static BufferedReader br;			//-- 입력 받을 때 활용
	private static Integer sel;					//-- 선택 값 처리 활용
	private static String con;					//-- 계속 여부 처리 

	// static 초기화 블럭
	static
	{
		// Vector 자료구조 생성
		vt = new Vector<Object>();

		// BufferedReader 클래스 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자 입력값 초기화
		sel = 1;
		con = "Y";
	}

	// 메뉴 출력 메소드
	public static void menuDisp()
	{
		System.out.println("======== [메뉴 선택] ========");
		System.out.println("\t1. 요소 추가");
		System.out.println("\t2. 요소 출력");
		System.out.println("\t3. 요소 검색");
		System.out.println("\t4. 요소 삭제");
		System.out.println("\t5. 요소 변경");
		System.out.println("\t6. 종료");
		System.out.println("=============================");
	}

	// 메뉴 선택 메소드
	public static void menuSelect() throws IOException, NumberFormatException
	{
		do
		{
			System.out.print(">> 메뉴 선택(1 ~ 6) : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel < 1 || sel > 6);
	}

	// 선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException
	{
		if (sel == Menus.E_EXIT)		//-- 6. 종료
			exit();
		else if (sel == Menus.E_ADD)	//-- 1. 요소 추가
			addElement();
		else if (sel == Menus.E_DISP)	//-- 2. 요소 출력
			dispElement();
		else if (sel == Menus.E_FIND)	//-- 3. 요소 검색
			findElement();
		else if (sel == Menus.E_DEL)	//-- 4. 요소 삭제
			delElement();
		else if (sel == Menus.E_CHA)	//-- 5. 요소 변경
			chaElement();
			
	}

	// 1) 자료구조에 요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{
		while (con.equalsIgnoreCase("y"))
		{
			System.out.printf("\n%d번째 요소 입력 : ", vt.size() + 1);
			vt.add(br.readLine());  
			
			System.out.printf("%d번째 요소 입력 성공~!!!\n", vt.size());

			System.out.print("요소 입력 계속하시겠습니까?(Y/N) : ");
			con = br.readLine();
		}
		System.out.println();
	}
	
	// 2) 자료구조 전체 요소 출력 메소드
	public static void dispElement()
	{
		System.out.println("\n[벡터 전체 출력]");
		for (Object ob : vt)
			System.out.print("     " + ob + "\n");
		System.out.println("벡터 전체 출력 완료~!!!\n");
	}

	// 3) 자료구조 내 요소 검색 메소드
	public static void findElement() throws IOException
	{
		int index;

		System.out.print("\n검색할 요소 입력 : ");
		index = vt.indexOf(br.readLine());

		System.out.println("\n[검색 결과 출력]");
		if (index >= 0)
			System.out.println("항목이 존재합니다.\n");
		else
			System.out.println("항목이 존재하지 않습니다.\n");		
	}

	// 4) 자료구조 내 요소 삭제 메소드
	public static void delElement() throws IOException
	{
		int index;

		System.out.print("\n삭제할 요소 입력 : ");
		index = vt.indexOf(br.readLine());

		System.out.println("\n[삭제 결과 출력]");
		if (index >= 0)
		{
			System.out.printf(vt.get(index) + " 항목이 삭제되었습니다.\n\n");
			vt.remove(index);
		}
		else 
			System.out.println("항목이 존재하지 않아 삭제할 수 없습니다.\n");	
	}

	// 5) 자료구조 내 요소 수정 메소드
	public static void chaElement() throws IOException
	{
		int index;

		System.out.print("\n변경할 요소 입력 : ");
		index = vt.indexOf(br.readLine());

		if (index >= 0)
		{
			System.out.print("수정할 내용 입력 : ");
			vt.set(index, br.readLine());
		}
		
		System.out.println("\n[변경 결과 출력]");
		if (index >= 0)
			System.out.println("변경이 완료되었습니다.\n");
		else
			System.out.println("변경할 대상이 존재하지 않습니다.\n");
	}

	// 6) 프로그램 종료 메소드 → 완성
	public static void exit()
	{
		System.out.println("\n프로그램 종료~!!!");
		System.exit(-1);
	}

	// main() 메소드 → 완성
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}

// 실행 결과
/*

*/