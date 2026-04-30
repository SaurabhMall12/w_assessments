package wipro_training_package;

public class ReturnMax {
    public static void main(String[] args) {

        int[][] a = {
            {1, 5, 3},
            {7, 2, 9},
            {4, 6, 8}
        };

        for(int i = 0; i < a.length; i++) {
            int max = a[i][0];

            for(int j = 1; j < a[i].length; j++) {
                if(a[i][j] > max) {
                    max = a[i][j];
                }
            }

            System.out.println("Row " + i + " max = " + max);
        }
    }
}