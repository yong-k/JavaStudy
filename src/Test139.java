 /*=======================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=========================================*/

// String Ŭ����

public class Test139
{
	public static void main(String[] args)
	{
		String s = "seoul korea";	
		System.out.println(s);		// seoul korea


		// �� ���ڿ� ����
		System.out.println(s.substring(6, 9));	// kor

		// �� ��String.substring(s, e)��
		//    String ���ڿ��� �������
		//    s ��°���� ... e-1 ��°���� ����
		//    (��, �ε����� 0���� ����)

		System.out.println(s.substring(7));		// orea

		// �� ��String.substring(s)��
		//    String ���ڿ��� �������
		//    s ��°���� ... ������ ����
		//    (��, ���ڿ��� ���� ���̸�ŭ...)


		// �� ���ڿ��� ������(��) �� : ��ҹ��� ����	  
		//	  ��String.equals(s)��
		System.out.println(s.equals("seoul korea"));	// true
		System.out.println(s.equals("seoul Korea"));	// false


		// �� ���ڿ��� ������(��) �� : ��ҹ��� ���� X  
		//    ��String.equalsIgnoreCase(s)��
		System.out.println(s.equalsIgnoreCase("seoul Korea"));	// true


		// �� ã���� �ϴ� ��� ���ڿ�(s)�� ��kor�� ���ڿ��� �����ұ�?
		//    �����Ѵٸ�... �� ��ġ�� ��� �ɱ�?
		//   ��String.indexOf(s)��
		//    => ������ �Ѱܼ� �װ� �� ��° �ε����� �ִ��� Ȯ������
		// s = "seoul korea"
		//      012345678910
		System.out.println(s.indexOf("kor"));	// 6
		System.out.println(s.indexOf("ea"));	// 9
		//	=> ea�� �پ��ִ� �� ã�� ������ 9��°
		System.out.println(s.indexOf("e"));		// 1
		//  => seoul ���� e�� ���� ���� �ֱ� ������ 1��°
		System.out.println(s.indexOf("tt"));	// -1
		//-- ã���� �ϴ� ���ڿ��� ��� ���ڿ��� ������ ���
		//   �� ���ڿ��� �ε����� ��ȯ������
		//   �������� ���� ��� ������ ��ȯ�ϰ� �ȴ�. (-1)


		// �� ��� ���ڿ�(s)�� ��rea�� �� ���������� ���� Ȯ��
		//	  (true / false)
		//   ��String.endsWith(s)��
		System.out.println(s.endsWith("rea"));	// true
		System.out.println(s.endsWith("oul"));	// false


		// �� ã���� �ϴ� ��� ���ڿ�(s)�� ��e�� ���ڿ��� �����ұ�?
		//    �����Ѵٸ�... �� ��ġ�� ��� �ɱ�?
		//	  (��, �ڿ��� ���� �˻�)
		//   ��String.lastIndexOf(s)��

		// s = "seoul korea"
		//---�տ������� ã�ٰ�, ã���� stop
		System.out.println(s.indexOf("e"));		// 1	
		System.out.println(s.indexOf("o"));		// 2

		//---�ڿ������� ã�ٰ�, ã���� stop
		System.out.println(s.lastIndexOf("e"));	// 9	
		System.out.println(s.lastIndexOf("o"));	// 7
		// => �ڿ��� ���� ã��, �տ������� �ε��� ���� �ش� �ε��� ��ȯ�ϴ� ����


		// �� ��� ���ڿ�(s) �� 
		//   ��6����° �ε��� ��ġ�� ���ڴ�?
		//   ��String.charAt(int n)��
		// s = "seoul korea"
		System.out.println(s.charAt(6));	// k	
		//System.out.println(s.charAt(22));	
		//--==> ���� �߻� (��Ÿ�� ����)
		// Exception in thread "main" java.lang.StringIndexOutOfBoundsException
		// �������� �ʴ� �ε��� ������ ������

		
		// �� ��� ���ڿ�(s) �� �� ���ڿ� ��seoul corea�� ��
		//    � ���ڿ��� �� ū��? �� ���ڿ��� ���� ũ�� ��
		//   ��String.compareTo(s)��
		//	  ==> �� ���ڿ��� ���ٸ�   �� 0
		//		  �� ���ڿ��� �ٸ��ٸ� �� ���̸� Ȯ�� (������ �迭)
		System.out.println(s.compareTo("seoul korea"));	// 0
		System.out.println(s.compareTo("seoul corea"));	// 8
		//-- c �� k�� ���̸� ������ �� c ~ k �� defghijk �� 8ĭ ����


		// �� ��� ���ڿ�(s) �� 
		//    �ش� ���ڿ��� ã�Ƽ� ���ϴ� ���·� ����
		//   ��String.replaceAll(s)��

		s = "�츮���� ���ѹα� ���ѵ��� ����";
		s = s.replaceAll("����", "����");
		System.out.println("ó�� ��� : " + s);	
		//--==> ó�� ��� : �츮���� ���ֹα� ���ֵ��� ����


		// �� ���� ����
		//   ��String.trim(s)��
		//=> ������ �����ϸ� ��
		//   �߰��κ� �� �ڸ�. �����ڸ����� �����ؼ� �ڸ�
		//   (���� �ڸ��� ������ �� ó��)
		//   � ���ڿ��� Ư�� ��� �����ϰ� �Ǹ�,
		//   ����� ������ �� ������ �����ִ� �� ����!
		//=> ���� �����ڸ� �� ��������
		//   (����Ŭ������ ltrim, rtrim �ؼ� ����, ������ ��������)
		s = "          ��          ��          ";	// ���� 10ĭ��
		System.out.println("|||" + s + "|||");	
		//--==> |||          ��          ��          |||
		System.out.println("|||" + s.trim() + "|||");	
		//--==> |||��          ��|||
		// ���� �����ڸ� ���� �����ϰ�, ���� ������ ���� ����

		// �ȿ� �ִ� ���� �����ϰ� ������, 
		System.out.println("|||" + s.replaceAll(" ", "") + "|||");
		//--==> |||���|||


		// "30"
		int temp = Integer.parseInt("30");
		System.out.printf("%d\n", temp);	// 30
		s = Integer.toString(30);
		System.out.printf("%s\n", s);		// 30
		// Object �� ���� �ִ� toString()�� Integer�� overriding�ؼ� ���
		// ���� �ǳ��ָ� ���ڿ��� ��ȯ����


		// �� format ���� ���� ==> ���ݱ��� ���Դ� �Ͱ� �޸� static !
		//   ��String.format(s)��
		//   => ������ printf�� format�� �����ѵ�
		//      '�̷� ���·� ����ض�' �� �ƴ϶�
		//		String.format() �� '�̷� ���·� ���ڿ��� ��ȯ�ض�' �̴�.
		//		==> ����� ��Ű�°� �ƴ϶� ���ڿ��� ��ȯ���ִ� ���� ����!
		int n = 2345678;
		System.out.printf("%d\n", n);	// 2345678
		System.out.format("%d\n", n);	// 2345678

		s = String.format("%d", n);
		System.out.println(s);			// 2345678
		
		// printf ���� �� �� �ִ� ���� �� �� �� �ִٰ� ���� ��
		s = String.format("%,d", n);
		System.out.println(s);			// 2,345,678
	
		
	
		// �� �����ڷ� ���ڿ� �߶� �迭�� ��ȯ
		//   ��String.split(������)��
		//	=> ���ڿ� ������ �迭�� ��ȯ����
		// ���ڿ����� ��.�� �� String �޼ҵ� ��� ���� !!
		String[] strArr = "�⺻,����,���".split(",");

		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();
		//--==> �⺻ ���� ���
	}
}

// ���� ���
/*
seoul korea
kor
orea
true
false
true
6
9
1
-1
true
false
1
2
9
7
k
0
8
ó�� ��� : �츮���� ���ֹα� ���ֵ��� ����
|||          ��          ��          |||
|||��          ��|||
|||���|||
30
30
2345678
2345678
2345678
2,345,678
�⺻ ���� ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/