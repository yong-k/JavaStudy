/*====================================
   ���� ������ (Operator) ����
======================================*/

// ��Ʈ ���� ������

// ��Ʈ ���� ������ 'xor' �����ڸ� Ȱ���Ͽ�
// �� ������ ����ִ� ����(��) �ٲٱ�

public class Test026
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int x = 20, y = 23;
		int temp;	// �ӽ� ���� ���� (�� ��)

		// ��� ���빰 Ȯ��
		System.out.printf("[[[ ��ȯ �� ]]] x = %d, y = %d\n", x, y);

		// ���� �� ó��
		/*
		temp = x;
		x = y;
		y = temp;
		*/

		// xor ������ Ȱ��
		x = x ^ y;
		y = y ^ x;
		x = x ^ y;
		//	 =>  ***�� �� �� �ٲٴ� ����, logic ***
		// x, y ���� �������, ó�� ��� ������ �������� �� �� �� ���ָ� ��
		/*
		x = x ^ y;
		y = y ^ x;
		x = x ^ y;

		y = y ^ x;
		x = x ^ y;
		y = y ^ x;
		*/


		// ��� ���빰 Ȯ��
		System.out.printf("[[[ ��ȯ �� ]]] x = %d, y = %d\n", x, y);
	}
}

// ���� ���
/*
[[[ ��ȯ �� ]]] x = 20, y = 23
[[[ ��ȯ �� ]]] x = 23, y = 20
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/* << ��� ���� Ȯ�� >>

x = x ^ y; -> x: 20		y: 23
			 00010100 -> 20
		   | 00010111 -> 23
		   -----------------
		     00000011 -> 3
			 ==> x = 3

y = y ^ x;	 -> y: 23	x: 3
			00010111 -> 23
		  | 00000011 -> 3
		  ------------------
		    00010100 -> 16 + 4 -> 20
			==> y = 20
	
x = x ^ y;	-> x: 3		y: 20
			00000011 -> 3
		  | 00010100 -> 20
		  -----------------
		    00010111 -> 16 + 4 + 2 + 1 -> 23
			==> x = 23

���� ���� ��������,
x = 23, y = 20
*/