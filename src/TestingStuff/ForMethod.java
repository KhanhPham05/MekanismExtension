package TestingStuff;

public class ForMethod {
	public static void main(String args[]) {
		for (int i=0; i <=20; i++) {
			if (i % 5 == 0 && i % 2 == 0){
				continue;
			}
			System.out.println(i);
		}
	}
}
