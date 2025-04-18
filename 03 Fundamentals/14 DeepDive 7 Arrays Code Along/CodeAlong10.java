public class CodeAlong10 {
    public static void main(String[] args) {
        int[][] arr2D = new int[10][10];
        // 2D array population
        int count = 1;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = count++;
            }
        }
        // invoke getRow method with row 3
        int[] row = getRow(arr2D, 3);
        // print the returned row
        if (row != null) {
            System.out.println("Row: ");
            for (int rowValues : row) {
                System.out.print(rowValues + " ");
            }
            System.out.println();
        }
        // Invoke getColumn method with column 5
        int[] column = getColumn(arr2D, 5);
        // print the returned column
        if (column != null) {
            System.out.println("Column: ");
            for (int columnValue : column) {
                System.out.print(columnValue + " ");
            }
            System.out.println();
        }
        // Invoke getCell method at row 5 and column 5
        int cell = getCell(arr2D, 5, 5);
        // Print the returned cell value
        if (cell != -1) {
            System.out.println("Cell: ");
            System.out.println(cell);
        }
    }

    // method to get the row in the 2D array
    public static int[] getRow(int[][] arr2D, int row) {
        if (row < 0 || row >= arr2D.length) {
            System.out.println("Error: Row " + row + " indexOutOfBound");
            return null;
        }
        return arr2D[row];
    }

    // method to get the column in the 2D array
    public static int[] getColumn(int[][] arr2D, int column) {
        if (column < 0 || column >= arr2D[0].length) {
            System.out.println("Error: Column " + column + " indexOutOfBound");
            return null;
        }
        int[] resultColumn = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            resultColumn[i] = arr2D[i][column];
        }
        return resultColumn;
    }

    // method to get a cell in the 2D array
    public static int getCell(int[][] arr2D, int row, int column) {
        if (row < 0 || row >= arr2D.length) {
            System.out.println("Error: Row " + row + " indexOutOfBound");
            return -1;
        } else if (column < 0 || column >= arr2D[0].length) {
            System.out.println("Error: Column " + column + " indexOutOfBound");
            return -1;
        }
        return arr2D[row][column];
    }
}
