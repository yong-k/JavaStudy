 /*================================
   ���� Ŭ������ �ν��Ͻ� ����
==================================*/

// Ŭ������ �ν��Ͻ� Ȱ��
/*
1 ~ 3 ������ ������ �߻����Ѽ� 
����, ����, �� ���� ���α׷��� �����Ѵ�.
��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

�� ���� ������ �� 1: ����, 2: ����, 3: ��

���� ��)
[[ 1:����  2:����  3:�� ]] �� �Է�(1 ~ 3) : 4
[[ 1:����  2:����  3:�� ]] �� �Է�(1 ~ 3) : -2
[[ 1:����  2:����  3:�� ]] �� �Է�(1 ~ 3) : 2

- ����   : ����
- ��ǻ�� : ��

>> �º� ���� ��� : ��ǻ�� WIN !
����Ϸ��� �ƹ� Ű�� ��������...
*/
import java.util.Random;
import java.util.Scanner;

class RpsGame2 
{
	private int user;
	private int com;

	// ��ǻ���� ����������
	private void runCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3) + 1;
	}

	// ������ ����������
	public void input()
	{
		// ������ ���������� �ϱ� ����, ��ǻ��(������) ���� ����������
		// => ������ �� ������ ���� �ϸ�,,,��v��,,,,!
		runCom();

		Scanner sc = new Scanner(System.in);
	
		do
		{
			System.out.print("[[ 1:����  2:����  3:�� ]] �� �Է�(1 ~ 3) : ");
			user = sc.nextInt();
		}
		while (user < 1 || user > 3);
	}

	// �߰� ��� ���
	public void middleCalc()
	{
		String[] str = { "����", "����", "��" };

		System.out.println();
		System.out.println("- ����   : " + str[user - 1]);
		System.out.println("- ��ǻ�� : " + str[com - 1]);
	}

	// �ºο� ���� ���� ��� ����
	public String resultCalc()
	{
		String result = "~ ���º� ~";

		if ((user == 1 && com == 3) || (user == 2 && com == 1)|| (user == 3 && com == 2))
			result = "���� WIN !";
		else if ((user == 1 && com == 2) || (user == 2 && com == 3)|| (user == 3 && com == 1))
			result = "��ǻ�� WIN !";

		return result;
	}

	public void print(String result)
	{
		System.out.println();
		System.out.printf(">> �º� ���� ��� : %s\n", result);
	}

}// end class RpsGame

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test104_teacher
{
	public static void main(String[] args)
	{
		RpsGame2 rps = new RpsGame2();
		rps.input();
		rps.middleCalc();
		String result = rps.resultCalc();
		rps.print(result);
		
	}
}

// ���� ���
/*

*/