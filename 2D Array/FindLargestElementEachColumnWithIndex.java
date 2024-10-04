public class FindLargestElementEachColumnWithIndex {
        public static void main(String[] args) {
            int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            for (int j = 0; j < arr[0].length; j++) {
                int max = arr[0][j];
                int rowIndex = 0;
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                        rowIndex = i;
                    }
                }
                System.out.println("Max element in column " + (j + 1) + ": " + max + " at index (" + rowIndex + ", " + j + ")");
            }
        }
    }
    

