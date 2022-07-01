 /*=======================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=========================================*/

// Wrapper Ŭ����

public class Test137
{
	public static void main(String[] args)
	{
		// Integer.MAX_VALUE, Integer.MIN_VALUE
		// �� �� �ν��Ͻ� �������� ���� �ٷ� ���� ���� (static final)
		System.out.println(Integer.MAX_VALUE);	// 2147483647
		System.out.println(Integer.MIN_VALUE);	// -2147483648

		System.out.println(Long.MAX_VALUE);		// 9223372036854775807
		System.out.println(Long.MIN_VALUE);		// -9223372036854775808

		System.out.println(Double.MAX_VALUE);	// 1.7976931348623157E308
		System.out.println(Double.MIN_VALUE);	// 4.9E-324
												// �� e ǥ���
		
		System.out.println();

		// �Ǽ� ����� ������ ����
		System.out.println("1 : " + 3.0/0);		// 1 : Infinity
		System.out.println("2 : " + -3.0/0);	// 2 : -Infinity

		System.out.println("3 : " + (3.0/0 == 3.0/0));		// 3 : true
		System.out.println("4 : " + (3.0/0 == -3.0/0));		// 4 : false
		// ������ �� �Ұ��ϴٰ� ������ �� ������,
		// �ڹٰ� '�� �� �Ȱ��� ���Ѵ��' �ϰ� true �� ó������
		// ���� ���Ѵ�� ���� ���Ѵ�� ���� �ٸ��ɷ� ��

		// Infinity �� "Infinity" �ٸ�
		//			   -----------
		//			   ���ڿ� ���

		// is~~ ��� �Ǿ��ִ� �޼ҵ�� 99%
		// ��κ� ~���� �ƴ��� �����ؼ� true, false ��ȯ�ϴ� �޼ҵ�
		// to~~ ��� �Ǿ��ִ� �޼ҵ�� 99% ��ȯ�����ϴ� �޼ҵ� 
		// ��Double.isInfinite()��
		System.out.println("5 : " + Double.isInfinite(3.0/0));	// 5 : true
		System.out.println("6 : " + Double.isInfinite(-3.0/0));	// 6 : true
		// ==> ��, �� ��ȣ ������ �ʰ� ���Ѵ����� Ȯ�����ִ� �޼ҵ�!

		System.out.println("7 : " + (3.0/0 + -3.0/0));		// 7 : NaN
		System.out.println("8 : " + (0.0/0));				// 8 : NaN
		// NaN : Not a Number	=> ���ڰ� �ƴմϴ�.

		System.out.println("9 : " + (0.0/0 == 0.0/0));		// 9 : false
		System.out.println("10: " + (0.0/0 != 0.0/0));		// 10: true

		// �� NaN(Not a Number) ���� ������ ���� 
		//    ��==�� �����ڸ� ���� �� ������ �����ϰ� �Ǹ�
		//	  ����� ������ ��false���� ��ȯ�Ѵ�.
		//    ��!=�� �����ڸ� ���� �� ������ �����ϰ� �Ǹ�
		//	  ����� ������ ��true���� ��ȯ�Ѵ�.

		// �ڹٿ��� ���Ѵ뵵 ���ڷ� ����������,
		//			NaN �� ����, ������ �������� ����
		// => �׷��ٺ��ϱ� �� �� �Ұ���!

		// ��Double.isNaN()��
		System.out.println("11: " + Double.isNaN(0.0/0));	// 11: true
		System.out.println("12: " + Double.isNaN(1.1+1.2));	// 12: false

	}
}

// ���� ���
/*
2147483647
-2147483648
9223372036854775807
-9223372036854775808
1.7976931348623157E308
4.9E-324

1 : Infinity
2 : -Infinity
3 : true
4 : false
5 : true
6 : true
7 : NaN
8 : NaN
9 : false
10: true
11: true
12: false
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/