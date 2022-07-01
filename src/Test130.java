 /*=======================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=========================================*/

// Object Ŭ����

class Test4	//extends Object
{
	/*
	// �� ��ü �� ��, ������ true, �ٸ��� false ��ȯ
	public boolean equals(Object obj)	
	{
		...
	}
	...
	*/

	private int a = 10;

	public void write()
	{
		System.out.println("a : " + a);
	}
}

public class Test130
{
	public static void main(String[] args)
	{
		Test4 ob1 = new Test4();
		Test4 ob2 = new Test4();

		System.out.println("10 == 9 : " + (10 == 9));
		//--==> 10 == 9 : false

		int a = 10;
		int b = 10;
		System.out.println("a == b : " + (a == b));
		//--==> a == b : true

		// �� ��==�� �� �����ڴ� �ǿ������� ũ�⸦ ������ Ȯ��(����)

		System.out.println("ob1 == ob2 : " + (ob1 == ob2));
		//--==> ob1 == ob2 : false

		// �� ��ü(Object)���� ���ϴ� �������� ����ϴ� ��==�� �����ڴ�
		//	  ũ�⸦ ���ϴ� ���� �ƴ϶� ��ü�� �ּҸ� ���Ѵ�.

		System.out.println("ob1.equals(ob2) : " + (ob1.equals(ob2)));
		//--==> ob1.equals(ob2) : false

		// �� ��==�� �����ڿ� Object Ŭ������ ��equals()�� �޼ҵ��
		//	  ������ �������� ��ü�� �ּҸ� �� !! ũ�� �� NO!!
		//					  ==================

		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println();

		System.out.println("ob1            : " + ob1);				// Test@15db9742
		System.out.println("ob1.toString() : " + ob1.toString());	// Test@15db9742

		System.out.println("ob2            : " + ob2);				// Test@6d06d69c
		System.out.println("ob2.toString() : " + ob2.toString());	// Test@6d06d69c

		// ��Ŭ������@�ؽ��ڵ塻

		// �� �ؽ��ڵ�(hashcode)
		//	  : �ڹ� ���������� ��ü�� �����ϱ� ���� ����ϴ� ��
		//		�޸��� �ּҰ����� �����ϸ� ����� �ȵȴ�.

		// �� ��ü�� ������ hashcode(�ؽ��ڵ�)�� ������,
		//    hashcode(�ؽ��ڵ�)�� ���ٰ��ؼ� ���� ��ü�� �ƴϴ�.
	}
}

// ���� ���
/*
10 == 9 : false
a == b : true
ob1 == ob2 : false
ob1.equals(ob2) : false

-----------------------------------------

ob1            : Test@15db9742
ob1.toString() : Test@15db9742
ob2            : Test@6d06d69c
ob2.toString() : Test@6d06d69c
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/