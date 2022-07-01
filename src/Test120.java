 /*==========================
   ���� Ŭ���� ��� ����
============================*/

// �������̽�(Interface)

// �������̽�
interface ADemo
{
	public void write();
}

// �������̽�
interface BDemo
{
	public void print();
}

// �� �������̽��� 2�� �̻��� ����(implements)�� �� �ִ�.
//	   �� ���� ����� ���� �ʴ� �κ��� ����(����)�ϴ� ����.

// Ŭ����
// �߻� Ŭ���� - �� �������̽��� ������ �߻� Ŭ����
//abstract class DemoImpl implements ADemo, BDemo
//	  ��
// Ŭ���� - �� �������̽��� ������ Ŭ����
class DemoImpl2 implements ADemo, BDemo
{
	// Ŭ����������     @Override�� jdk 1.5���� ����
	// �������̽������� @Override�� jdk 1.6���� ����
	//
	// JDK 1.5(5.0)������ �������̽� �޼ҵ带
	// �������̵�(Overriding)�� ��
	// ��@Override�� ������̼�(annotation)�� ����� �� ����.
	// JDK 1.6 ���ĺ��� ���� ������ �����̴�.
	// ��, ��ӹ��� Ŭ������ �޼ҵ带 �������̵�(Overriding)�� ������
	// JDK 1.5 ������ ��@Override�� ������̼�(annotation) ����� �����ϴ�.
	@Override	
	public void write()
	{
		System.out.println("ADemo �������̽� �޼ҵ� write()...");
	}

	@Override
	public void print()
	{
		System.out.println("BDemo �������̽� �޼ҵ� print()...");
	}
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test120
{
	public static void main(String[] args)
	{
		//ADemo ob = new ADemo();		//-- �������̽� �� �ν��Ͻ� ���� �Ұ�
		//BDemo ob = new BDemo();		//-- �������̽� �� �ν��Ͻ� ���� �Ұ�
		
		// ADemo, BDemo �������̽��� ����(implements)�� Ŭ����(�� DemoImpl)
		// ����� �ν��Ͻ� ����
		DemoImpl2 ob1 = new DemoImpl2();

		ob1.write();
		ob1.print();
		//--==> ADemo �������̽� �޼ҵ� write()...
		//		BDemo �������̽� �޼ҵ� print()...

		ADemo ob2 = new DemoImpl2();		//-- �� ĳ����
		BDemo ob3 = new DemoImpl2();		//-- �� ĳ����

		//ob2.print();	//--==> ���� �߻� error: cannot find symbol
		//ob3.write();	//--==> ���� �߻� error: cannot find symbol
		// �ڱⰡ ���� �ִ� �͸� ȣ�� ������

		ob2.write();	// ADemo �������̽� �޼ҵ� write()...
		ob3.print();	// BDemo �������̽� �޼ҵ� print()...

		// check~~!!!
		((BDemo)ob2).print();	// BDemo �������̽� �޼ҵ� print()...
		((ADemo)ob3).write();	// ADemo �������̽� �޼ҵ� write()...
		//-- DemoImpl Ŭ������ �� �������̽��� ��� �����߱� ������ �����ϴ�.
		//	 ����, DemoImpl Ŭ������ �̵� �� �� �������̽��� �����ߴٸ�
		//	 �� ������ ��Ÿ�� ���� �߻��ϴ� ������ �ȴ�.
		//
		// �Ϲ������� ���� ���� �͹��Ͼ��� ����������
		// �� �� new DemoImpl(); �� ��Ȳ�̰�
		// DemoImpl�� ADemo�� BDemo�� �� �� implements �� ��Ȳ
		//==> DemoImpl �� ���ؼ� ADemo�� BDemo ���̿� ���谡 ���ܹ���
		//	  �� ������ ADemo�� BDemo �ƹ� ���� ������
		//===> �׷��Ƿ� ���� CROSS �ؼ� ĳ�����ϴ°� ��������!
		// �̰� ��ĳ����,�ٿ�ĳ������ �ƴ�
		// �׳� �ٸ� Ŭ�����鳢���� ĳ������..!
	

		// �ٿ� ĳ����
		((DemoImpl2)ob3).write();	// ADemo �������̽� �޼ҵ� write()...

	}
}

// ���� ���
/*
ADemo �������̽� �޼ҵ� write()...
BDemo �������̽� �޼ҵ� print()...
ADemo �������̽� �޼ҵ� write()...
BDemo �������̽� �޼ҵ� print()...
BDemo �������̽� �޼ҵ� print()...
ADemo �������̽� �޼ҵ� write()...
ADemo �������̽� �޼ҵ� write()...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/