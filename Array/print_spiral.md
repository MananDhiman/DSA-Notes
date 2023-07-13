# 54. [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/description/)

# Code
```java
class Main{
    static void printSpiral(int endRow, int endCol, int a[][]){
        int i, startRow = 0, startCol = 0;

        while (startRow < endRow && startCol < endCol){
            // printing top row
            for(i = startCol; i< endCol; i++)
                System.out.print(a[startRow][i] + " ");

            startRow++;

            // printing right col
            for(i = startRow; i< endRow; i++)
                System.out.print(a[i][endCol - 1] + " ");

            endCol--;

            // printing bottom row
            if (startRow < endRow){
                for(i = endCol - 1; i>= startCol; --i)
                    System.out.print(a[endRow - 1][i] + " ");

                endRow--;
            }

            // printing left col
            if (startCol < endCol){
                for (i = endRow - 1; i >= startRow; --i)
                    System.out.print(a[i][startCol] + " ");

                startCol++;
            }
        }
    }

    public static void main(String[] args){
        // matrix is m * n (rows * cols)
        // m is no of rows OR no of elements
        // n is no of cols OR elements in one element
        // m = arr.length; n = arr[0].length

        int[][] arr = { {1,2,3,4},
                        {5,6,7,8},
                        {9, 10, 11,12},
                        {13,14,15,16} };

        printSpiral(arr.length, arr[0].length, arr);
    }
}
```