package sample;

public class FinallyOne {

	public static void main(String[] args) {
			
		try {
			int x = 10/0;
			System.out.println(x);
		}catch(Exception e) {
			System.out.println("Error");
		}
		finally {
			System.out.println("releasing resources, i run always");
		}

	}

}
