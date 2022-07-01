 /*================================
   ���� Ŭ������ �ν��Ͻ� ����
==================================*/

// ���� ���а� ���� ���� ������(����������, ����������, ...)

import java.util.Scanner;

class CircleTest2
{

	// ��� ����, �ν��Ͻ� ����, ���� ����
	//int num;

	//    ��

	// ���� ����(Information Hiding)
	// ��private���̶�� ���������������� ������
	// Ŭ���� ���ο����� ���� �� ������ �����ϰ� �ϰڴٴ� �ǹ�
	// int �� ���� ���� �� �ڵ� 0���� �ʱ�ȭ ����
	private int num;

	// getter / setter ����
/*
	int getNum()
	{
		return num;
	}

	void setNum(int num)
	{
		this.num = num;
	}
*/
	// private ���� getter, setter ���� �� ���ϰ� ª���� �ƴϾ�?
	// �ٵ� �� ��?
	// => private ������ num�� �ܺο� ��������
	//	  �� ������ ����ڰ� ���� ���� �ϴ� ���� ��� ����
	//    private���� ���ΰ� �޼ҵ带 ���� ó���ϰ� �Ǹ�,
	//    �� �ȿ� �츮�� ���ǹ��� �����ؼ�, �������, 
	//			   =>  0���� ���� �� ������ num �� ����������! �� ���� ����
	//    ��Ȳ�� ���� ������ ���� �� ��������, ���ø� �ǰ� �ϰų�
	//                  ������ ���� �� �����ϳ�, ������ �Ұ��ϰԵ� �� �� ����

	// =====> �ڵ带 ���̴� �ͺ��� �̰� �� �߿��ϴٰ� �Ǵ���  
	
	// ���߿� getter/setter �ڼ��� ������

	// ���� private �س�����, �� �޼ҵ忡 �������� ������ �� ������ �� �ִ� ��� ����
	// input() �޼ҵ� ���ؼ��� �� ���� ����
	void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է� : ");
		num = sc.nextInt();
	}

	double calArea()
	{
		return num * num * 3.141592;
	}

	void write(double area)
	{
		System.out.println("������ : " + num);
		System.out.println("����   : " + area);
	}
}

public class Test100_��������private
{
	public static void main(String[] args)
	{
		CircleTest2 ob1 = new CircleTest2();

		//ob1.num = 10;
		//System.out.println("���� ������ : " + ob1.num);
		// num�� private ������ �� ����, �� Ȯ�� �Ұ� �� ������
		// ������ü�� �Ұ���

		// getter, setter �����س�����, ���� �� ������ſ�
		//ob1.setNum(10);
		//System.out.println("���� ������ : " + ob1.getNum());

		ob1.input();
		
		double result = ob1.calArea();
		ob1.write(result);
	}
}

// ���� ���
/*
������ �Է� : 500
������ : 500
����   : 785398.0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/