 /*==================================
   ���� ���������� �������� ����
====================================*/

// ���� ������ �ʱ�ȭ �׽�Ʈ

// Test070.java �� �� ~!!

/*
Ŭ���� ������ ���赵�� ��ü�� �ִ°� �ƴ�
�׳� �ϵ��ũ�� �ִ°�. 
�޼ҵ忡�� ȣ���ؾ� �� �� �޸𸮿� �ö� !
*/
public class Test071
{
	// Ŭ������ ����

	// ���� ���� a ���� => Ŭ���� ���� (X)
	int a;
	//-- �ڹٰ� �ڵ����� 0 ���� �ʱ�ȭ ����

	boolean b;
	//-- �ڹٰ� �ڵ����� false �� �ʱ�ȭ ����

	char c;
	//-- �ڹٰ� �ڵ����� �ƹ��͵� ���� ���� ���� �� ���� �ʱ�ȭ ����

	double d;
	//-- �ڹٰ� �ڵ����� 0.0 ���� �ʱ�ȭ ����

	public static void main(String[] args)
	{
		// �޼ҵ��� ����
		
		//System.out.println("a : " + a);
		// ==> ���� �߻� (������ ����)
		//	non-static variable a cannot be referenced from a static context
		//	==> class Test071 ���赵 �ȿ� int a �ֱ�� ������
		//      ���赵�� �ִ°��� ���� Test071 class�� �޸𸮿� �ö���� �ʾƼ�
		//		���� a�� ���� ������ ����

		// Test071 Ŭ������ ������� �ν��Ͻ� ����
		Test071 ob = new Test071();

		System.out.println("ob.a : " + ob.a);
		// ==> ob.a : 0
		// ==> �ڹٰ� �ڵ����� 0���� �ʱ�ȭ ��������
		// Line19 �� ����Ǿ� �ִ� a�� �����Ѱ� �ƴ϶�
		// �޸𸮿� �ö� �ִ� a�� �����Ѱ�

		System.out.println("ob.b : " + ob.b);
		// ==> ob.b : false

		System.out.println("ob.c : " + ob.c);
		// ==> ob.c : 

		System.out.println("ob.d : " + ob.d);
		// ==> ob.d : 0.0
	}
	/*
	�ٸ��޼ҵ�1()
	{		
	}
	*/

	/*
	�ٸ��޼ҵ�2()
	{	
	}
	*/
}

// ���� ���
/*

*/