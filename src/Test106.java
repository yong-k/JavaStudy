 /*==================================================
   ■■■ 메소드 중복정의(Method Overloading) ■■■
====================================================*/

// Method Overloading 이 가능한 형태와 불가능한 형태

public class Test106
{
	public static void main(String[] args)
	{
		//print(3.14);
		//double result = print(3.14);
		// 이 두 문장을 봤을 때, 우리는 
		//public static double print(double e) { return 10.0; }	
		//public static void print(double d) {}
		// 중 뭐를 부른지 구별 가능하지만,
		// **** 자바는 (대입연산자) 일단 오른쪽부터 봄 --> print(3.14); 만 먼저 봄 **** 
		// 그렇기 때문에 구별이 안됨,,!!!

	}

	public static void print() {}
	//public static void print() {}			//-- (X)
	public static void print(int i) {}
	//public static void print(int j) {}	//-- (X)
	public static void print(char c) {}		//-- 자동 형 변환 규칙 check~!!!
		// --> 가능은 한데 조심해야함
		// char → int 로 자동형변환 되니까,,,
		// ** 자동형변환 규칙 잘 확인하면서 만들기 **
	public static void print(int i, int j) {}
	public static void print(double d) {}
	//public static void print(double e) { return 10.0; }		//-- 정의 불가
		//-- return 자료형 void 라 아예 정의 불가함
	//public static double print(double e) { return 10.0; }		//-- (X)

}
