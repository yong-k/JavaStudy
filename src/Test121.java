 /*==========================
   ���� Ŭ���� ��� ����
============================*/

// �������̽�(Interface)

// �������̽�
interface Demo2
{
	public void write();
	public void print();
}

// �������̽��� �����ϴ� �߻� Ŭ����
abstract class DemoImpl3 implements Demo2
{
	@Override
	public void write()
	{
		System.out.println("write() �޼ҵ� ������...");
	}

	// �������� �߻�޼ҵ� print()�� �������� �ʰ� ����
	// �װ� DemoImpl�� �ڽ��� DemoImplSub�� ��������
	//public void print();

}

// �߻� Ŭ������ ��ӹ޴� �߻� Ŭ����
//abstract class DemoImplSub extends DemoImpl
//	  ��
// �߻� Ŭ������ ��ӹ޴� Ŭ����
class DemoImplSub extends DemoImpl3
{
	@Override
	public void print()
	{
		System.out.println("print() �޼ҵ� ������...");
	}
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test121
{
	public static void main(String[] args)
	{
		//Demo ob1 = new Demo();
		//-- �������̽��̱� ������ �ν��Ͻ� ���� �Ұ�

		//DemoImpl ob2 = new DemoImpl();
		//-- �߻�Ŭ�����̱� ������ �ν��Ͻ� ���� �Ұ�
		//error: DemoImpl is abstract; cannot be instantiated

		DemoImplSub ob3 = new DemoImplSub();

		ob3.write();	// write() �޼ҵ� ������...
		ob3.print();	// print() �޼ҵ� ������...
	}
}

// ���� ���
/*
write() �޼ҵ� ������...
print() �޼ҵ� ������...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/