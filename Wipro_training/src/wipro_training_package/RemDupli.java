package wipro_training_package;

public class RemDupli {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;

        int[] temp = new int[n];
        int k = 0;

        for(int i = 0; i < n; i++) {

            boolean isDuplicate = false;

            for(int j = 0; j < k; j++) {
                if(arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate) {
                temp[k] = arr[i];
                k++;
            }
        }

        System.out.println("After removing duplicates:");
        for(int i = 0; i < k; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
