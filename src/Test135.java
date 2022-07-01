 /*=======================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=========================================*/

// Wrapper Ŭ���� 
// BigDecimal Ŭ������ lang ��Ű���� ��� import �������
// =================
// => �Ǽ����·� ��û���� ū ���ڸ� ó���Ϸ��� �� �� ���

import java.math.BigDecimal;

public class Test135
{
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("123456789.123456789");

		// movePointLeft() : �Ҽ����� �Ű������� ���� ����ŭ �������� �̵�
		BigDecimal b = a.movePointLeft(3);
		System.out.println("ó�� ��� : " + b);
		//--==> ó�� ��� : 123456.789123456789

		// ���������� (��ü �Ӽ� Ȯ��, �ݿø� ���� �ʴ´� �� ����)
		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN);
		System.out.println("ó�� ��� : " + c);
		//--==> ó�� ��� : 1000.000000000
		// (����) Ŭ�����̸�.ROUND_DOWN => static final �̰ڱ���..
		
		// BigInteger ��ü�� ��ȯ
		System.out.println(a.toBigInteger());
		//--==> 123456789	(�Ǽ� �� ����ȭ ��)
		// (����) �޼ҵ� �̸� �տ� to �پ��� ?
		//		  (100%�� �ƴ����� 90% ������) ��ȯ�� �����ϴ� �޼ҵ�
	}
}

// ���� ���
/*

*/