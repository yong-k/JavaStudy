 /*===================
   ���� �迭 ����
=====================*/

// �迭�� �迭(2���� �迭)
/*
�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
  1  2  3  4  5
  2  3  4  5  6 
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test089_�迭����1
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		
		// �迭 ����
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = j + (i + 1);
			}
		}
//��
/*
		int n;
		for (int i = 0; i < arr.length; i++)
		{
			n = i + 1;
			for (int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = n;
				n++;
			}
		}
*/		
		// �迭 ���
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}

// ���� ���
/*
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/