package ot_array;

public class LoopDemo2 {

	public static String[] getMembers() {
		String[] members = { "������", "������", "���̶�" };
		return members;
	}

	public static void main(String[] args) {
		String[] members = getMembers();
		for (String e : members) {			
			System.out.println(e + "�� ����� �޾ҽ��ϴ�");
		}
	}

}
