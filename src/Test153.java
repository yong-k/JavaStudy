 /*===================================
   ���� ����(Exception) ó�� ����
======================================*/

// Test152.java ���ϰ� ��~!!!

// �� throw		cf) throws
// ���ݱ��� �츮�� ����ߴ� throws�� �ٸ����� !!! �� ���� !!

// throw  : ���ܸ� �߻���ų �� ���
// throws : �� Ƣ��� ���ܸ� ������ ���� �� ���

class Demo4
{
	private int value;	//-- int type ���������� �ڵ����� 0���� �ʱ�ȭ ��

	public void setValue(int value) throws Exception
	{
		if (value <= 0)
		{	
			//return;		

			// ���ܵ� ��ü
			// new Exception("value �� 0���� �۰ų� ���� �� �����ϴ�.") 
			// �̷��� ���� ��ü�� ����ڴ�(throw)
			//-- ���� ��ü ����
			throw new Exception("value �� 0���� �۰ų� ���� �� �����ϴ�.");	
			// �̷��� ����� ������ ����. ��ź�� ǰ���ִ� �Ŵϱ�
			// setValue() �޼ҵ尡 ��Ƴ�������
			// => throws �ϰų�, try-catch �ؾ���
		}

		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

public class Test153
{
	public static void main(String[] args) //throws Exception
	{
		Demo4 ob = new Demo4();

		try
		{
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println("e.toString() : " + e.toString());
		}
	}
}

// ���� ���
/*
e.toString() : java.lang.Exception: value �� 0���� �۰ų� ���� �� �����ϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/