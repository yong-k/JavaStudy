 /*===================
   ���� �迭 ����
=====================*/

// �迭�� �迭(2���� �迭)
/*		<<<< ���� >>>>
�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
  A  B  C  D  E
  F  G  H  I  J
  K  L  M  N  O
  P  Q  R  S  T
  U  V  W  X  Y
����Ϸ��� �ƹ� Ű�� ��������...
*/


public class Test094_�迭����6
{
	public static void main(String[] args)
	{
		char[][] alphabets = new char[5][5];	// 5x5 �迭 ����
		char alpA = 'A';

		// �迭�� �� ä���
		for (int i = 0; i < alphabets.length; i++)
		{
			for (int j = 0; j < alphabets[i].length; j++)
			{
				alphabets[i][j] = alpA++;
			}
		}

		// �迭 ���
		for (int i = 0; i < alphabets.length; i++)
		{
			for (int j = 0; j < alphabets[i].length; j++)
			{
				System.out.printf("%3c", alphabets[i][j]);
			}
			System.out.println();
		}
	}
}

// ���� ���
/*
  A  B  C  D  E
  F  G  H  I  J
  K  L  M  N  O
  P  Q  R  S  T
  U  V  W  X  Y
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/