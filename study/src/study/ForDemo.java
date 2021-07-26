package study;

public class ForDemo {
	public static void main(String[] args) {
		for ( int i =10; i>0; i--) {
			if (i==5) {
				continue;
			}
			System.out.println("Code!"+i);
		}
	}

}
