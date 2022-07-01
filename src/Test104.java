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

class RpsGame 
{
	private int user, com;
	private String userRps, comRps;

	// ����� ����,����,�� int�� �Է�
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		while (user < 1 || user > 3)
		{
			System.out.print("[[ 1:����  2:����  3:�� ]] �� �Է�(1 ~ 3) : ");
			user = sc.nextInt();
		}
		
		if (user == 1)
			userRps = "����";
		else if (user == 2)
			userRps = "����";
		else
			userRps = "��";	
	}
	
	// ��ǻ�� ����,����,�� ���� �߻�
	public void randomCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3) + 1;		//-- 1 ~ 3 ���� �߻�

		if (com == 1)
			comRps = "����";
		else if (com == 2)
			comRps = "����";
		else
			comRps = "��";	
	}

	// user VS com �º� ����
	public String calRps()
	{
		String result;	//-- ���������� �º� ��� ����

		if (user == com)			
			result = "~ ���º� ~";
		else if ((user == 1 && com == 3) || (user == 2 && com == 1)|| (user == 3 && com == 2))
			result = "���� WIN !";
		else
			result = "��ǻ�� WIN !";

		return result;
	}

	public void print(String result)
	{
		System.out.println();
		System.out.printf("- ����   : %s\n", userRps);
		System.out.printf("- ��ǻ�� : %s\n", comRps);
		System.out.println();
		System.out.printf(">> �º� ���� ��� : %s\n", result);
	}
}

public class Test104
{
	public static void main(String[] args)
	{
		RpsGame rps = new RpsGame();
		rps.input();
		rps.randomCom();
		rps.print(rps.calRps());
	}
}

// ���� ���
/*
[[ 1:����  2:����  3:�� ]] �� �Է�(1 ~ 3) : 4
[[ 1:����  2:����  3:�� ]] �� �Է�(1 ~ 3) : 1

- ����   : ����
- ��ǻ�� : ��

>> �º� ���� ��� : ���� WIN !
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/