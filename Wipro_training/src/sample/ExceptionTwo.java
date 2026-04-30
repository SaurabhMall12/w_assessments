package sample;

public class ExceptionTwo {

	public static void main(String[] args) {
		
		try {
		int arr[]= new int[4];
		arr[5] = 10;
		System.out.println(arr[2]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array error");
		}
		
		catch(Exception e){
			System.out.println("General error");
		}

	}

}
