public class Q8_transpose_Matrix {
    public static void main(String[] args) {


        //creating a Matrix
        int a[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};


        //creating another matrix to store
        int trans[][] = new int[3][3];


        //Code for transpose
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                trans[i][j] = a[j][i]; //switch the position of i and j
            }
        }
    //to print out array
        System.out.println("Matrix without Transpose");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
        //print out transpose array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+trans[i][j]+"] ");
            }
            System.out.println();
        }

    }
}