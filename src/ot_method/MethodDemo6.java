package ot_method;

public class MethodDemo6 {
	public static String numbering(int init, int limit) {
		int i = init;
		// ��������� ���ڵ��� output�̶�� ������ ��� ���ؼ� ������ �� ���� �־����ϴ�.
		String output = "";
		while (i < limit) {
			// ���ڸ� ȭ�鿡 ����ϴ� ���  ���� output�� ��ҽ��ϴ�. 
			output += i;
			i++;
		}
		// �߿�!!! output�� ��� �ִ� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ��� �Ʒ��� ���� return Ű���� �ڿ� ��ȯ�Ϸ��� ���� ��ġ�ϸ� �˴ϴ�. 
		return output;
	}

	public static void main(String[] args) {
		// �޼ҵ� numbering�� ������ ���� ���� result�� ���ϴ�.   
		String result = numbering(1, 5);
		// ���� result�� ���� ȭ�鿡 ��� �մϴ�. 
		System.out.println(result);
	}
}
