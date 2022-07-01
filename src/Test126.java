 /*==========================
   ���� Ŭ���� ��� ����
============================*/

// ��ø Ŭ����

// outer
class InnerOuterTest
{
	static int a = 10;
	int b = 20;

	// inner
	// ��InnerOuterTest$InnerNested.class�� �� Ŭ�������ϸ� �������
	// --> static ��ø Ŭ����(��ø ���� Ŭ����)�� ������
	class InnerNested
	{
		// ���� c�� write() �� �� �ν��Ͻ��̰�,
		// InnerNested �� ����̹Ƿ� ź������ ����
		int c = 30;
		
		void write()	// inner �� write()
		{
			System.out.println("inner �� write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}

	void write()		// outer �� write()
	{
		System.out.println("outer �� write()...");

		InnerNested ob1 = new InnerNested();
		ob1.write();	//-- inner �� write() ȣ��
	}
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test126
{
	public static void main(String[] args)
	{
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();	//-- outer �� write() ȣ��

		//InnerNested ob3 = new InnerNested();
		//--==> ������

		//InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		//--==> ������

		// �� ��ø ���� Ŭ����(static ��ø Ŭ����)�ʹ� �޸�
		//    �ܺ� Ŭ������ �ν��Ͻ�(��ü)�� ������� �ʰ�
		//    �ܵ����� ���� Ŭ������ �ν��Ͻ� �����ϴ� ���� �Ұ����ϴ�.
		//    �� �ܺ� Ŭ������ ��ü�� ����ϸ�
		//       ���� Ŭ������ ��ü�� �����ϴ� ���� �����ϴ�.


		// �� Test124.java ���ϰ� ���� ��~!!!	
		
		// �̸� �����س��� InnerOuterTest ��ü ob2�� ������ �Ʒ�ó�� ����
		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();

		// ����, �̸� �����س��� InnerOuterTest ��ü ���ٸ�,
		// InnerOuterTest ��ü �����ϰ�.InnerNested ��ü ����
		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();

		/*
		outerŬ������.innerŬ������ ���������� = new outer������().new inner������();

			ex) InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();



		cf) static �� ��ø ���� Ŭ����
		outerŬ������.innerŬ������ ���������� = new outerŬ������.inner������();

			ex) Test.StaticNested ob2 = new Test.StaticNested();
		*/


	}
}

// ���� ���
/*
outer �� write()...
inner �� write()...
a : 10
b : 20
c : 30
inner �� write()...
a : 10
b : 20
c : 30
inner �� write()...
a : 10
b : 20
c : 30
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/