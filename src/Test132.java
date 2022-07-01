 /*=======================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=========================================*/

// Wrapper Ŭ����
/*
�� Wrapper Ŭ����

   1. �ڹٿ����� ��� ���ؿ��� �����ϴ� �⺻�� �����͸� ������ 
      �������� Ŭ������ �����Ͽ� ��ü ������ ó���Ѵ�.
	  ���� �ڹٿ����� �̷��� �⺻�� �����͸�
	  ��ü ������ ó���� �� �ֵ��� Ŭ������ ������ �� �ۿ� ���µ�
	  �̷��� Ŭ�������� ������ Wrapper Ŭ������ �Ѵ�.

   2. �⺻ �ڷ�����
      byte, short, int,     long, float, double, char,      boolean ���� �����ϴ�
	  Byte, Short, Integer, Long, Float, Double, Character, Boolean ��
	  Wrapper Ŭ���� �� ū ���ڵ��� �ٷ�� ����
	  java.math.BigInteger �� java.math.BigDecimal Ŭ������ �����Ѵ�.

	  Wrapper Ŭ������ java.lang ��Ű���� ���ԵǾ� �����Ƿ�
	  ������ import ���� ���� �ٷ� ����ϴ� ���� �����ϸ�
	  �⺻���� ���������� Wrapper Ŭ������ ���� �޼ҵ带 ����
	  �� ��ȯ�� �����ϰ� ���� �񱳿� ���� ���굵 �����ϴ�.

	  ex) java.lang.Integer Ŭ����
	      int �⺻ �ڷ����� Wrapper Ŭ������
		  ������ �ٷ�µ� �ʿ��� ����� �޼ҵ�, ���� ��ȯ � �ʿ���
		  �޼ҵ� ���� �����ϰ� �ִ�.

		  static int parseInt(String s)
		  ���ڿ� �������� ����� ���ڸ� ���� ���·� ��ȯ�Ѵ�.

		  static Integer valueOf(int i)
		  int ���� Integer ������ ��ȯ�Ѵ�.

		  byte byteValue(), int intValue(),
		  short shortValue(), long longValue(),
		  float floatValue(), double doubleValue()
		  �ش� �⺻ �ڷ������� �� ��ȯ�� ���� ��ȯ�Ѵ�.
*/

/*
�� ���� �ڽ�(Auto-Boxing) �� ���� ��ڽ�(Auto-Unboxing)

   �Ϲ������� ���۷��� ���� �⺻ �ڷ����� ȣȯ���� ������
   										  ================
   �� ��� �߻��ϴ� ���� �ذ��� ���� �ڹٿ����� Wrapper Ŭ������ �����ϰ� �Ǿ���.
   ������, JDK 1.5 ���� ���۷��� ���� �⺻ �ڷ����� ������ ���� �� ��ȯ�� �����ϰ� �Ǿ���.
 
   ===> ������ reference type - primitive type !! ȣȯ�� �� �� !! 
		������ ó�������� �ڹٰ� �ڵ����� ó�����ִ� �� �̷��������!!

   int a = 10, b;
   Integer ob;	==> �� byte ���� type �̶�� ǥ���� �� ����
   				==> Integer ���赵�� ���� ob�� �����Ѱ���. �ν��Ͻ� �����Ѱ͵� ���� �ƴ�
				    �ٵ� �ű⿡ ob = a; ��� ���� �ȵǴ� �� �ڹٰ� ���شٴ� ����!!!
   ob = a;
   //-- �⺻ �ڷ���(int)�� Integer ������ �ڵ� ��ȯ (�ڹٰ� ���������� ��������)
   // a�� pri(free) �� ��. �׷��� Integer type�� ������ class ������ ������ �� => Boxing
   // �����δ�... ��ob = new Integer(a);����� �츮�� ���� �ؾ��ϴ� �ǵ� ==> �̰� Boxing
   // --> �׷��� �ڹٰ� �ڵ����� ���ִ°Ŵϱ� => Auto-Boxing

   primitive �ڷ��� �ֵ��� �����ο� ��ȥ��
   class �� �����Ǿ��ְ�, Ʋ�� �ְ�, ���� ��Ģ���� ����
   �� ��Ģ ������ primitive �ڷ��� �ֵ��� ������̴� ����
   �����ο� primitive �ֵ��� ��ü �������� ����ִ� �� Boxing
   ������ class �ֵ��� primitive �� Ǯ���ִ� �� Unboxing
   => �װ� �ڹٰ� �ڵ����� ���ָ� Auto�� �ٰ�, �츮�� �����ϸ� Auto �� �ٴ°���!

   b = ob;
   //-- Integer(��ü)�� �⺻ �ڷ��� int ������ �ڵ� ��ȯ(���� ��ڽ�)
   //	�����δ�...��b = ob.intValue();�� ��� �츮�� �ؾߵǴ� ����

   �̴� JDK 1.5 ���� �߰��� ���� �ڽ� / ���� ��ڽ��̶��
   ������� ���� �������� ���̴�.
*/

public class Test132
{
	public static void main(String[] args)
	{
		int a = 10, b;
		Integer c;
		Object d;

		b = a;				//-- int �� ������(�ڷ�) �� int �� ����
		c = new Integer(0);	//-- Integer Ÿ���� ��ü ����
		// ���������δ� c = 0; ���� ó������

		// �� ���۷��� ��(���� Ÿ��)�� �⺻ �ڷ���(�⺻ Ÿ��)�� ȣȯ���� �ʴ´�.

		b = c;		//-- Integer �� ������(��ü) �� int �� ����(���� ��ڽ�)
					// ������ ���� �ȵǴ� �� but �ڹٰ� ����
				
		b = c.intValue();	//-- ��ڽ� (�����ڽ� �ƴϰ� �츮�� Ǯ� ��ȯ���ذ���)

		d = new Object();
		System.out.println("d.toString() : " + d.toString());
		//--==> d.toString() : java.lang.Object@15db9742
		//					   ---------------  --------
		//					      Ŭ������    @  �ؽ��ڵ�

		d = new Integer(10);	//-- �� ĳ����
		System.out.println("d.toString() : " + d.toString());
		//--==> d.toString() : 10

		// 99�� 105�� toString() �� �� Object�� toString() ��
		// ==> �׷��� ��� �ٸ�... �̰� �ڹٰ� ���ִ� ����

		d = new Double(12.345);	//-- �� ĳ����
		System.out.println("d.toString() : " + d.toString());
		//--==> d.toString() : 12.345

		d = 10;					//-- ���� �ڽ�
		// ������ �̷��� �ϴ� �� �ȵǴµ�, �ڹٰ� �ڵ����� ó�����ֱ� ������...!!!
		// d = new Integer(10); 
		// d = 10;
		// ���� �� ������ ���� ����
		System.out.println("d.toString() : " + d.toString());
		//--==> d.toString() : 10
	}
}

// ���� ���
/*
d.toString() : java.lang.Object@15db9742
d.toString() : 10
d.toString() : 12.345
d.toString() : 10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/