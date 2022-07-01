 /*===================================
   ���� ����(Exception) ó�� ����
======================================*/

// Test153.java ���ϰ� ��~!!!

class Demo3
{
	private int value;	//-- int type ���������� �ڵ����� 0���� �ʱ�ȭ ��

	public void setValue(int value)
	{
		if (value <= 0)
			return;		//-- ���� �� �޼ҵ� ����

		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

public class Test152
{
	public static void main(String[] args)
	{
		Demo3 ob = new Demo3();
		ob.setValue(-3);
		int result = ob.getValue();
		System.out.println(result);
	}
}

//==> int type ���������� �ڵ����� 0���� �ʱ�ȭ ��
//==> �츮�� ���ϴ� ��� ó������ �ʾ���

// ���� ���
/*
0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/