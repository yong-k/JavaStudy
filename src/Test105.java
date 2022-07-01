 /*==================================================
   ���� �޼ҵ� �ߺ�����(Method Overloading) ����
====================================================*/
/*
- �޼ҵ� �����ε��� ����
  �޼ҵ� �����ε�(Overloading)�̶�
  �޼ҵ尡 ó���ϴ� ����� ����
  �޼ҵ� ��ȣ �ӿ� ���� �μ�(����, �Ű�����, �Ķ����)�� ������ �ٸ��ų�
  �ڷ���(Data Type)�� �ٸ� ���
  �޼ҵ��� �̸��� ������ �̸����� �ο��Ͽ� �޼ҵ带 ������ �� �ֵ���
  ���������� ����ϰ� �Ǵµ�
  �̸� �޼ҵ� �����ε�(Method Overloading)�̶�� �Ѵ�.

  System.out.println(); System.out.printf(); �� �޼ҵ� �����ε�
	ex)
	System.out.println(10);
	System.out.println("ABCD");
	System.out.println('K');
	System.out.println(3.141592);
	System.out.println(true);

	System.out.printf("%d\n", 10);
	System.out.printf("%d + %d = %d\n", 10, 20, 30);7
*/ 

public class Test105
{
	public static void main(String[] args)
	{
		//drawLine();	// �̷��� �� �θ�. main() �޼ҵ�� static �޼ҵ�� 
						// ���� drawLine() �� ź������ ����
		// ���1) drawLine()�� static �� ���̰�, Test105 �ν��Ͻ� �����Ѵ�.
		Test105 ob = new Test105();
		ob.drawLine();

		// ���2) drawLine() �޼ҵ忡 static �ٿ��ش�.
		drawLine();
		
		drawLine('-');

		drawLine('<');

		drawLine('+', 30); 

		drawLine('/', 50);
	}

	// ���� �׸��� �޼ҵ� ����
	//public void drawLine()
	public static void drawLine()
	{
		System.out.println("====================");
	}
	
	// ���� ���¸� �ٲپ� �׸��� �޼ҵ� ����
	public static void drawLine(char c)
	{
		for (int i = 0; i < 20; i++)
			System.out.print(c);

		System.out.println();
	}

	// ���� ���¿� ���̸� �ٲپ� �׸��� �޼ҵ� ����
	public static void drawLine(char c, int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(c);

		System.out.println();
	}
}

// ���� ���
/*
====================
====================
--------------------
<<<<<<<<<<<<<<<<<<<<
++++++++++++++++++++++++++++++
//////////////////////////////////////////////////
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/