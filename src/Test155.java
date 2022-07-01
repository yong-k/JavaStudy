 /*===================================
   ���� ����(Exception) ó�� ����
======================================*/

// �ٸ� ���� �ٽ� ������
// ���� ���� ���ܴ� ������ź�ε�, �ٽ� ������ �� �Ķ����� ����

public class Test155
{
	public int getValue(int value) throws Exception				// �� ���� ������ (�Ķ� ��ź)
	{
		int a = 0;

		//a = getData(-2);		// �� ���� �߻� (���� ��ź) => try-catch�� ó��
		try
		{
			a = getData(-2);									// �� ���� �߻� (���� ��ź)
		}
		catch (Exception e)										
		{
			// �� ���� ó�� (���� ��ź)
			// ����� ������ ����(���� ��ź)�� �갡 ó���ѰŰ�,
			System.out.println("printStackTrace.........");
			e.printStackTrace();

			// �� ���� �߻� (�Ķ� ��ź)
			//throw e;	//--> �׳� ���� ����
			// �̹����� ���� ���ܸ� �״�� �����ϴ°� �ƴ϶�
			// �Ķ� ��ź�� ���� ����
			throw new Exception("value �� �����Դϴ�.");
		}

		

		return a;
	}

	public int getData(int data) throws Exception				// �� ���� �ѱ�� (���� ��ź)
	{
		if (data < 0)
		{
			throw new Exception("data �� 0 ���� �۽��ϴ�.");	// �� ���� �߻� (���� ��ź)
		}

		return data + 10;
	}

	public static void main(String[] args)
	{
		Test155 ob = new Test155();

		//int a = ob.getValue(-2);		// �� ���� �߻� (�Ķ� ��ź) => try-catch�� ó��
		try
		{
			int a = ob.getValue(-2);							// �� ���� �߻� (�Ķ� ��ź)

			System.out.println("a : " + a);
		}
		catch (Exception e)										// �� ���� ��Ƴ��� (�Ķ� ��ź)
		{
			// �� ���� ó�� (�Ķ� ��ź)
			System.out.println("printStackTrace.........");
			e.printStackTrace();
		}
	}
}

// ���� ���
/*
printStackTrace.........
java.lang.Exception: data �� 0 ���� �۽��ϴ�.
        at Test155.getData(Test155.java:42)
        at Test155.getValue(Test155.java:17)
        at Test155.main(Test155.java:55)
------------------------------------------------------> ���� ��ź�� ���� ó��

printStackTrace.........
java.lang.Exception: value �� �����Դϴ�.
        at Test155.getValue(Test155.java:30)
        at Test155.main(Test155.java:55)
------------------------------------------------------> �Ķ� ��ź�� ���� ó��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/