 /*===================
   ���� �迭 ����
=====================*/

// �迭�� ����� �ʱ�ȭ
// �迭�� �⺻�� Ȱ��
/*
��char�� �ڷ����� �迭�� �����
�� �迭�� �� �濡 ���ĺ� �빮�ڸ� ä���
ä���� �� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�.
��, ä��� ������ ����ϴ� ������ ���� �и��Ͽ� ó���Ѵ�.

���� ��)
A B C D E F G H I ... W X Y Z
����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test083
{
	public static void main(String[] args)
	{
		 char[] alphabet = new char[26];
		 int asciiValue = 65;

		 for (int i = 0; i < alphabet.length; i++)
		 {
			 alphabet[i] = (char)asciiValue;
			 asciiValue++;
		 }
		 // asciiValue����, asciiValue++ ������ for�� ���Ǿ��µ�
		 // �ᵵ ��

		 for (int i = 0; i < alphabet.length; i++)
			 System.out.print(alphabet[i] + " " );
		 System.out.println();
	}
}

// ���� ���
/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/