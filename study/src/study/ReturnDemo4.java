package study;

public class ReturnDemo4 {
	public static String[] getMembers() {
		String[] members= {"최진현", "김제덕", "기보배"};
		return members;
	}
	public static void main(String[] args) {
		String[] members = getMembers();
		for (int i=0; i<3; i++) {
			System.out.println(members[i]);
	}
}
}
