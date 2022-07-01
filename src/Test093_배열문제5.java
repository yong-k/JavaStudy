 /*===================
   ���� �迭 ����
=====================*/

// �迭�� �迭(2���� �迭)
/*
�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
   1   2   3   4  10
   5   6   7   8  26
   9  10  11  12  42
  13  14  15  16  58
  28  32  36  40 136
����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test093_�迭����5
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		int n;
		int sum, colSum, rowSum;

//�� 
/* �ݺ��� ���鼭 ���� 3�� �� �����Ǵ� ��Ȳ
1 ���� ���� ���� 3�� �� += ���� => (0,4)(4,0)(4,4)
2 ���� ��					    => (0,4)(4,1)(4,4)
3								=> (0,4)(4,2)(4,4)
:
5 ���� ��						=> (1,4)(4,0)(4,4)
:
*/
		n = 0;
		for (int i = 0; i < arr.length - 1; i++)		// i -> 0 1 2 3 
		{
			for (int j = 0; j < arr[i].length - 1; j++)	// j -> 0 1 2 3
			{
				n++;	// 1 2 3 4 5 6 ... 16
				arr[i][j] = n;

				arr[i][arr[i].length-1] += arr[i][j];				// arr[i][4] += arr[i][j];
				arr[arr.length-1][j] += arr[i][j];					// arr[4][j] += arr[i][j];
				arr[arr.length-1][arr[i].length-1] += arr[i][j];	// arr[4][4] += arr[i][j];
			}	
		}
//��
/*
		// 1) 4*4 �迭�� ���� ä��� & (0,4)(1,4)(2,4)(3,4) & (4,4) �� ä���
		n = 1;
		for (int i = 0; i < 4; i++)
		{
			colSum = 0;
			for (int j = 0; j < 4; j++)
			{
				arr[i][j] = n++;
				colSum += arr[i][j];
				arr[4][4] += arr[i][j];
			}
			arr[i][4] = colSum;
		}

		// 2) (4,0)(4,1)(4,2)(4,3) �� ä���
		for (int i = 0; i < 4; i++)
		{
			rowSum = 0;
			for (int j = 0; j < 4; j++)
				rowSum += arr[j][i];
			
			arr[4][i] = rowSum;
		}
*/

		// ��� ���
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
   1   2   3   4  10
   5   6   7   8  26
   9  10  11  12  42
  13  14  15  16  58
  28  32  36  40 136
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/