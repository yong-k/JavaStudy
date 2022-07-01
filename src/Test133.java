 /*=======================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=========================================*/

// Wrapper Ŭ����

public class Test133
{
	public static void main(String[] args)
	{
		boolean bi = true;
		Boolean wrapBi = new Boolean(bi);
		Boolean wBi = bi;			//-- ���� �ڽ�

		int n = 300;
		Integer wrapN = new Integer(n);
		int n2 = wrapN;				//-- ���� ��ڽ�

		float f = 300.3f;
		Float wrapF = new Float(f);	//-- �ڽ�
		
		// Ŭ������@�ؽ��ڵ� �����°� �ƴ϶�, ���ִ� ���� ���� ������
		System.out.println(wrapBi.toString());	// true
		System.out.println(wrapN.toString());	// 300
		System.out.println(wrapF.toString());	// 300.3
		
		// toString() ���� �׳� ��ü�� println()�� �Ѱ�����
		// �׷��� ��µǴ°� ���� ������
		// Wrapper Ÿ���� ���̵��� ��ü Ÿ������ ó���ɱ�� �������ص� ��. �ڵ����� ó������
		System.out.println(wrapBi);				// true
		System.out.println(wrapN);				// 300
		System.out.println(wrapF);				// 300.3

		
		// Integer Ŭ����

		String sn = "12";
		int ni = Integer.parseInt(sn);			//-- �������� ���ڿ� �� ���� �� �ٲ���
												// �Ű����� �ϳ�  �Ѱܹ޴� parseInt(String)
		System.out.printf("ni : %3d\n", ni);	// ni :  12

		ni = Integer.parseInt("0101", 2);		// �Ű����� �� �� �Ѱܹ޴� parseInt(String, int) 
												//-- String�� int������ ���� ������ �ٲ�
												// ==> ! �����ε� !
		System.out.printf("ni : %3d\n", ni);	// ni :   5  => (0101�� 2������)

		ni = Integer.parseInt("12", 8);
		System.out.printf("ni : %3d\n", ni);	// ni :  10  => (12�� 8������)

		ni = Integer.parseInt("A", 16);
		System.out.printf("ni : %3d\n", ni);	// ni :  10  => (A�� 16������)

		sn = Integer.toBinaryString(20);		
		System.out.printf("sn : %s\n", sn);		// sn : 10100	=> 2����

		sn = Integer.toOctalString(31);
		System.out.printf("sn : %s\n", sn);		// sn : 37		=> 8����

		sn = Integer.toHexString(31);
		System.out.printf("sn : %s\n", sn);		// sn : 1f		=> 16����

		Integer num = new Integer(50);
		System.out.println(num.toString());		// 50

		int n3 = 345;
		Integer n4 = Integer.valueOf(n3);
		System.out.println(n4);					// 345

		/*
		- �� �̰Ŵ� �޼ҵ� �̸��� ������ �޴� �Ű����� ���� �Ǵ� type��
			�ٸ��ϱ� �����ε��̰ڱ���
		- parseInt, toBinaryString �� static �̰ڱ���
			Ŭ�����̸�.parseInt() �� ȣ���ϴϱ�
		- �̸� �տ� to �پ������� �ַ� ��ȯ�� �����ϴ� �޼ҵ屸��
			��ġ toString() ó��

		�̷� ������ ���̸��� �ϸ鼭 �ڵ��ϱ�!!!!
		*/
	}
}

// ���� ���
/*
true
300
300.3
true
300
300.3
ni :  12
ni :   5
ni :  10
ni :  10
sn : 10100
sn : 37
sn : 1f
50
345
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/