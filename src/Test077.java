 /*=================================
   ���� Ŭ������ �ν��Ͻ� ����
===================================*/

// ������ (Constructor)

class NumberTest2
{
	int num;
	
	// ����� ���� �����ڰ� ���ǵǾ� �����Ƿ� default ������ �ڵ����� ���� X
	//NumberTest2() {}

	// ������ �� ����� ���� ������
	NumberTest2(int n)
	{
		num = n;
		System.out.println("������ ȣ�� �� �Ű����� ���� : " + n);
	}

	int getNum()
	{
		return num;
	}
}

public class Test077
{
	public static void main(String[] args)
	{
		// NumberTest2 �ν��Ͻ� ����
		//NumberTest2 nt = new NumberTest2();
		//==> ���� �߻� (������ ����)
		//-- NumberTest2 Ŭ��������
		//   ����� ���� �����ڰ� �����ϰ� �ִ� ��Ȳ�̱� ������
		//   default �����ڰ� �ڵ����� ���Ե��� ������
		//   ����ڰ� ������ �����ڴ� �Ű������� ���� �����̱� ������
		//   ���� ���� �Ű����� ���� ������ ȣ�� �� ������ �߻��ϰ� �ȴ�.
		NumberTest2 nt1 = new NumberTest2(10);
		System.out.println("�޼ҵ� ��ȯ �� : " + nt1.getNum());	// 10

		NumberTest2 nt2 = new NumberTest2(3564);
		System.out.println("�޼ҵ� ��ȯ �� : " + nt2.getNum());	// 3564
	}
}

// ���� ���
/*
������ ȣ�� �� �Ű����� ���� : 10
�޼ҵ� ��ȯ �� : 10
������ ȣ�� �� �Ű����� ���� : 3564
�޼ҵ� ��ȯ �� : 3564
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/