 /*=================================
   ���� Ŭ������ �ν��Ͻ� ����
===================================*/

/*
����ڷκ��� ������ ������ �Է¹޾�
1���� �Է¹��� �������� ���� �����Ͽ�
������� ����ϴ� ���α׷��� �����Ѵ�.

��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
����, �Է� ó�� �������� BufferedReader �� ReadLine()�� ����ϸ�,
�Է� �����Ͱ� 1 ���� �۰ų� 1000 ���� ū ���
�ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

���� ��)
������ ���� �Է� (1~1000) : 1050
������ ���� �Է� (1~1000) : -45
������ ���� �Է� (1~1000) : 100
>> 1 ~ 100 ������ �� : 5050
����Ϸ��� �ƹ� Ű�� ��������...
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	int inputNum;

	// �Է� �޼ҵ� ����
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			inputNum = Integer.parseInt(br.readLine());
		}
		while (inputNum < 1 || inputNum > 1000);
	}
	
	// ���� ó�� �޼ҵ� ����
	int calSum()
	{
		int sum = 0;

		for (int i = 1; i <= inputNum; i++)
			sum += i;

		return sum;
	}

	// ��� �޼ҵ� ����
	void print(int sum)
	{
		System.out.printf(">> 1 ~ %d ������ �� : %d\n", inputNum, sum);
	}

}

public class Test074
{
	public static void main(String[] args) throws IOException
	{
		// Hap �ν��Ͻ� ����
		Hap hap = new Hap();

		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ�� �� input()
		// ----------------------
		//		�������� Ȱ��
		hap.input();

		// ������ �ν��Ͻ��� ���� ���� ó�� �޼ҵ� ȣ�� 
		int sum = hap.calSum();

		// ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��
		hap.print(sum);
			// int sum �Ⱦ��� 2�׳� �ٷ� �Ʒ�ó�� �ص� ��
		//hap.print(hap.calSum());
	}
}

// ���� ���
/*
������ ���� �Է�(1~1000) : 10500
������ ���� �Է�(1~1000) : -10500
������ ���� �Է�(1~1000) : 456456
������ ���� �Է�(1~1000) : 100
>> 1 ~ 100 ������ �� : 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/