 /*=======================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=========================================*/

// Wrapper Ŭ����
// BigInteger Ŭ������ lang ��Ű���� ��� import �������
// =================
// => �������·� ��û���� ū ���ڸ� ó���Ϸ��� �� �� ���

import java.math.BigInteger;

public class Test134
{
	public static void main(String[] args)
	{
		//int a1 = 123456789123456789;
		//System.out.println(a1);
		//--==> ���� �߻� (������ ����) 
		// error: integer number too large: 123456789123456789
		// int�� �� +-21�� ���� �� �ֱ� ������ ������

		//long b1 = 123456789123456789;
		//System.out.println(b1);
		//--==> ���� �߻� (������ ����) 
		// error: integer number too large: 123456789123456789
		// long ���� �� ��Ƽ� ����� ������ �ƴ϶�,
		// �ڿ� ����� ���� int�� 4byte�� ��Ҵٰ� long ���� ��µ�,
		// 4byte �� ����Ƽ� ����� ������!!
		// ���� �ڿ� ���̻� l �Ǵ� L �� �Ἥ ����� ����!

		long b1 = 123456789123456789L;
		System.out.println(b1);		// 123456789123456789

		//long b1 = 123456789123456789123456789L;
		//System.out.println(b1);	
		//--==> ���� �߻� (������ ����) 
		// error: integer number too large: 123456789123456789123456789
		// ���ڰ� �ʹ� Ŀ�� long type �� ���� ����
		// �׷� �̷� ū ���ڴ� ��� ������?
	
		// BigInteger 
		// => byte, short, int, long �� ���� ���ϴ� ū �� ��� ���� ���� ��
		// �����ڿ� ���ڿ� ������ ���� �Ѱܹ���. ��?
		// �������� �ϴ� 4byte�� ó���ϴµ� ������
		// long type ���� ���� ���ϴ� ���� ó���Ϸ��� �ϴϱ� L �ٿ��� ����������
		// �ű⼭���� �������� BigInteger�� �������� ���ϴϱ� ���ڿ��� �Ѱ� ����
		BigInteger a = new BigInteger("123456789123456789");
		BigInteger b = new BigInteger("123456789123456789");
		
		// �Ϲ����� ������� ���� �Ұ�
		//BigInteger c = a + b;
		//System.out.println(c);

		// ���ϱ� : BigInteger.add(BigInteger type ����)
		BigInteger c = a.add(b);
		System.out.println("���� ��� : " + c);		
		//--==> ���� ��� : 246913578246913578

		// ���� : BigInteger.subtract(BigInteger type ����)
		BigInteger d = a.subtract(b);
		System.out.println("���� ��� : " + d);		
		//--==> ���� ��� : 0

		// ���ϱ� : BigInteger.multiply(BigInteger type ����)
		BigInteger e = a.multiply(b);
		System.out.println("���� ��� : " + e);		
		//--==> ���� ��� : 15241578780673678515622620750190521

		// ������ : BigInteger.divide(BigInteger type ����)
		BigInteger f = a.divide(b);
		System.out.println("������ ��� : " + f);		
		//--==> ������ ��� : 1

		// ������ : BigInteger.pow(�� ��)
		BigInteger g = new BigInteger("2");
		System.out.println("2�� 3���� : " + g.pow(3));
		//--==> 2�� 3���� : 8

	}
}

// ���� ���
/*
123456789123456789
���� ��� : 246913578246913578
���� ��� : 0
���� ��� : 15241578780673678515622620750190521
������ ��� : 1
2�� 3���� : 8
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/