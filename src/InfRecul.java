 /*=================================
   ���� �޼ҵ��� ��� ȣ�� ����
====================================*/

public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(10);
	}

	// �ڵ� ������ 2���� ��ġ �ٲ㼭 ���� ���ֱ�
/*
	public static void showHi(int cnt)
	{
		System.out.println("Hi~");
		showHi(cnt--);
		if (cnt == 1)
			return;
	}
*/
	// ���� ��
	public static void showHi(int cnt)
	{
		System.out.println("Hi~");

		if (cnt == 1)
			return;

		showHi(--cnt);
	}
}


