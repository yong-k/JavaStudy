/*===========================================
   ���� ���� �帧�� ��Ʈ�� (���) ����
============================================*/

// �ݺ���(while��) �ǽ�
/*
1���� 100������ ���� �߿���
¦������ �հ� Ȧ������ ���� ���� �����Ͽ� ����Ѵ�.
�׸��� ������� ����ϴ� ���α׷��� �����Ѵ�.
��, �ݺ����� while���� ����� �� �ֵ��� �ϸ�,
���ǹ��� if���� ����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

���� ��)
1 ���� 100 ������ ���� ��
¦���� �� : 2550
Ȧ���� �� : 2500
����Ϸ��� �ƹ� Ű��...
*/

public class Test048
{
		public static void main(String[] args)
	{
		int n = 0;
		int evenSum = 0, oddSum = 0;

		while (n <= 100)
		{
			if (n % 2 == 0)
				evenSum += n;
			else if (n % 2 != 0)
				oddSum += n;
			else
			{
				System.out.println("�Ǻ� �Ұ� ������");
				return;
			}

			n++;
		}

		System.out.println("1 ���� 100 ������ ���� ��");
		System.out.println("¦���� �� : " + evenSum);
		System.out.println("Ȧ���� �� : " + oddSum);
	}
}

// ���� ���
/*
1 ���� 100 ������ ���� ��
¦���� �� : 2550
Ȧ���� �� : 2500
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/