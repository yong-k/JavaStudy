 /*===================
   ���� �迭 ����
=====================*/

// �迭�� �迭(2���� �迭)
/*
�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test092_�迭����4
{
	public static void main(String[] args)
	{
		char[][] arr = new char[5][5];
		char alphabet = (char)65;

		for (int i = 0; i < arr.length; i++)
		{
			//���1) 
/*			for (int j = 0; j < arr[i].length; j++)
			{
				arr[4-j][i] = alphabet++;
			}
*/
			//���2)
			for (int j = 4; j >= 0; j--)
			{
				arr[j][i] = alphabet++;
			}
		}

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%3c", arr[i][j]);
			}
			System.out.println();
		}


	}
}

// ���� ���
/*
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/