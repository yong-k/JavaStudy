/*====================================
   ���� �ڹ��� ���� �� Ư¡ ����
======================================*/

// ����
// ���簢���� ���̿� �ѷ��� ���ϴ� ���α׷��� �ۼ��Ѵ�.
// ����: 10, ����: 20

// ���� ��)
// ���� : xxxx
// �ѷ� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...

public class Test013
{
	public static void main(String[] args)
	{
		int width = 10;
		int height = 20;
		int area, length;

		area = width * height;
		length = (width + height) * 2;

		System.out.printf("���� : %d\n", area);
		System.out.printf("�ѷ� : %d\n", length);
	}
}

// ���� ���
/*
���� : 200
�ѷ� : 60
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/