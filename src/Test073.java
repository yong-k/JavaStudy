 /*=================================
   ���� Ŭ������ �ν��Ͻ� ����
===================================*/

// �� CircleTest.java ���ϰ� ��Ʈ �� 

/*
���� ���̿� �ѷ� ���ϱ�
���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
(Ŭ������ : CircleTest) �� CircleTest.java
BufferedReader �� ReadLine() ���

���� ���� = ������ * ������ * 3.141592
���� �ѷ� = ������ * 2 * 3.141592

���� ��)
������ �Է� : xx

>> �������� xx �� ����
>> ���� : xxx.xx
>> �ѷ� : xxx.xx
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.IOException;

public class Test073
{
	public static void main(String[] args) throws IOException
	{
		// CircleTest Ŭ���� ��� �ν��Ͻ� ����
		// CircleTest �ν��Ͻ� ����
		// CircleTest ��ü ����
		CircleTest circle = new CircleTest();
		// Test073 �� CircleTest �� ���� ���丮 �ȿ� �־
		// import ~~.CircleTest ���� �׳� ��ü ���� �� ����

		circle.input();
		// main() ���� ��ź(IOException)�� ���� �ִ� input()�� ȣ���ؼ�
		// main() �� ��ź�� ���Ѱ���
		// ==> main() �� ��ź �ٸ������� �� �ѱ� �غ� �ؾ���
		// throws IOException �������

		double circleArea = circle.calCircleArea();
		double circleLength = circle.calCircleLength();

		circle.print(circleArea, circleLength);
	}
}

// ���� ���
/*
������ �Է� : 10

>> �������� 10�� ����
>> ���� : 314.16
>> �ѷ� : 62.83
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/