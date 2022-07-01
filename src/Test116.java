 /*==========================
   ���� Ŭ���� ��� ����
============================*/

// ���(Inheritance) 
/*
�� �޼ҵ� �������̵�(Method Overriding)�� Ư¡
	- �޼ҵ� �̸�, ����Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�.
	- �ݵ�� ��� ���谡 �־�� �Ѵ�.
	- �����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ� 
	  ���� Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�.
	  ���� ���, ���� Ŭ���� �޼ҵ��� �������������� ��protected�� �� ���
	  ���� Ŭ������ �� �޼ҵ带 �������̵�(Overriding)�ϴ� ���
	  �������������ڴ� ��protected�� �Ǵ� ��public�� �̾�� �Ѵ�.
	- ��static��, ��final��, ��private�� �޼ҵ�� �������̵�(Overriding) �� �� ����.
	- Exception �� �߰��� �Ұ����ϴ�.
	  ��, ���� �޼ҵ尡 ������ �ִ� ���� ���� ���׿� 
	  ���ο� Exception �� �߰��ϴ� ���� �Ұ��� �ϴٴ� ���̴�.
*/

// �θ� Ŭ����(���� Ŭ����, super class)
class SuperTest116
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
	}
}

// �ڽ� Ŭ����(���� Ŭ����, sub class)
class SubTest116 extends SuperTest116
{
	/* <extends SuperTest116>
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
	}
	*/
	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub print() �޼ҵ� : " + a + " : " + b + " : " + c);
		//-- ����Ŭ�������� ����� ���� a ���� ������ �� ����.
		//	�� private �����̱� ������...
		System.out.println("Sub print() �޼ҵ� : " + b + " : " + c);

		System.out.println("Sub print() �޼ҵ� : " + b);		// 100
		System.out.println("Sub print() �޼ҵ� : " + this.b);	// 100
		System.out.println("Sub print() �޼ҵ� : " + super.b);	// 10
		//-- ���� b �� ���� ����� ���� �ٸ� b �� ���� �� ����� �̷������.
		//	 ���� Ŭ�������� ����� b, ���� Ŭ�������� ����� b

		System.out.println("Sub print() �޼ҵ� : " + c);		// 20
		System.out.println("Sub print() �޼ҵ� : " + this.c);	// 20
		System.out.println("Sub print() �޼ҵ� : " + super.c);	// 20
		//-- ���� c �� �����ϴµ� �ƹ��� ����� ������ ����.
		//   ���� Ŭ�������� ����� c
	}

	@Override
	public void write()
	{
		//System.out.println("Sub write() �޼ҵ� : " + a + " : " + b + " : " + c);
		//-- ���� Ŭ�������� ����� ���� a ���� ������ �� ����.
		//	 �� private �����̱� ������...
		System.out.println("Sub write() �޼ҵ� : " + b + " : " + c);
	}
}

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test116
{
	public static void main(String[] args)
	{
		// ���� Ŭ����(SubTest116) �ν��Ͻ� ����
		SubTest116 ob = new SubTest116();

		ob.print();
		//--==> Sub print() �޼ҵ� : 100 : 20

		ob.write();
		//		(write() �޼ҵ� �������̵��ϱ� ��)
		//--==> Super write() �޼ҵ� : 5 : 10 : 20
		//----- �θ� Ŭ������ �ֱ� ������ a, b, c ���� �� ���� ����
		//		(write() �޼ҵ� �������̵��� ��)
		//--==> Sub write() �޼ҵ� : 100 : 20

		System.out.println("----------------------------------- ���м�");

		System.out.println(ob.b);	// 100

		// �� ���� �θ�~!!!
		System.out.println(((SuperTest116)ob).b);	// 10
		
		((SuperTest116)ob).write();
		//--==> Sub write() �޼ҵ� : 100 : 20

		// check~!!!
		// �� �޼ҵ�� ������ ��~!!!!! �����Ͽ� ������ �� ~!!!

		/*
		**����,�޼ҵ�
		������ ���ۺθ� ����
		=> �θ�,�ڽ� �޸� ���� ����
		�޼ҵ�� ���ۺθ� �Ұ�
		=> �θ�-�ڽ� �޸� ����
		=> �θ� ��ġ�� �ڽĲ� ����� �ع����� ��!
		=> �׷��Ƿ� ���� ������ ���ư��� ����!!
	    �ѹ� Ʃ���� �׷��� �ٽ� ���� �׷����� ���ư��� ����
		*/
	}
}

// ���� ���
/*

*/