 /*=======================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=========================================*/

// Wrapper Ŭ����

public class Test136
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		// ��ü ����ߴµ�, ���빰 �� ������ ����
		System.out.println(b2);		// 3
		System.out.println(i2);		// 256

		print(b2);
		print(i2);

		// Byte Ŭ������ byteValue() �޼ҵ� ȣ��
		byte b3 = b2.byteValue();	// ��ڽ�
		
		// Integer Ŭ������ intValue() �޼ҵ� ȣ��
		int i3 = i2.intValue();		// ��ڽ�

		// check~!!!
		int i4 = b2.byteValue();
		//		---------------
		//		Byte ��ü�� �ƴ϶� primitive Ÿ���� byte �� ��ȯ
		//		=> �׸��� �װ� int Ÿ�Կ� ����� ���

		//byte b4 = i2.intValue();	// ���� �߻�(������ ����)
		// �̰� �ڵ�����ȯ ��Ģ�� ����ǹǷ� ������
		// error: incompatible types: possible lossy conversion from int to byte
		byte b4 = i2.byteValue();	// �̷��� �ؾ� ��

		System.out.println(b3);		// 3
		System.out.println(i3);		// 256

		// check~!!!
		System.out.println(b4);		// 0
		//--> byte type ��ȯ������, 256�� �����°� �ƴ϶� 0 ����
		// ��ȯ���� byte�� ��ȯ�ϴ� �� ������, byte���� ������ �� ���� ��
		// �׷� ��쿡 ������ �߻����� ������ �߸��� �� ��ȯ��!
		System.out.println(i4);		// 3


	}
/*	// print() �޼ҵ� �ϳ��� �����ص� �Ʒ� 2�� ����ϰ� ������

	static void print(Byte b)
	{
		System.out.println(b);
	}

	static void print(Integer i)
	{
		System.out.println(i);
	}

*/

// ���� �� ��  (Object ���� �� �� �ʹ� �������� �� ��)
// �ֻ����� �ִ� ��üŸ���̱� ������... ��� Ÿ���� ���������� �ٶ������� �ʴ�.
// ���� �� Object�� ����� ���� ���� ���� ���� �� ����
/*
	static void print(Object obj)
	{
		System.out.println(obj);
	}
*/
	// java.lang.Number Ŭ����(�߻� Ŭ����)��
	// ��� ������ Wrapper Ŭ�������� �θ� Ŭ����
	// (���� Ŭ����, ���� Ŭ����)�̴�.
	// b2, i2 �ڷ����� Number �� �Ѿ���鼭
	// �� ĳ������ �Ͼ�� �ȴ�.
	// Auto-Boxing �� �Ͼ�� �ȴ�.
	static void print(Number n)	
	{
		// �Ʒ� �� �� ���� �ϳ� �������
		System.out.println(n);
		System.out.println(n.intValue());
	}

}
// ���� ���
/*
3
256
3
3
256
256
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/