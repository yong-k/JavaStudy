/*===========================================
   ���� ���� �帧�� ��Ʈ�� (���) ����
============================================*/

// �ݺ���(while��) �ǽ�
/*
���� ��)
1 ���� 100 ���� ������ �� : 5050
1 ���� 100 ���� ¦���� �� : 2550
1 ���� 100 ���� Ȧ���� �� : 2500
����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test049
{
		public static void main(String[] args)
	{
		int n = 0;
		int sum = 0, evenSum = 0, oddSum = 0;
		/*
		//�Ʒ�ó�� �ص� ��
		//������ �� �˾Ƶα�
		// **[sum, evenSum, oddSum �� ��� 0���� �ʱ�ȭ] ��� �� X !!
		int sum, evenSum, oddSum;
		sum = evenSum = oddSum = 0;
			 1) oddSum �� 0 ����
				oddSum = 0
		     2) oddSum �� evenSum �� ����
				evenSum = 0
		     3) evenSum �� sum �� ����
				sum = 0
		*/

		while (n <= 100)
		{
			sum += n;

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

		System.out.println("1 ���� 100 ���� ������ �� : " +  sum);
		System.out.println("1 ���� 100 ���� ¦���� �� : " +  evenSum);
		System.out.println("1 ���� 100 ���� Ȧ���� �� : " +  oddSum);
	}
}

// ���� ���
/*
1 ���� 100 ���� ������ �� : 5050
1 ���� 100 ���� ¦���� �� : 2550
1 ���� 100 ���� Ȧ���� �� : 2500
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/