 /*===================
   ���� �迭 ����
=====================*/

// �迭�� �迭(2���� �迭)
/*
�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
  1  8  9 16 17
  2  7 10 15 18
  3  6 11 14 19
  4  5 12 13 20
����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test091_�迭����3
{
	public static void main(String[] args)
	{
		int[][] arr = new int[4][5];
		int n = 1;
		
// ��
/*
		for (int i = 0; i < 5; i++)
		{
			if (i % 2 == 0)
			{
				for (int j = 0; j < 4; j++)		
					arr[j][i] = n++;
			}
			else
			{
				for (int j = 3; j >= 0; j--)
				{
					arr[j][i] = n++;
				}
			}
		}
*/
//��
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				if (i % 2 == 0)
					arr[j][i] = n++;
				else
					arr[3-j][i] = n++;
			}
		}
			
		// ��� �κ�
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
}

// ���� ���
/*
   1   8   9  16  17
   2   7  10  15  18
   3   6  11  14  19
   4   5  12  13  20
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/