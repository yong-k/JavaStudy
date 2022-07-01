 /*=================================
   ���� Ŭ������ �ν��Ͻ� ����
===================================*/

// �� Test073.java ���ϰ� ��Ʈ ��

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest
{
	// ��� ���� �� �ֿ� �Ӽ�(������)
	int r;							// ������
	final double PI = 3.141592;		// ������ (������ ���ȭ)

	// ��� �޼ҵ� �� �ֿ� ���(����, ����)

	// ������ �Է� ��� �� �޼ҵ� ����
	void input() throws IOException
		// input() �� ȣ���ϴ� �޼ҵ忡 ��ź��(IOException) ������(���ѱ��) ��
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}

	// ���� ��� ��� �� �޼ҵ� ����
	double calCircleArea()
	{
		double circleArea = r * r * PI;

		return circleArea;
	}
	
	// �ѷ� ��� ��� �� �޼ҵ� ����
	double calCircleLength()
	{
		double circleLength = r * 2 * PI;

		return circleLength;
	}

	// ��� ��� �� �޼ҵ� ����
	void print(double circleArea, double circleLength)
	{
		System.out.println();
		System.out.printf(">> �������� %d�� ����\n", r);
		System.out.printf(">> ���� : %.2f\n", circleArea);
		System.out.printf(">> �ѷ� : %.2f\n", circleLength);
	}
}