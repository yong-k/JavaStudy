 /*==================================================
   ���� �޼ҵ� �ߺ�����(Method Overloading) ����
====================================================*/

// Method Overloading �� ������ ���¿� �Ұ����� ����

public class Test106
{
	public static void main(String[] args)
	{
		//print(3.14);
		//double result = print(3.14);
		// �� �� ������ ���� ��, �츮�� 
		//public static double print(double e) { return 10.0; }	
		//public static void print(double d) {}
		// �� ���� �θ��� ���� ����������,
		// **** �ڹٴ� (���Կ�����) �ϴ� �����ʺ��� �� --> print(3.14); �� ���� �� **** 
		// �׷��� ������ ������ �ȵ�,,!!!

	}

	public static void print() {}
	//public static void print() {}			//-- (X)
	public static void print(int i) {}
	//public static void print(int j) {}	//-- (X)
	public static void print(char c) {}		//-- �ڵ� �� ��ȯ ��Ģ check~!!!
		// --> ������ �ѵ� �����ؾ���
		// char �� int �� �ڵ�����ȯ �Ǵϱ�,,,
		// ** �ڵ�����ȯ ��Ģ �� Ȯ���ϸ鼭 ����� **
	public static void print(int i, int j) {}
	public static void print(double d) {}
	//public static void print(double e) { return 10.0; }		//-- ���� �Ұ�
		//-- return �ڷ��� void �� �ƿ� ���� �Ұ���
	//public static double print(double e) { return 10.0; }		//-- (X)

}
