package study;

public class MethodDemo {
	public static void numbering(String[] args) {
		int a = (int)args[0];
		for(int i; i<10; i++) {
			System.out.println(i+a);
		}
	}

	
	public static void main(String[] args) {
		for(int a=0; a<5; a++){
			numbering();
	}
	}
}
